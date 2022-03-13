package lab_1;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Question_Game extends play {
    String qu;
    String[] a;
    int right_answer;

    public Question_Game() {
        this.qu = " ";
        this.a = null;
        this.right_answer = 0;

    }

    public Question_Game(String s, String[] s1, int x) {
        this.qu = s;
        this.a = s1;
        this.right_answer = x;

    }

    public Question_Game[] add_ques() {
        Question_Game[] Question = new Question_Game[4];
        Question_Game q1 = new Question_Game("6 + 8 =", new String[]{"5", "10", "14"}, 3);
        Question_Game q2 = new Question_Game("6 / 2 =", new String[]{"3", "44", "0"}, 1);
        Question_Game q3 = new Question_Game("6 * 6 =", new String[]{"1", "36", "44"}, 2);
        Question_Game q4 = new Question_Game("20 %2 =", new String[]{"22", "1", "0"}, 3);
        Question[0] = q1;
        Question[1] = q2;
        Question[2] = q3;
        Question[3] = q4;
        return Question;
    }

    public void printer() {
        System.out.println(this.qu);
        IntStream.range(0, 3).mapToObj(i -> (i + 1) + ": " + a[i]).forEach(System.out::println);
    }

    public void setQu(String qu) {
        this.qu = qu;
    }

    public void setA(String[] a) {
        this.a = a;
    }

    public void setRight_answer(int right_answer) {
        this.right_answer = right_answer;
    }

    public String getQu() {
        return qu;
    }

    public String[] getA() {
        return a;
    }

    public int getRight_answer() {
        return this.right_answer;
    }

    @Override
    public void play_Game() {
        Question_Game[] t = this.add_ques();
        int count = 0;
        for (Question_Game ques : t) {
            ques.printer();
            System.out.println("enter your choice please...:\n");
            Scanner input = new Scanner(System.in);
            int input_user = input.nextInt();

            if (input_user == ques.getRight_answer()) {
                count += 1;
                System.out.println("GOOD Choice");
            } else {
                System.out.println("FALSE Choice");
            }
        }
        System.out.println("CORRECT answer is:" + count);
    }
}
