
package reviewer_requiem_v2;

public class TrueOrFalse extends Question{
    private String userAnswer;
    
    public TrueOrFalse(int id, String question) {
        super(id, question);
        type = "True or False";
    }
    
    public void setAnswer(String[] answer){
        this.answer = answer;
    }
    
    public String getAnswer(){
     return answer[0];
    }
    
    @Override
    public boolean runQuestion(){
        return true;
    }
}
