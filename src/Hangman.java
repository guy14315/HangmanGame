public class Hangman {

    private String word;
    private String guessedLetters;
    private int attempsLeft;
    
    
    public Hangman() {
        this.word = word.toUpperCase();
        this.attempsLeft = 6;
        this.guessedLetters = "";
    }
    public boolean guessLetter(String letter) {
        letter = letter.toUpperCase();
        if (guessedLetters.contains(letter)) {
            return false;
        }
        guessedLetters += letter;
        if (!word.contains(letter)) {
            attempsLeft--;
            return false;
        }
        return true;
    }
    public String currentWordStatus() {
        StringBuilder currentWord = new StringBuilder();
        for (Character c : word.toCharArray()) {
            if (guessedLetters.contains(String.valueOf(c))) {
                currentWord.append(c);
            }
            else {
                currentWord.append("_");
            }
        }
        return currentWord.toString();
    }
    
    public int getAttempsLeft() {
        return attempsLeft;
    }

    public boolean isGameOver() {
        if (attempsLeft <= 0) {
            return true;
        }
        return false;
    }
}