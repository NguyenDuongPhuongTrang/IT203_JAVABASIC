import java.util.Scanner;

public class Gioi2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id;
        do {
            System.out.print("Nhập mã ID sách mới (ID > 0): ");
            id = Integer.parseInt(sc.nextLine());
            if (id < 0) {
                System.out.println("Lỗi: ID phải là số dương, Mời nhập lại!");
            } if (id == 0){
                System.out.println("Lỗi: ID phải lớn hơn 0, Mời nhập lại!");
            }else {
                System.out.printf("Mã sách %d đã được ghi nhận", id);
            }
        } while (id <= 0);
    }
}
