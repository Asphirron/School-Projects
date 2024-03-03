
package reviewer_requiem_v2;

public class MultipleChoice extends Question{
    private String correctAnswer = "Default";
    private String userAnswer;
    
    public MultipleChoice(int id, String question) {
        super(id, question);
        type = "Multiple Choice";
    }
    public void setAnswers(String answer, String option1, String option2, String option3){
        this.correctAnswer = answer;
        this.answer[0] = correctAnswer;
        this.answer[1] = option1;
        this.answer[2] = option2;
        this.answer[3] = option3;
        
    }
    public void setAnswer(String answer){
        correctAnswer = answer; 
        this.answer[0] = correctAnswer;
    }
    
    
    
    @Override
    public boolean runQuestion(){
        
        return isCorrect;
    }
    
}
