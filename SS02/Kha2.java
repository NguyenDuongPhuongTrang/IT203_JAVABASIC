import java.util.Scanner;

public class Kha2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã khu vực (A, B, C, D): ");
        char code = sc.next().charAt(0);
        switch (code) {
            case 'A':
                System.out.println("Vị trí: Tầng 1 - Sách văn học");
                break;
            case 'B':
                System.out.println("Tầng 2: Sách Khoa học");
                break;
            case 'C':
                System.out.println("Tầng 3: Sách Ngoại ngữ");
                break;
            case 'D':
                System.out.println("Tầng 4: Sách Tin học");
                break;
            default:
                System.out.println("Mã nhập sai");
                break;
        }
        sc.close();
    }
}
