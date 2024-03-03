
package reviewer_requiem_v2;

import java.util.ArrayList;

class Challenge extends Utilities{
    private int challengeID = 0000;
    private String title = "Default Challenge";
    private ArrayList<Question> questionList;

    private String difficulty = "Normal";
    //private String defaultMode;
    private int numOfQuestions;
    //private int lives;
    //private int timeLimit;

    public Challenge(int id, String name, ArrayList<Question> list){
        this.challengeID = id;
        this.title = name;
        this.questionList = list;
        numOfQuestions = questionList.size();
    }
    //setters
    public void setDifficulty(String difficulty){
        this.difficulty = difficulty;
    }
    
    public void addQuestion(Question newQuestion){
        questionList.add(newQuestion);
    }

    //getters
    public int getID(){
        return challengeID;
    }
    public String getTitle(){
        return title;
    }
    public ArrayList<Question> getQuestionList(){
        return questionList;
    }
    public String getDifficulty(){
        return difficulty;
    }
    public int getNumOfQuestions(){
        if(questionList.size() <= 0){
            return 0;
        }else{
            return numOfQuestions;
        }
        
    }

    //Show Methods
    public void showChallengeDetails(){
        println("[ "+challengeID+"\t| "+title+"\t| "+numOfQuestions+" questions \t| "+difficulty+" ]");
    }

    public void runChallenge(){
        

    }
}