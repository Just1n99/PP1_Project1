package org.example;
import java.util.Scanner;

public class WordManager {
    Scanner input = new Scanner(System.in);

    public int sMenu() {
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
                +"*******************************\n");

        return input.nextInt();
    }

    public void start() {
        while(true) {
            int menuNum = sMenu();

            if(menuNum == 4) {
                //add code to add vocabulary
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
