package reviewer_requiem_v2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class DatabaseConnection extends Main{
    
    public DatabaseConnection(){
        // JDBC URL, username, and password of MySQL server

        String url = "jdbc:mysql://localhost:3306/reviewer_requiem";
        String user = "root";
        String password = "";

        try {
            // Establish the database connection
            Connection connection = DriverManager.getConnection(url, user, password);

            // SQL query to retrieve values from a table
            String query = "SELECT * FROM question";
            String cQuery = "SELECT * FROM challenge";
            String hQuery = "SELECT * FROM challenge_history";

            // Create a PreparedStatement
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                // Execute the query and get the ResultSet
                ResultSet resultSet = preparedStatement.executeQuery();

                // Process the ResultSet
                while (resultSet.next()) {
                    // Retrieve values from the ResultSet
                    int question_id = resultSet.getInt("question_id");
                    String question = resultSet.getString("question");
                    String type = resultSet.getString("type");
                    String difficulty = resultSet.getString("difficulty");
                    String correct_answer = resultSet.getString("correct_answer");
                    String option1 = resultSet.getString("option1");
                    String option2 = resultSet.getString("option2");
                    String option3 = resultSet.getString("option3");
                    
                    // Process the retrieved values
                    Question dbQuestion = new Question(question_id, question);
                    if(type.equalsIgnoreCase("Identification")){
                        dbQuestion = new Identification(question_id, question);
                    }
                    else if(type.equalsIgnoreCase("True or False")){
                        dbQuestion = new TrueOrFalse(question_id, question);
                    }
                    else if(type.equalsIgnoreCase("Multiple Choice")){
                        dbQuestion = new MultipleChoice(question_id, question);
                    }else{
                        
                    }
                    
                    dbQuestion.setType(type);
                    dbQuestion.setDifficulty(difficulty);
                    dbQuestion.setAnswers(correct_answer, option1, option2, option3);
                    questionBank.add(dbQuestion);
                    
                }
            }
            
            try (PreparedStatement preparedStatement2 = connection.prepareStatement(cQuery)) {
                // Execute the query and get the ResultSet
                ResultSet resultSet2 = preparedStatement2.executeQuery();
                

                // Process the ResultSet
                while (resultSet2.next()) {
                    ArrayList<Question> tempQList = new ArrayList<>();
                    // Retrieve values from the ResultSet
                    int challenge_id = resultSet2.getInt("challenge_id");
                    String title = resultSet2.getString("title");
                    String difficulty = resultSet2.getString("difficulty");
                    
                    String qListQuery = "SELECT question_id FROM question_list where challenge_id = " + challenge_id;
                    PreparedStatement pStatementQList= connection.prepareStatement(qListQuery);
                    ResultSet resultSet3 = pStatementQList.executeQuery();
                    while (resultSet3.next()){
                        int qListId = resultSet3.getInt("question_id");
                        for(Question ql : questionBank){
                            if(qListId == ql.getID()){
                                tempQList.add(ql);
                            }
                        }
                    }

                    // Process the retrieved values
                    Challenge dbChallenge = new Challenge(challenge_id, title, tempQList);
                    dbChallenge.setDifficulty(difficulty);
                    challengeList.add(dbChallenge);
                    
                }
            }
            //HISTORY
            try (PreparedStatement cHistoryPStatement = connection.prepareStatement(hQuery)) {
                // Execute the query and get the ResultSet
                ResultSet resultSet4 = cHistoryPStatement.executeQuery();

                // Process the ResultSet
                while (resultSet4.next()) {
                    int historyId = resultSet4.getInt("history_id");
                    Date dateValue = resultSet4.getDate("date_completed");
                    String dateCompleted = formatDateToString(dateValue);
                    String title= "";
                    int challengeID = resultSet4.getInt("challenge_id");
                    int score = resultSet4.getInt("score");
                    int maxItems = 0;
                    double percentage = resultSet4.getDouble("percentage");
                    String rating = resultSet4.getString("rating");
                    
                    for(Challenge cl : challengeList){
                        if(challengeID == cl.getID()){
                            title = cl.getTitle();
                            maxItems = cl.getNumOfQuestions();
                        }
                    }
                    
                    History newHistory = new History(historyId,title,dateCompleted,score,maxItems,percentage,rating);
                    challengeHistory.add(newHistory);
                
                
                }
                
            }

            // Close the connection
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }         
    }

    
}
