
package reviewer_requiem_v2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import java.awt.Rectangle;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

abstract class GUI extends Main{
    
    abstract JFrame createFrame(String title);

    abstract JButton createButton(String text);

    abstract JPanel createPanel();

    abstract JLabel createTextLabel(String text);

    abstract JTextField createTextField();

    public void setExitWarning(JFrame frame){
        frame.addWindowListener(new WindowAdapter() {
            @Override   
            public void windowClosing(WindowEvent e) {
                int choice = JOptionPane.showConfirmDialog(frame, "Are you sure you want to exit?",
                        "Close Confirmation", JOptionPane.YES_NO_OPTION);
                
                if (choice == JOptionPane.YES_OPTION) {
                    new DatabaseSaving();
                    System.exit(0);
                }
                // If user chooses NO, do nothing (cancel closing)
            }
        });

        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }
}

