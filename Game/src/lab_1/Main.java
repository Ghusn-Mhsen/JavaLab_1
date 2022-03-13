package lab_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        play hang_man = new Hang_man();
        play question_game = new Question_Game();
        int x = 0;
        System.out.println("press ( 1 ) to play Hang Man or press ( 2 ) to play Question game:");
        Scanner choice = new Scanner(System.in);
        x = choice.nextInt();
        switch (x) {
            case 1:
                hang_man.play_Game();
                break;
            case 2:
                question_game.play_Game();
                break;
            default:
                System.out.println("Wrong choice");
        }


    }
}
