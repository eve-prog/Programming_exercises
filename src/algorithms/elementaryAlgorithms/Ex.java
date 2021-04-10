package meditatii.pbInfo;

import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors

public class Ex {
    public static void main(String[] args) {
        try {
            File myObj = new File("E:\\JavaFundamentalsTim4-master\\src\\ziua2\\d\\Exercitii\\filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}






