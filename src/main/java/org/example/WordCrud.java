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

    @Override
    public int updateList(Object obj) {
        return 0;
    }

    @Override
    public int deleteList(Object obj) {
        return 0;
    }


    @Override
    public void selectWords(int id) {

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

    //function to display all the words that contain the letters the user input
    public ArrayList<Integer> displayList(String token) {
        ArrayList<Integer> idInfo = new ArrayList<>();
        int j = 0;
        System.out.println("--------------------------------");
        for(int i = 0; i < list.size(); i++) {
            String word = list.get(i).getVocab();
            //if the current word does not contain the letters, move on to the next
            if(!word.contains(token)) continue;
            System.out.print((j + 1) + " ");
            System.out.println(list.get(i).toString());
            idInfo.add(j);
            j++;
        }
        System.out.println("--------------------------------");
        return idInfo;
    }

    //Update function to update the defintion in the word list
    public void update() {
        System.out.print("=> 수정할 단어 검색: ");
        //take user input to find the words they are looking for
        String token = input.next();
        //pass the value of the user input to the displayList function
        ArrayList<Integer> idInfo = this.displayList(token);
        System.out.print("=> 수정할 번호 선택: ");
        //obtain the info of the id the user wants
        int id = input.nextInt();
        //this is so that the program does not skip any lines and waits for user input
        input.nextLine();
        System.out.print("=> 뜻 입력: ");
        //update the new definition the user wants
        String def = input.nextLine();
        //create Word class object and get assign it the id value user input
        Word word = list.get(idInfo.get(id-1));
        //change update the definition of the word
        word.setDef(def);
        System.out.println("단어가 수정되었습니다.");
    }

    public void delete() {
        System.out.print("=> 삭제할 단어 검색: ");
        //take user input to find the words they are looking for
        String token = input.next();
        //pass the value of the user input to the displayList function
        ArrayList<Integer> idInfo = this.displayList(token);
        System.out.print("=> 삭제할 번호 선택: ");
        //obtain the info of the id the user wants
        int id = input.nextInt();
        System.out.print("=> 정말로 삭제하실래요 (Y/N)? ");
        //this is to take user's answer of yes or no
        String userAnswer = input.next();
        if(userAnswer.equalsIgnoreCase("y")) {
            //if y then delete word and print success message
            list.remove((int)idInfo.get(id-1));
            System.out.println("단어가 삭제되었습니다!");
        }
        else {
            //print cancel message
            System.out.println("취소되었습니다.");
        }
    }
}
