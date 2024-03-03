
package reviewer_requiem_v2;

public class Question extends Utilities{
    protected int questionID = 0;
    protected String question = "Does not exist";
    protected String[] answer = {"","","",""};
    protected boolean isCorrect = false;
    protected String hint = "Hint unavailable";
    protected String type = "Default";
    protected String difficulty = "Normal";
    
    public Question(int id, String question){
        this.questionID = id;
        this.question = question;
    }
    
    
    //setters
    public void setID(int id){
        this.questionID = id;
    }
    public void setQuestion(String question){
        this.question = question;
    }
    public void setAnswers(String text, String text1, String text2, String text3){
       this.answer[0] = text;
       this.answer[1] = text1;
       this.answer[2] = text2;
       this.answer[3] = text3;
    }
    public void setAnswer(String[] answers){
        this.answer = answers;
    }
    public void setAnswer(String answer){
        this.answer[0] = answer;
    }
    public void setDifficulty(String diff){
    this.difficulty = diff;
    }
    public void setHint(String hint){
        this.hint = hint;
    }
    public void setType(String type){
        this.type = type;
    }
      
    //getters
    public int getID(){
        return questionID;
    }
    
    public String getQuestion(){
        return question;
    }
    public String[] getAnswers(){
        return answer;
    }
    public String getAnswer(){
        return answer[0];
    }
    public boolean isCorrect(){
        return isCorrect;
    }
    public String getType(){
        return type;
    }
    
    public String getDifficulty(){
        return difficulty;
    }
    
    public String getHint(){
        return hint;
    }

    public String toString(){
        return "ID: "+questionID+"\t| Question: "+question+"\t| Answer: "+answer[0]+"Type: "+type+"\t| Difficulty: "+difficulty;
    }
    
    //Functions
    public boolean runQuestion(){
        println("No questions stated");
        return false;
    }


}
