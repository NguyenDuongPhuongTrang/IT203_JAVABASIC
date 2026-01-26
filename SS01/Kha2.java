import java.util.Scanner;

public class Kha2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số ngày chậm: ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập số lượng sách mượn: ");
        int m = Integer.parseInt(sc.nextLine());
        double total = n * m * 5000;
        System.out.printf("Tiền phạt gốc: %.1f \n", total);
        if (n > 7 && m >= 3) total = total + total * 0.2;
        System.out.printf("Tiền phạt sau điều chỉnh: %.1f \n", total);
        if (total > 50000) {
            System.out.println("Yêu cầu khóa thẻ: true");
        }else {
            System.out.println("Yêu cầu khóa thẻ: false");
        }

        sc.close();
    }
}
