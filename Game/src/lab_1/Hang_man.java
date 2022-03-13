package lab_1;

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.*;

public class Hang_man extends play {
    String secret;
    String dis_secret;
    char input;
    int count;
    int pos;
    int count_right;
    boolean game_over = false;

    public Hang_man() {
        this.secret = "java";
        this.dis_secret = get_size(this.secret.length());
        this.count = 0;
        this.input = ' ';
        this.pos = 0;
        this.count_right = 0;
    }

    public static Scanner in = new Scanner(System.in);

    public void set(String secret) {
        this.secret = secret;
        this.dis_secret = get_size(this.secret.length());
    }


    public void print_str() {
        System.out.println(this.dis_secret);
    }

    public boolean End_Game() {
        return this.count == 6 || !(this.dis_secret.contains("*"));
    }

    public String replace_char(String word, int index, char c) {
        return word.substring(0, index) + c + word.substring(index + 1);
    }

    @Override
    public void play_Game() {
        while (!End_Game()) {
            System.out.print("enter charter:\n");
            this.input = in.nextLine().charAt(0);
            int index_char = this.secret.indexOf(input);
            if (!(index_char == -1)) {
                this.secret = this.replace_char(this.secret, index_char, '*');
                this.dis_secret = this.replace_char(this.dis_secret, index_char, input);
                this.print_str();
                System.out.println("GOOD Step");

            } else {
                System.out.println("FALSE");
                this.count += 1;
            }
            if (this.count >= 6) {
                System.out.println("you lose");
                game_over = true;


            }


        }

        if (!game_over) {
            System.out.println("you win");
            System.exit(1);
            this.print_str();
        }

    }

    public String get_size(int size) {
        char[] temp = new char[size];
        fill(temp, '*');
        return new String(temp);
    }
}
