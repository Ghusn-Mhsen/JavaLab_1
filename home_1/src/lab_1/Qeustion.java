package lab_1;

import java.util.Queue;
import java.util.Scanner;

public class Qeustion {
    String Q;
    String[] Ans;
    int index;

    public Qeustion() {
        Q = "";
        Ans = new String[3];
        index = 0;

    }

    public Qeustion(String q, String[] ans, int index) {
        Q = q;
        Ans = ans;
        this.index = index;
    }

    public String getQ() {
        return Q;
    }

    public String[] getAns() {
        return Ans;
    }

    public int getIndex() {
        return index;
    }

    public Qeustion[] create()
    {
        Qeustion [] qus=new Qeustion[2];
        qus[0]=new Qeustion("the largest city in amarica:", new String[] {"as", "df", "hgg"} ,3);
        qus[1]=new Qeustion("the largest city in amarica:", new String[] {"as", "df", "hgg"} ,2);
        return qus;
    }
    public void play()
    {
        Qeustion [] qus=new Qeustion[2];
        qus=this.create();
        Scanner input=new Scanner(System.in);
        for(int i=0;i<3;i++)
        {

        }
    }

}
