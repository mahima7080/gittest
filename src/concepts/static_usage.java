package concepts;

 class static_usage {
 int a;
 static {
     System.out.println("hi");
 }
    public static  void main(String[] args) {
        static_usage s=new static_usage();
        System.out.println(s.a);
    }
}
