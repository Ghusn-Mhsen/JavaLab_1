package lab_1;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class student implements Serializable {
    int id;
    String name;
    ArrayList<student> per;


    public student(int id, String name) {
        this.id = id;
        this.name = name;
        per = null;
    }

    public student() {
        this.id = 0;
        this.name = "";
        per = null;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    void print_student() {
        System.out.println(" the student who Id begin with ( 9 ) is :   [" + this.id + "] and  Name is:    [" + this.name + "]");
    }

    public void add_to_list() {
        this.per = new ArrayList<student>();
        this.per.add(new student(19, "ali"));
        this.per.add(new student(1, "ahmad"));
        this.per.add(new student(99, "salim"));
        this.per.add(new student(10, "hind"));
        this.per.add(new student(89, "noor"));
        this.per.add(new student(9, "kaled"));
        this.per.add(new student(11, "ibrahim"));

    }

    public void add_to_file() throws IOException {

        try {
            FileOutputStream f = new FileOutputStream(new File("student.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);
            if (this.per == null)
                this.add_to_list();
            for (student x : this.per) {

                o.writeObject(x);
            }
            o.close();
            f.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void Display_student() throws IOException, ClassNotFoundException {

        FileInputStream fi = new FileInputStream(new File("student.txt"));
        ObjectInputStream oi = new ObjectInputStream(fi);

        for (int i = 0; i < this.per.size(); i++) {
            student x1 = (student) oi.readObject();
            if ((x1.getId() % 10) == 9) {
                x1.print_student();
            }
        }
        oi.close();
        fi.close();
    }
}
