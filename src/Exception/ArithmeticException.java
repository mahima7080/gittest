package Exception;


class ArithmeticExceptionss {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        try {
            int result=a/b;
            System.out.printf("%d",result);
        } catch (ArithmeticException e) {
            System.out.println("cant be dived by 0");
           // throw new ArithmeticException("cant be divideddddd by zero");
        }
        System.out.println("coninues");

    }
}
