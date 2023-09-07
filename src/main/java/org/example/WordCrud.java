package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class WordCrud implements ICRUD {
    ArrayList<Word> list;
    Scanner input;

    //Constructor for WordCrud class
    WordCrud (Scanner input) {
        list = new ArrayList<>();
        this.input = input;
    }

    //Function to get the information of the new vocab
    @Override
    public Object add() {
        //Get the level and new vocab from user
        System.out.print("=> 난이도(1, 2, 3) & 새 단어 입력: ");
        int level = input.nextInt();
        String vocab = input.nextLine();

        //Get the definition from the user
        System.out.print("뜻 입력: ");
        String def = input.nextLine();

        return null;
    }
}
