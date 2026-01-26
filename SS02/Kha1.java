import java.util.Scanner;

public class Kha1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tuổi của bạn: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập số sách đang mượn: ");
        int borrowBook = Integer.parseInt(sc.nextLine());
        if (age >= 18 && borrowBook < 3) {
            System.out.println("Bạn ĐỦ ĐIỀU KIỆN mượn sách quý hiếm");
        }
        if (borrowBook >= 3) {
            System.out.println("Bạn đã mượn tối đa 3 cuốn sách");
        }
        if (age < 18) {
            System.out.println("Bạn phải đủ 18 tuổi trở lên");
        }
        sc.close();
    }
}
