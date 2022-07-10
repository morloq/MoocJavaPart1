import java.util.*;
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
           if(!(word.contains(letter)) && !(guessedLetters.contains(letter)))
           {
               numberOfFaults ++;
           }
           
        if(this.guessedLetters.length() > 0)
        {
            for (int k = 0; k < this.guessedLetters.length(); k++)
            {
                if(!(guessedLetters.contains(letter)))
                {
                    this.guessedLetters += letter;
                }
            }
        }
        else
            this.guessedLetters += letter;
    }

    public String hiddenWord() {
        // program here the functionality for building the hidden word
        String hiddenWord = "";
        char c;
        if(!this.guessedLetters.isEmpty())
        {
             c = this.guessedLetters.charAt(guessedLetters.length()-1);
        }
        else
            c = '_';
        for(int i = 0; i < this.word.length(); i++)
        {
            if(this.word.charAt(i) == c)
            {
                hiddenWord += this.word.charAt(i);
            }
            else
                hiddenWord += "_";
            
        }
        return hiddenWord;
    }
}