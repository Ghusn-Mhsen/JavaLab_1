package lab_1;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        student example=new student();
        example.add_to_file();
        example.Display_student();
    }
}
