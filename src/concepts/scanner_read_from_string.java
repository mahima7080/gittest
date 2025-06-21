package concepts;

import java.util.Scanner;

public class scanner_read_from_string {
    public static void main(String[] args) {
        String name;int age;
        float f;
        String c;
        Scanner sc=new Scanner("mahima 25 3.14  chi");
        name=sc.next();

        age=sc.nextInt();
        f=sc.nextFloat();
        c= String.valueOf(sc.next().charAt(0));
        System.out.println(name);
        System.out.println(age);
        System.out.println(f);
        System.out.println(c);

        /*String input = "A"; // input string


    Scanner sc = new Scanner(input);

    // Read the next token (a string), and extract the first character
    char ch = sc.next().charAt(0);

    System.out.println("Character: " + ch);

    sc.close();
*/

    }
}
