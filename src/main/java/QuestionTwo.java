import java.util.ArrayList;
import java.util.Scanner;

public class QuestionTwo {

    private static int findPrimeNumbersCount(int x) {
        if (x < 2) return 0;
        ArrayList<Integer> primes = new ArrayList();
        int ans = 0;
        for(int i = 2; i < x; i++) {
            boolean isPrime = true;
            for (Integer prime : primes) {
                if(i % prime == 0){
                    isPrime = false;
                    break;
                }
                if(prime * prime > i) {
                    break;
                }
            }
            if (isPrime) {
                ans++;
                primes.add(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("Enter number:");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int ans = findPrimeNumbersCount(x);
        System.out.println(ans);

    }
}
