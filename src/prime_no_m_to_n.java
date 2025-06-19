public class prime_no_m_to_n {
    public static void main(String[] args) {
        int i, num, count;

        // Checking for prime numbers
        for (num = 1; num <= 100; num++) {
            count = 0;
            for (i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    count++;
                    break;
                }
            }


            if (count == 0 && num != 1) {
                System.out.println(num);
            }
        }
    }
}
