package reviewer_requiem_v2;

import javax.swing.*;

public class MainMenu extends GUI {

    // Variables declaration 
    private JButton editorButton;
    private JPanel mainPanel;
    private JButton playButton;
    private JButton quitMenu;
    private JButton settingsButton;
    // End of variables declaration

    
    public MainMenu() {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                initComponents();
            }
        });
        
    }
    private void initComponents() {

        //Initializes the Components of the Frame
        mainMenuFrame = new JFrame("Reviewer Requiem");
        mainPanel = new JPanel();
        JLabel titleLabel = new JLabel();
        
        //Sets Main Menu Properties
        mainMenuFrame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        mainMenuFrame.setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        mainMenuFrame.setPreferredSize(new java.awt.Dimension(420, 340));
        mainMenuFrame.setResizable(false);
        mainMenuFrame.setSize(new java.awt.Dimension(420, 340));
        mainMenuFrame.setVisible(true);
        mainMenuFrame.setLocationRelativeTo(null);
        setExitWarning(mainMenuFrame);

        //Sets Main Panel Properties
        mainPanel.setBackground(new java.awt.Color(102, 102, 102));
        mainPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mainPanel.setMaximumSize(new java.awt.Dimension(420, 300));
        mainPanel.setMinimumSize(new java.awt.Dimension(420, 300));

        //Sets Title Properties
        titleLabel.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setText("REVIEVER REQUIEM");
        titleLabel.setFocusable(false);
        titleLabel.setName(""); // NOI18N

        //Sets the buttons and their Functions
        playButton = createButton("PLAY");
        playButton.addActionListener((p) -> {
            new PlayFrame();
            mainMenuFrame.setVisible(false);
        });

        editorButton = createButton("EDITOR");
        editorButton.addActionListener((e) -> {
           new EditorFrame();
           mainMenuFrame.setVisible(false);
        });

        settingsButton = createButton("SETTINGS");
        settingsButton.addActionListener((s) -> {
            JOptionPane.showMessageDialog(null, "Not implemented yet");
        });

        quitMenu = createButton("QUIT");
        quitMenu.addActionListener((q) -> {
            new DatabaseSaving();
            System.exit(0);
        });

        
        //Default Layout Manager from the IDE
        GroupLayout mainPanelLayout = new GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(playButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(titleLabel))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(editorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(settingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(quitMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(titleLabel)
                .addGap(32, 32, 32)
                .addComponent(playButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(settingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(quitMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        titleLabel.getAccessibleContext().setAccessibleName("titleLabel");

        GroupLayout layout = new javax.swing.GroupLayout(mainMenuFrame.getContentPane());
        mainMenuFrame.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        mainMenuFrame.getAccessibleContext().setAccessibleName("");
        mainMenuFrame.pack();
        
    }
    @Override
    JButton createButton(String title){
        JButton newButton = new JButton();
            newButton.setText(title);
            newButton.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
            newButton.setForeground(new java.awt.Color(51, 51, 51));
            newButton.setFocusable(false);
        return newButton;
    }
    @Override
    JFrame createFrame(String title) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createFrame'");
    }
    
    @Override
    JPanel createPanel() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createPanel'");
    }
    @Override
    JLabel createTextLabel(String text) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createTextLabel'");
    }
    @Override
    JTextField createTextField() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createTextField'");
    }
}
