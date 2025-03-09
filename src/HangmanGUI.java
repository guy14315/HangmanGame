import javax.swing.*;

import java.awt.Color;
import java.util.List;

public class HangmanGUI extends JFrame {
    private final WordProvider wordPv;
    private int incorrectGuesses;
    private List<String> wordChallenge;
    private JLabel hangmanImage, categoryLabel;



    public HangmanGUI() {
        super("Hangman Depressed guy");
        setSize(CommonConstants.FRAME_SIZE);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);

        wordPv = new WordProvider();
        wordChallenge = wordPv.getCategory();

        addGuiComponents();

    }

    private void addGuiComponents() {
        hangmanImage = CustomTools.loadImage(CommonConstants.IMAGE_PATH);
        hangmanImage.setBounds(0, 0, hangmanImage.getPreferredSize().width, hangmanImage.getPreferredSize().height);

        categoryLabel = new JLabel(wordChallenge.get(0));
        categoryLabel.setHorizontalAlignment(SwingConstants.CENTER);
        categoryLabel.setOpaque(true);
        categoryLabel.setForeground(Color.WHITE);
        categoryLabel.setBackground((CommonConstants.SECONDARY_COLOR));
        categoryLabel.setBorder(BorderFactory.createLineBorder(CommonConstants.SECONDARY_COLOR));
        categoryLabel.setBounds(
            0, 
            hangmanImage.getPreferredSize().height - 28,
            CommonConstants.FRAME_SIZE.width,
            categoryLabel.getPreferredSize().height
        );

        getContentPane().add(categoryLabel);

        getContentPane().add(hangmanImage);
    }
}
