package models;


import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Game {
    private String chosenWord = " ";
    private String [] wordBank =  {"apples", "bananas", "oranges", "pears"};
    private Random randomWordChooser = new Random();
    private List<Character> unusedLetters = new ArrayList<Character>();
    private List<Character> usedLetters = new ArrayList<Character>();

    public String generateWord(){
        int getPosition = randomWordChooser.nextInt(4);
        return wordBank[getPosition];
    }

    public void setWordChoice(String wordChoice){
       this.chosenWord = wordChoice;
    }

    public boolean letterCheck(char letterGuess){
        if (chosenWord.indexOf(letterGuess) == -1){
            unusedLetters.add(letterGuess);
            return false;
        } else{
            usedLetters.add(letterGuess);
            return true;
        }
    }

    public boolean lossCheck(){
        if(unusedLetters.size() >= 6){
            return true;
        } else {
            return false;
        }
    }


}

