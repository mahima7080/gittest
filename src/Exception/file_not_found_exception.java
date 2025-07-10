package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class file_not_found_exception {
    public static void main(String[] args) {
        try {
            File file=new File("C:/Users/Lavi/IdeaProjects/gittest/src/concepts/input_java.txt ");
            Scanner sc=new Scanner(file);
            System.out.println("file found");
            while (sc.hasNextLine())
            {

                String str=sc.nextLine();
                System.out.println(str);
            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }

    }
}
