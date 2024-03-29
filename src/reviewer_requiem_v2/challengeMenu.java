
package reviewer_requiem_v2;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.*;

public class challengeMenu extends PlayFrame {
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JFrame playFrame;
    private javax.swing.JPanel challengePanel;
    private javax.swing.JLabel diffLbl;
    private javax.swing.JButton optionLbl1;
    private javax.swing.JButton optionLbl2;
    private javax.swing.JButton optionLbl3;
    private javax.swing.JButton optionLbl4;
    private javax.swing.JLabel questionHintLbl;
    private javax.swing.JLabel questionLbl;
    private javax.swing.JLabel questionNumberLbl;
    private javax.swing.JLabel questionTypeText;
    private javax.swing.JButton submitBtn;
    private javax.swing.JTextField submitTextField;
    private Challenge defChallenge;
    // End of variables declaration//GEN-END:variables
    /**
     * Creates new form challengeMenu
     */
    int questionNumber = 0;
    int numOfQuestions = 0;
    int correctAnswers = 0;
    String dateCompleted;

    ArrayList<Question> shuffledList;
    Question tempQuestion;
    public challengeMenu(Challenge defChallenge) {
        this.defChallenge = defChallenge;
        numOfQuestions = defChallenge.getNumOfQuestions();
           
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                initComponents();      
                
            }
        });
        

        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        playFrame = new JFrame("Play Menu");
        challengePanel = new javax.swing.JPanel();
        javax.swing.JPanel questionTypePanel = new javax.swing.JPanel();
        questionTypeText = new javax.swing.JLabel();
        questionNumberLbl = new javax.swing.JLabel();
        diffLbl = new javax.swing.JLabel();
        optionLbl2 = new javax.swing.JButton();
        submitBtn = new javax.swing.JButton();
        optionLbl1 = new javax.swing.JButton();
        optionLbl3 = new javax.swing.JButton();
        optionLbl4 = new javax.swing.JButton();
        questionLbl = new javax.swing.JLabel();
        questionHintLbl = new javax.swing.JLabel();
        submitTextField = new javax.swing.JTextField();

        playFrame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        playFrame.setResizable(false);
        playFrame.setVisible(true);

        challengePanel.setBackground(new java.awt.Color(102, 102, 102));

        questionTypePanel.setBackground(new java.awt.Color(0, 204, 255));
        questionTypePanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        questionTypeText.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        questionTypeText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        questionTypeText.setText("Question Type");
        questionTypeText.setToolTipText("This is the question type of this question.");

        javax.swing.GroupLayout questionTypePanelLayout = new javax.swing.GroupLayout(questionTypePanel);
        questionTypePanel.setLayout(questionTypePanelLayout);
        questionTypePanelLayout.setHorizontalGroup(
            questionTypePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(questionTypePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(questionTypeText, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                .addContainerGap())
        );
        questionTypePanelLayout.setVerticalGroup(
            questionTypePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(questionTypeText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        questionNumberLbl.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        questionNumberLbl.setForeground(new java.awt.Color(255, 255, 255));
        questionNumberLbl.setText("Question no. 1");

        diffLbl.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        diffLbl.setForeground(new java.awt.Color(255, 255, 102));
        diffLbl.setText("Normal");

        optionLbl2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        optionLbl2.setText("<html>Option 2/False</html>");
        optionLbl2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        optionLbl2.setFocusable(false);
        optionLbl2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionLbl2ActionPerformed(evt);
            }
        });

        submitBtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        submitBtn.setText("CONTINUE");
        submitBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        submitBtn.setFocusable(false);
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        optionLbl1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        optionLbl1.setText("<html>Option 1/True</html>");
        optionLbl1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        optionLbl1.setFocusable(false);
        optionLbl1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionLbl1ActionPerformed(evt);
            }
        });

        optionLbl3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        optionLbl3.setText("<html>Option 3</html>");
        optionLbl3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        optionLbl3.setFocusable(false);
        optionLbl3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionLbl3ActionPerformed(evt);
            }
        });

        optionLbl4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        optionLbl4.setText("<html>Option 4</html>");
        optionLbl4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        optionLbl4.setFocusable(false);
        optionLbl4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionLbl4ActionPerformed(evt);
            }
        });

        questionLbl.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        questionLbl.setForeground(new java.awt.Color(255, 255, 255));
        questionLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        questionLbl.setText("<html>This is the default question</html>");
        questionLbl.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        questionHintLbl.setBackground(new java.awt.Color(255, 255, 255));
        questionHintLbl.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        questionHintLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        questionHintLbl.setText("!");
        questionHintLbl.setToolTipText("This is a hint");
        questionHintLbl.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        questionHintLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        questionHintLbl.setOpaque(true);

        submitTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout challengePanelLayout = new javax.swing.GroupLayout(challengePanel);
        challengePanel.setLayout(challengePanelLayout);
        challengePanelLayout.setHorizontalGroup(
            challengePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(challengePanelLayout.createSequentialGroup()
                .addGroup(challengePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, challengePanelLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(challengePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(challengePanelLayout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(diffLbl))
                            .addComponent(questionTypePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(questionHintLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(challengePanelLayout.createSequentialGroup()
                        .addGroup(challengePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(challengePanelLayout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(challengePanelLayout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(questionNumberLbl))
                            .addGroup(challengePanelLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(questionLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(challengePanelLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(submitTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, challengePanelLayout.createSequentialGroup()
                .addGap(0, 18, Short.MAX_VALUE)
                .addGroup(challengePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(challengePanelLayout.createSequentialGroup()
                        .addComponent(optionLbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(optionLbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(challengePanelLayout.createSequentialGroup()
                        .addComponent(optionLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(optionLbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );
        challengePanelLayout.setVerticalGroup(
            challengePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(challengePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(challengePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(questionHintLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(questionTypePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(questionNumberLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(diffLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(questionLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(challengePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optionLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(optionLbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(challengePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optionLbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(optionLbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(submitTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(playFrame.getContentPane());
        playFrame.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(challengePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(challengePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        playFrame.pack();
        playFrame.setLocationRelativeTo(null);
        nextQuestion();
    }// </editor-fold>//GEN-END:initComponents

    
    private void optionLbl4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionLbl4ActionPerformed
        submitTextField.setVisible(true);
        submitBtn.setVisible(true);
        optionButtonInput(optionLbl4.getText());
        nextQuestion();
    }//GEN-LAST:event_optionLbl4ActionPerformed

    private void submitTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_submitTextFieldActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        submitFieldInput(submitTextField.getText());
        optionLbl1.setVisible(true);
        optionLbl2.setVisible(true);
        optionLbl3.setVisible(true);
        optionLbl4.setVisible(true);
        nextQuestion();
    }//GEN-LAST:event_submitBtnActionPerformed

    private void optionLbl1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionLbl1ActionPerformed
        if(tempQuestion.getType().equalsIgnoreCase("Multiple Choice")){
            submitTextField.setVisible(true);
            submitBtn.setVisible(true);
            
        }else if(tempQuestion.getType().equalsIgnoreCase("True Or False")){
            submitTextField.setVisible(true);
            submitBtn.setVisible(true);
            optionLbl3.setVisible(true);
            optionLbl4.setVisible(true);
        }
        optionButtonInput(optionLbl1.getText());
        nextQuestion();
        
    }//GEN-LAST:event_optionLbl1ActionPerformed

    private void optionLbl2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionLbl2ActionPerformed
        if(tempQuestion.getType().equalsIgnoreCase("Multiple Choice")){
            submitTextField.setVisible(true);
            submitBtn.setVisible(true);
            
        }else if(tempQuestion.getType().equalsIgnoreCase("True Or False")){
            submitTextField.setVisible(true);
            submitBtn.setVisible(true);
            optionLbl3.setVisible(true);
            optionLbl4.setVisible(true);
        }
        optionButtonInput(optionLbl2.getText());
        nextQuestion();
    }//GEN-LAST:event_optionLbl2ActionPerformed

    private void optionLbl3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionLbl3ActionPerformed
        submitTextField.setVisible(true);
        submitBtn.setVisible(true);
        optionButtonInput(optionLbl3.getText());
        nextQuestion();
    }//GEN-LAST:event_optionLbl3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(challengeMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(challengeMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(challengeMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(challengeMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        
    }

    
    
    private void nextQuestion(){
        
        if(numOfQuestions  > questionNumber){
            
            tempQuestion = defChallenge.getQuestionList().get(questionNumber);
            String type = tempQuestion.getType();
            questionTypeText.setText(type);
            questionNumberLbl.setText("Question No. "+(questionNumber+1));
            questionLbl.setText("<html>"+ tempQuestion.getQuestion()+ "</html>");
            diffLbl.setText(tempQuestion.getDifficulty());
            questionHintLbl.setText(tempQuestion.getHint());
            questionNumber++;
            if(type.equalsIgnoreCase("Identification")){
                playIdentification(tempQuestion);
                
            }if(type.equalsIgnoreCase("True or False")){
                playTrueOrFalse(tempQuestion);
                
            }if(type.equalsIgnoreCase("Multiple Choice")){
                playMultipleChoice(tempQuestion);
            }

        }else{
            double eval = getPercentage(correctAnswers, numOfQuestions);
            String rating = "Good";
            if(eval >= 90){
                rating = "Excellent";
            }else if(eval >= 80){
                rating = "Great";
            }else if(eval >= 70){
                rating = "Fair";
            }else if(eval >= 60){
                rating = "Poor";
            }
            
            History newHistory = new History(setChallengeID(challengeList), defChallenge.getTitle(),getDateAndTime(), correctAnswers, numOfQuestions, eval, rating);
            challengeHistory.add(newHistory);
            playFrame.dispose();
            
        }
    
    }

    
    
    private ArrayList<Question> shuffleList(ArrayList<Question> arrayList) {
        ArrayList<Question> list = new ArrayList<>(arrayList);
        Collections.shuffle(list);
        return new ArrayList<>(list);
    }
    private void submitQuestion(int mode){
        nextQuestion();
        if(mode == 1){
        nextQuestion();
        optionLbl1.setVisible(false);
        optionLbl2.setVisible(false);
        optionLbl3.setVisible(false);
        optionLbl4.setVisible(false);
        }
    }
    
    private void playIdentification(Question q){
        optionLbl1.setVisible(false);
        optionLbl2.setVisible(false);
        optionLbl3.setVisible(false);
        optionLbl4.setVisible(false);
    }
    private void playTrueOrFalse(Question q){
        submitTextField.setVisible(false);
        submitBtn.setVisible(false);
        optionLbl3.setVisible(false);
        optionLbl4.setVisible(false);
        
        optionLbl1.setText("True");
        optionLbl2.setText("False");
        
    }
    private void playMultipleChoice(Question q){
        submitTextField.setVisible(false);
        submitBtn.setVisible(false);
        
        String[] options = q.getAnswers();
        optionLbl1.setText(options[0]);
        optionLbl2.setText(options[1]);
        optionLbl3.setText(options[2]);
        optionLbl4.setText(options[3]);
        
    }
    
    private void optionButtonInput(String answer){
        
        if(answer.equalsIgnoreCase(tempQuestion.getAnswer())){
            correctAnswers++;
        }
    }
    
    private void submitFieldInput(String answer){
        
        if(answer.equalsIgnoreCase(tempQuestion.getAnswer())){
            correctAnswers++;
        }
    }

    

}
