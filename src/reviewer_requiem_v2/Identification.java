
package reviewer_requiem_v2;

import javax.swing.JOptionPane;

public class Identification extends Question{
    private String userAnswer;
    
    public Identification(int id, String question) {
        super(id, question);
        type = "Identification";
    }
    
    public void setAnswer(String[] answers){
        this.answer = answers;
    }
    public void setAnswer(String answer){
        this.answer[0] = answer;
    }
    
    @Override
    public boolean runQuestion(){
       return true;
    }
    
}
