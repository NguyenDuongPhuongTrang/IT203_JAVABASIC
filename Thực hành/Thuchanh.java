import java.util.Scanner;

public class Thuchanh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("1. Tổng:");
        int evenTotal = 0;
        int oddTotal = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                evenTotal += i;
            } else {
                oddTotal += i;
            }
        }
        System.out.printf("Tổng các số chẵn là: %d", evenTotal);
        System.out.printf("\nTổng các số lẻ là: %d", oddTotal);

        System.out.print("\nCác số hoàn hảo: ");
        boolean first = true;
        boolean flag = false;
        for (int i = 1; i < n; i++) {
            int divisorTotal = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    divisorTotal += j;
                }
            }
            if (divisorTotal == i) {
                flag = true;
                if (!first) {
                    System.out.print(", ");
                }
                System.out.printf("%d", i);
                first = false;
            }
        }
        if (!flag) System.out.print("Không có số hoàn hảo");

        System.out.print("\nGiai thừa của n: ");
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.printf("%d", factorial);

        System.out.println("\nKiểm tra số nguyên tố");
        int isPrime = 0;
        for (int i = 1; i <= n; i++){
            if(n % i == 0){
                isPrime++;
            }
        }
        if (isPrime == 2){
            System.out.printf("%d là số nguyên tố", n);
        }else {
            System.out.printf("%d không phải là số nguyên tố", n);
        }

        System.out.print("\nIn ra 100 số nguyên tố đầu tiên: ");
        int count = 0;
        int i = 2;
        while (count < 5){
            boolean isPrimeNew = true;
            if (i < 2) {
                isPrimeNew = false;
            } else if (i == 2) {
                isPrimeNew = true;
            } else if (i % 2 == 0) {
                isPrimeNew = false;
            } else {
                for (int j = 3; j <= Math.sqrt(i); j += 2) {
                    if (i % j == 0) {
                        isPrimeNew = false;
                        break;
                    }
                }
            }

            if (isPrimeNew) {
                count++;
                System.out.print(i);
                if (count < 5) System.out.print(", ");
            }

            i++;
        }
    }
}
