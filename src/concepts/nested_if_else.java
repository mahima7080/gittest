package concepts;

public class nested_if_else {
    public static void main(String[] args) {
        int marks = 85;

        if (marks >= 50)
        {
            System.out.println("You passed.");

            if (marks >= 75)
            {
                System.out.println("You got distinction.");
            }
            else
            {
                System.out.println("You got average marks.");
            }

        }
        else
        {
            System.out.println("You failed.");
        }
    }
}
