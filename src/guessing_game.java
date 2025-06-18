import java.util.Random;
import java.util.Scanner;

public class guessing_game {
    public static void main(String[] args) {
        Random r=new Random();
        int num_to_guess=r.nextInt(100);

        System.out.println(num_to_guess);
        Scanner sc=new Scanner(System.in);
        int attempts=0;
        int guess;
        while(true)
        {
            System.out.println("guess the nunber");
            guess=sc.nextInt();
            attempts++;
            if (guess<num_to_guess)
            {
                System.out.println("too low");
            }
            else if(guess>num_to_guess)
            {
                System.out.println("too high");
            }
            else
            {
                System.out.println("congratulations"+ "number found" + " you guess in" + attempts +" attempt");
                break;
            }
        }
    }
}
