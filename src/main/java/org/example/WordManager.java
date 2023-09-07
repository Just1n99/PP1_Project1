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
        //Continue to loop until the user inputs the exit code
        while(true) {
            int menuNum = sMenu();

            //If user input 4, call the addWord function
            if(menuNum == 4) {
                wc.addWord();
            }
            if(menuNum == 0){
                System.out.println("You have successfully terminated the program");
                System.exit(0);
            }
            else if(menuNum == 1) {
                //code to display the whole list
            }
        }
    }
}