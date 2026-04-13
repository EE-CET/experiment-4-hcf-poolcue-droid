import java.util.*;

public class HCF {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b;
        System.out.println("Enter the numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();

        int high, hcf = 1;

        if (a > b) {
            high = a;
        } else {
            high = b;
        }

        for (int i = high; i >= 1; i--) {
            if ((a % i == 0) && (b % i == 0)) {   
                hcf = i;
                break;
            }
        }

        System.out.println("HCF = " + hcf);
        sc.close();
    }
}