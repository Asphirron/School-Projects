
package reviewer_requiem_v2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.*;
/**
 *
 * @author BUENCONSEJO, Carl Daniel T.
 */ 
public class Main extends Utilities{
    static ArrayList<Challenge> challengeList;
    static ArrayList<History> challengeHistory;
    static ArrayList<Question> questionBank;
    protected JFrame mainMenuFrame;
    
    public static void main(String[] args) {
        
        Question q1 = new Question(0, "Default Question");
        challengeHistory = new ArrayList<>();
        //challengeHistory.add(new History(0, "About Space", getDateAndTime(), 0, 0, 0, ""));
        questionBank = new ArrayList<>();
        //questionBank.add(q1);
        challengeList = new ArrayList<>();
        //challengeList.add(new Challenge(0,"About Space", questionBank));
        new DatabaseConnection();
        
        

        
        
        
        
        new MainMenu();
        
       

    }

    public static ArrayList<Question> addRandomQuestion(ArrayList<Question> list, int numberOfQuestions) {
        int id = 0; 
            
        for (int i = 0; i < numberOfQuestions; i++) {
            id = setID(list);
            int randomNumber = generateRandomNumber(1, 3);
            Question randomQuestion = new Question(id, "");
            if(randomNumber == 1){
                randomQuestion = new Identification(id, generateRandomString(15));
            }else if(randomNumber == 2){
                randomQuestion = new TrueOrFalse(id, generateRandomString(15));
            }else if(randomNumber == 3){
                randomQuestion = new MultipleChoice(id, generateRandomString(15));
            }
            list.add(randomQuestion);
        }

        return list;
    }

    public static int setID(ArrayList<Question> question){
        int id = 0;
        boolean loop = true;
            while (loop) {
                for(Question idGet : question){
                    if(idGet.getID() == id){
                        id++;
                    }else{
                        loop = false;
                    }
                }
            }
        return id;
    }
    public static int setChallengeID(ArrayList<Challenge> challenge){
        int id = 0;
        boolean loop = true;
            while (loop) {
                for(Challenge idGet : challengeList){
                    if(idGet.getID() == id){
                        id++;
                    }else{
                        loop = false;
                    }
                }
            }
        return id;
    }
    public static int setHistoryID(ArrayList<History> history){
        int id = 0;
        boolean loop = true;
            while (loop) {
                for(History idGet : challengeHistory){
                    if(idGet.getID() == id){
                        id++;
                    }else{
                        loop = false;
                    }
                }
            }
        return id;
    }
    public static ArrayList<Question> sortQuestionsById(ArrayList<Question> questionList) {
        // Use Collections.sort to sort the ArrayList based on questionID
        Collections.sort(questionList, new Comparator<Question>() {
            @Override
            public int compare(Question q1, Question q2) {
                return Integer.compare(q1.getID(), q2.getID());
            }
        });

        return questionList;
    }


   
}
