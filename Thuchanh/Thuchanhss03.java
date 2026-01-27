import java.util.Scanner;

public class Thuchanhss03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số lượng phần tử: ");
        int n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            System.out.print("Nhập vào giá trị của mảng: ");
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.print("Mảng vừa nhập: ");
        for (int i = 0; i < n; i++){
            System.out.printf("%d ", arr[i]);
        }
        sc.close();
    }
}
