package Enum;

public class enum_main {

    public static void main(String[] args) {
        color en=color.red;
        System.out.println(en);

        switch (en)
        {
            case red:
                System.out.println("red color");
                break;
            case black:
                System.out.println("blacl color");
                break;
            default:
                System.out.println("invalid");
        }

        int e=color_hexa.red.getvalue();
        System.out.println(e);
    }
}
