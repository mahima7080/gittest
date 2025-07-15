package listt;


import java.util.ArrayList;

class Book{
    private int no;
    private String bookName;

    Book(int no,String bookName)
    {
        this.no=no;
        this.bookName=bookName;
    }

    String getterString()
    {
        return this.bookName;
    }

    int getterInt()
    {
        return this.no;
    }


}
public class program3 {
    public static void main(String[] args) {
        ArrayList<Book> l=new ArrayList<>();

        Book b1=new Book(101,"R d Sharma");
        Book b2=new Book(102,"KC Sinha");

        l.add(b1);
        l.add(b2);

        for (Book b:l)
        {
            System.out.print("\t"+ b.getterInt());
            System.out.print("\t"+b.getterString());
        }

    }


}
