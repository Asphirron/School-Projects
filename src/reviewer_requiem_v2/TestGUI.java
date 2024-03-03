package reviewer_requiem_v2;

/*import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;*/

public class TestGUI {
    /*private JFrame frame;
    private JLabel questionLabel;
    private JRadioButton optionA, optionB, optionC, optionD;
    private ButtonGroup buttonGroup;
    private JButton submitButton;
    private int score = 0;

    // Questions and answers
    private String[] questions = {
            "What is the capital of France?",
            "Which planet is known as the Red Planet?",
            "Who wrote 'Romeo and Juliet'?",
    };
    private String[] correctAnswers = {"Paris", "Mars", "William Shakespeare"};
    private String[][] options = {
            {"Paris", "Berlin", "Madrid", "Rome"},
            {"Earth", "Mars", "Jupiter", "Saturn"},
            {"Charles Dickens", "Jane Austen", "William Shakespeare", "Mark Twain"}
    };

    private int currentQuestionIndex = 0;

    public TestGUI() {
        frame = new JFrame("Simple Quiz Program");
        frame.setLayout(new GridLayout(6, 1));

        questionLabel = new JLabel(questions[currentQuestionIndex], JLabel.CENTER);
        frame.add(questionLabel);

        optionA = new JRadioButton(options[currentQuestionIndex][0]);
        optionB = new JRadioButton(options[currentQuestionIndex][1]);
        optionC = new JRadioButton(options[currentQuestionIndex][2]);
        optionD = new JRadioButton(options[currentQuestionIndex][3]);

        buttonGroup = new ButtonGroup();
        buttonGroup.add(optionA);
        buttonGroup.add(optionB);
        buttonGroup.add(optionC);
        buttonGroup.add(optionD);

        frame.add(optionA);
        frame.add(optionB);
        frame.add(optionC);
        frame.add(optionD);

        submitButton = new JButton("Submit Answer");
        frame.add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkAnswer();
                nextQuestion();
            }
        });

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        centerFrameOnScreen();
        frame.setVisible(true);
    }

    private void checkAnswer() {
        String selectedAnswer = getSelectedAnswer();
        if (selectedAnswer.equals(correctAnswers[currentQuestionIndex])) {
            score++;
        }
    }

    private String getSelectedAnswer() {
        if (optionA.isSelected()) return optionA.getText();
        else if (optionB.isSelected()) return optionB.getText();
        else if (optionC.isSelected()) return optionC.getText();
        else if (optionD.isSelected()) return optionD.getText();
        else return "";
    }

    private void nextQuestion() {
        currentQuestionIndex++;

        if (currentQuestionIndex < questions.length) {
            questionLabel.setText(questions[currentQuestionIndex]);
            optionA.setText(options[currentQuestionIndex][0]);
            optionB.setText(options[currentQuestionIndex][1]);
            optionC.setText(options[currentQuestionIndex][2]);
            optionD.setText(options[currentQuestionIndex][3]);
            buttonGroup.clearSelection();
        } else {
            showResult();
        }
    }

    private void showResult() {
        JOptionPane.showMessageDialog(frame, "Quiz completed!\nYour score: " + score + " out of " + questions.length);
        System.exit(0);
    }

    private void centerFrameOnScreen() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int centerX = (int) (screenSize.getWidth() - frame.getWidth()) / 2;
        int centerY = (int) (screenSize.getHeight() - frame.getHeight()) / 2;
        frame.setLocation(centerX, centerY);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TestGUI();
            }
        });
    }
    */
}
