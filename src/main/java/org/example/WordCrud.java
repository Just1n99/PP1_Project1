package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class WordCrud implements ICRUD {
    //Use ArrayList to store all info of vocab
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
        int id;
        //Get the level and new vocab from user
        System.out.print("=> 난이도(1, 2, 3) & 새 단어 입력: ");
        int level = input.nextInt();
        String vocab = input.nextLine();

        //Get the definition from the user
        System.out.print("뜻 입력: ");
        String def = input.nextLine();

        return new Word(id = 0, level, vocab, def);
    }

    public void addWord() {
        Word added = (Word)add();
        list.add(added);
        System.out.println("새 단어가 단어장에 추가되었습니다!!");
    }
    public void displayList() {
        System.out.println("--------------------------------");
        for(int i = 0; i < list.size(); i++) {
            System.out.print((i + 1) + " ");
            System.out.println(list.get(i).toString());
        }
        System.out.println("--------------------------------");
    }
    public void update() {
        System.out.print("=> 수정할 단어 검색: ");
        String token = input.next();

    }
}
