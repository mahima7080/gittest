public class prime_no_m_to_n {
    public static void main(String[] args) {
        int i;
        int m = 1, n = 10;


        for (i = m; i <= n; i++) {
            int count = 0; // Moved inside the loop to reset for each i

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.println(i);
            }
        }
    }
    }