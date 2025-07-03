package stringss;

public class no_of_words {
    public static void main(String[] args) {
        String str="   my name is      mahi  sri  ";
        int words=0;
        str=str.trim();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' '&& str.charAt(i+1)!=' ')
            {
                words++;
            }
        }
        System.out.println(words+1);
    }
}
