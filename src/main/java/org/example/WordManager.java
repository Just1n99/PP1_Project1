package org.example;
import java.util.Scanner;

public class WordManager {
    Scanner input = new Scanner(System.in);
    WordCrud wc;

    //Constructor for WordManager that has WordCrud object
    public WordManager() {
        wc = new WordCrud(input);
    }

    public int sMenu() {
        //Display the menu list for user
        System.out.println("*** 영단어 마스터 ***");
        System.out.print("*******************************\n"
                + "1. 모든 단어 보기\n"
                + "2. 수준별 단어 보기\n"
                + "3. 단어 검색\n"
                + "4. 단어 추가\n"
                + "5. 단어 수정\n"
                + "6. 단어 삭제\n"
                + "7. 파일 저장\n"
                + "0. 나가기\n"
                +"*******************************\n"
                + "=> 원하는 메뉴는? ");

        //Return the number the user has input
        return input.nextInt();
    }

    public void start() {
        //call the loadFile function so we can read the file before the loop
        wc.loadFile();
        //Continue to loop until the user inputs the exit code
        while(true) {
            int menuNum = sMenu();

            //If user inputs 4, call the addWord function
            if(menuNum == 4) {
                wc.addWord();
            }
            //If user inputs 0, display message and exit program
            if(menuNum == 0){
                System.out.println("You have successfully terminated the program. GoodBye!");
                System.exit(0);
            }
            if(menuNum == 2)
                wc.searchLevel();

            if(menuNum == 3) {
                //Code to search for word in list
            }
            //if user inputs 5, call the update function
            if(menuNum == 5) {
                wc.update();
            }
            //if user inputs 6, call the delete function
            if(menuNum == 6){
                wc.delete();
            }
            //if user inputs 7, call the saveFile function
            if(menuNum == 7) {
                wc.saveFile();
            }
            //If user inputs 1, call the displayList function
            else if(menuNum == 1) {
                wc.displayList();
            }
        }
    }
}
