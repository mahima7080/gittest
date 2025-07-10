package Encapsulation;


import java.util.Scanner;
/**
 *
 * my definition
 * Encapsulation means wrapping of data into single unit by  controlling the access of data member and data function using access modifier.
 Encapsulation in Java means:

 "Hiding internal details of a class and only exposing necessary parts through methods."

 It is done using:

 private data members (data hiding)

 public or package-private


 Think of it like keeping your valuables in a locker. Only you (or people you trust)
have the key to open it. You don’t let just anyone open it or change what's inside.

💬 Simple Example from Instagram
Let’s say Instagram has a class called Userdetail. This class stores:

your username

email

password

But Instagram doesn't let just anyone or anything change your password directly.
Instead, it uses setters and getters — special functions that control access.






 Haripriya Gurajapu
 50m

 QA Automation Engineer
 Sir if we can anyways retrieve the values of private methods through getter setter then what is the is the difference.
 Like anyways using gwt method user can access the attributes right


 Like
 Reply
 Mahima Srivastava
 15m
 Haripriya Gurajapu By making the data member private, you are implementing encapsulation…..
 if you don't make it private  anyone outside the class can access data member……by making it private ,
 you are controlling the access, who can access the data member by applying  validation, ……….as sir told in today’s
 class only admin can set  the password….. if you are not admin it will cancel the set password request ……………and if we don’t
 make password private anyone outside the class can set the password.

 In short, encapsulation protects your data and gives you full control over how it's used.

 See more

 Mahima Srivastava

 Haripriya Gurajapu -you can see real-life example of encapsulation in instagram………by making your instagram account private, you are
 allowing only your followers can see the content of your profile……………anyone who is not in your follower list can’t access your account
 ………..this  how your are controlling access by applying validation…..validation=only followers…………
 otherwise if your account is public it is accessible  by everyone who is on instagram.


 */
 class InstagramUser {
    // Private data members
    private String username;
    private String password;

    // Constructor
    public InstagramUser(String username) {
        this.username = username;
    }

    // Method to validate user
    public boolean isValidUser(String inputUsername) {
        return this.username.equals(inputUsername);
    }

    // Method to set password with validation
    public void setPassword(String inputUsername, String newPassword) {
        if (isValidUser(inputUsername))
        {
            if (newPassword.length() >= 6)
            {
                this.password = newPassword;
                System.out.println("✅ Password set successfully for " + username);
            } else
            {
                System.out.println("❌ Password too short! Must be at least 6 characters.");
            }
        }
        else
        {
            System.out.println("❌ Invalid user. Cannot set password.");
        }
    }

    // Password getter (optional — for security, we don't return the actual password)
    public String getPassword() {
        return "Access Denied! You cannot view the password.";
    }
}

public class encapsulation {
    public static void main(String[] args) {
        // Create a user with a predefined username
        InstagramUser user = new InstagramUser("john_doe");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String inputUsername = scanner.nextLine();

        System.out.print("Enter your new password: ");
        String newPassword = scanner.nextLine();

        // Try to set the password
        user.setPassword(inputUsername, newPassword);

        // Try to view the password
        System.out.println(user.getPassword());}
}
