import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;

public class MainMenu extends JFrame {
    JLabel titleLabel;
    JPanel buttonPanel;
    JButton startButton, exitButton;


    public MainMenu() {
        setTitle("HANGMAN - MENU");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(CommonConstants.FRAME_SIZE);
        setLayout(new BorderLayout());
        setResizable(false);
        setVisible(true);
        setLocationRelativeTo(null);
        
        titleLabel = new JLabel("HANGMAN",SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial",Font.BOLD,24));
        add(titleLabel,BorderLayout.NORTH);
        
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4,1,50,100));
        
        startButton = new JButton("PLAY");
        startButton.setFont(new Font("Arial",Font.PLAIN,18));
        startButton.setPreferredSize(CommonConstants.MENU_BOTTON_SIZE);
        startButton.addActionListener(e -> {
            dispose();
            new HangmanGUI();
        });

        exitButton = new JButton("EXIT");
        exitButton.setFont(new Font("Arial",Font.PLAIN,18));
        exitButton.setPreferredSize(CommonConstants.MENU_BOTTON_SIZE);
        exitButton.addActionListener(e -> System.exit(0));

        buttonPanel.add(startButton);
        buttonPanel.add(exitButton);
        add(buttonPanel,BorderLayout.CENTER);

    }
}
