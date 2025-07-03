package Encapsulation;
import java.util.Arrays;
class Instagram_account
{

    private String user_name;
    private String[] followers={"pooja","shweta","tanya","Anjali"};
    private String[] post={"post 1","post2","post3"};
    private boolean is_private;
    Instagram_account(String user_name,boolean is_private)
    {
        this.user_name=user_name;
        this.is_private=is_private;

    }

    String[] getter()
    {if ( is_private) {
        if (myfollwer_or_not("manjari")) {
            System.out.println("hi");
            return post;
        }
    }
        return new String[]{"not","allowed"};
    }
    void addfollwers(String newfollwers)
    {
        String[] new_str_arr=new String[followers.length+1];
        for (int i=0;i<followers.length;i++)
        {
            new_str_arr[i]=followers[i];
        }
        new_str_arr[followers.length]=newfollwers;
        followers=new_str_arr;     //assigning array to array;
        System.out.println(followers[followers.length-1]);
    }
 boolean myfollwer_or_not(String follower_name)
 {
     if (!is_private)
     {
         return true;
     }
     for(int i=0;i<followers.length;i++)
     {
         if (followers[i].equals(follower_name))
         {

             return true;
         }
     }
     return false;

 }
}

public class encapsulation_2 {
    public static void main(String[] args) {
        Instagram_account user=new Instagram_account("mahima001",true);

        boolean b=user.myfollwer_or_not("prateeksha");
        if (b)
        {
            System.out.println("can see my profile");
        }
        else {
            System.out.println("cannot  see my profile");
        }

        user.addfollwers("roma");

        System.out.println(Arrays.toString(user.getter()).replace("["," ").replace("]"," ")
                .replace(","," ").replace(","," "));

    }
}
