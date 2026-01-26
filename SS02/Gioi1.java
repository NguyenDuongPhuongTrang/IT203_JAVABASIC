import java.util.Scanner;

public class Gioi1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng sách trả muộn: ");
        int n = Integer.parseInt(sc.nextLine());
        int total = 0;
        for(int i = 0; i < n; i++){
            System.out.print("Nhập số ngày trễ của cuốn thứ " + (i + 1) + ": ");
            int day = Integer.parseInt(sc.nextLine());
            total += day * 5000;
        }
        System.out.printf("==> Tổng tiền phạt: %d", total);
        sc.close();
    }
}
