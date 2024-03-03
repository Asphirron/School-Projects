package reviewer_requiem_v2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class DatabaseSaving extends Main {

    private static final String url = "jdbc:mysql://localhost:3306/reviewer_requiem";
    private static final String user = "root";
    private static final String password = "";
    private static final String tableName = "question";

    public DatabaseSaving() {
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            //deleteAllData(connection, "question");
            //deleteAllData(connection, "challenge");
            //deleteAllData(connection, "question_list");

            String saveQuestion = "INSERT INTO " + "question" + " VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            String saveChallenge = "INSERT INTO " + "challenge" + " VALUES (?, ?, ?)";
            String saveQlist = "INSERT INTO " + "question_list" + " VALUES (?, ?)";
            String saveHistory = "INSERT INTO " + "question_list" + " VALUES (?, ?)";


            //QUESTIONS
            for (Question q : questionBank) {
                String[] aList = q.getAnswers();
                try (PreparedStatement preparedStatement = connection.prepareStatement(saveQuestion)) {
                    preparedStatement.setInt(1, q.getID());
                    preparedStatement.setString(2, q.getQuestion());
                    preparedStatement.setString(3, q.getType());
                    preparedStatement.setString(4, q.getDifficulty());
                    preparedStatement.setString(5, aList[0]);
                    preparedStatement.setString(6, aList[1]);
                    preparedStatement.setString(7, aList[2]);
                    preparedStatement.setString(8, aList[3]);

                    preparedStatement.executeUpdate();
                    
                    
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                
            }
            
            //CHALLENGES
            for (Challenge c : challengeList) {
                try (PreparedStatement preparedStatement2 = connection.prepareStatement(saveChallenge)) {
                    preparedStatement2.setInt(1, c.getID());
                    preparedStatement2.setString(2, c.getTitle());
                    preparedStatement2.setString(3, c.getDifficulty());
                    
                    for(Question ql : c.getQuestionList()){
                        PreparedStatement preparedStatement3 = connection.prepareStatement(saveQlist);
                        preparedStatement3.setInt(1, c.getID());
                        preparedStatement3.setInt(1, ql.getID());
                        
                        preparedStatement3.executeUpdate();     
                    }
                    
                    preparedStatement2.executeUpdate();
                    
                    
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                
            }
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }

    private static void deleteAllData(Connection connection, String dbName) throws SQLException {
        String deleteQuery = "DELETE FROM " + dbName;
        try (PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery)) {
            preparedStatement.executeUpdate();
        }
    }
}
