
package reviewer_requiem_v2;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class PlayFrame extends MainMenu {
    // Variables declaration
    private JFrame playMenu;
    private JButton backButton;
    private JScrollPane historyScrollPanel;
    private JTable historyTable;
    private JPanel playListPanel;
    private JScrollPane playListScrollPane;
    private JTabbedPane playListTabPane;
    private JTable playListTable;
    private JPanel playMainPanel;
    private JButton startChallengeBtn;
    // End of variables declaration

    public PlayFrame() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                initComponents();
                updateTables();
            }
        });
    }

    private void initComponents() {

        playMenu = new JFrame("Play Menu");
        playMainPanel = new JPanel();
        playListTabPane = new JTabbedPane();
        playListPanel = new JPanel();
        playListScrollPane = new JScrollPane();
        playListTable = new JTable();
        historyScrollPanel = new JScrollPane();
        historyTable = new JTable();

        playMenu.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        playMenu.setResizable(false);
        playMenu.setVisible(true);
        

        playMainPanel.setBackground(new java.awt.Color(102, 102, 102));

        startChallengeBtn = createButton("Start Challenge", "Plays the selected Challenge");
        startChallengeBtn.setBackground(new java.awt.Color(102, 102, 102));
        startChallengeBtn.setFont(new java.awt.Font("Dialog", 1, 14));
        startChallengeBtn.setForeground(new java.awt.Color(255, 255, 255));
        startChallengeBtn.addActionListener((s) -> {

            int selectedRow = playListTable.getSelectedRow();
            DefaultTableModel model = (DefaultTableModel) playListTable.getModel();
            
            for(Challenge c : challengeList){
                if(c.getID() == objToInt(model.getValueAt(selectedRow, 0))){
                    new challengeMenu(c);
                }
            }
        });



        playListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Title", "No. of Questions", "Difficulty"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        playListScrollPane.setViewportView(playListTable);
        if (playListTable.getColumnModel().getColumnCount() > 0) {
            playListTable.getColumnModel().getColumn(0).setMinWidth(150);
            playListTable.getColumnModel().getColumn(0).setPreferredWidth(150);
            playListTable.getColumnModel().getColumn(0).setMaxWidth(150);
        }

        GroupLayout playListPanelLayout = new GroupLayout(playListPanel);
        playListPanel.setLayout(playListPanelLayout);
        playListPanelLayout.setHorizontalGroup(
            playListPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(playListPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(playListPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(playListPanelLayout.createSequentialGroup()
                        .addGap(0, 484, Short.MAX_VALUE)
                        .addComponent(startChallengeBtn, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE))
                    .addComponent(playListScrollPane))
                .addContainerGap())
        );
        playListPanelLayout.setVerticalGroup(
            playListPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, playListPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(playListScrollPane, GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(startChallengeBtn, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        playListTabPane.addTab("Challenges", playListPanel);

        historyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date Completed", "ID", "Title", "Score", "Percentage", "Rating", "Time Elapsed"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        historyTable.getTableHeader().setReorderingAllowed(false);
        historyScrollPanel.setViewportView(historyTable);
        if (historyTable.getColumnModel().getColumnCount() > 0) {
            historyTable.getColumnModel().getColumn(0).setMinWidth(150);
            historyTable.getColumnModel().getColumn(0).setPreferredWidth(150);
            historyTable.getColumnModel().getColumn(0).setMaxWidth(150);
        }

        playListTabPane.addTab("History", historyScrollPanel);

        backButton = createButton("Back", "Return to main menu");
        backButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        backButton.setBackground(new java.awt.Color(102, 102, 102));
        backButton.setFont(new java.awt.Font("Dialog", 1, 14));
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.addActionListener((b) -> {
           playMenu.setVisible(false);
           playMenu.dispose();
        });

        GroupLayout playMainPanelLayout = new GroupLayout(playMainPanel);
        playMainPanel.setLayout(playMainPanelLayout);
        playMainPanelLayout.setHorizontalGroup(
            playMainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(playMainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(playMainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(playListTabPane)
                    .addGroup(playMainPanelLayout.createSequentialGroup()
                        .addComponent(backButton, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        playMainPanelLayout.setVerticalGroup(
            playMainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(playMainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(playListTabPane, GroupLayout.PREFERRED_SIZE, 346, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(backButton)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(playMenu.getContentPane());
        playMenu.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(playMainPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(playMainPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        playMenu.pack();playMenu.setLocationRelativeTo(null);
        
    }

    JButton createButton(String text, String toolTip){
        JButton newButton = new JButton(text);
        newButton.setText(text);
        newButton.setToolTipText(toolTip);
        newButton.setBorder(BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        newButton.setFocusable(false);
        return newButton;
    }

    private void updateTables() {
        for(Challenge c : challengeList){
            
            Object[] rowData = {c.getID(), c.getTitle(), c.getNumOfQuestions(), c.getDifficulty()};
            DefaultTableModel model = (DefaultTableModel) playListTable.getModel();
            model.addRow(rowData);       
        }
        for(History h : challengeHistory){
            
            Object[] rowData1 = {h.getDate(), h.getID(), h.getName(), h.getScore(), shortenDecimal(h.getPercentage())+"%", h.getRating()};
            DefaultTableModel model1 = (DefaultTableModel) historyTable.getModel();
            model1.addRow(rowData1);       
        }
        
    }

    private int objToInt(Object obj){
        int intValue = 0;
        if (obj != null && obj instanceof Integer) {
            // Convert the object to int using intValue()
            intValue = ((Integer) obj).intValue();
        }
        return intValue;
    }
    

}
