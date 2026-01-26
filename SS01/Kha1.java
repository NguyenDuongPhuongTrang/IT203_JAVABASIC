import java.util.Scanner;

public class Kha1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập mã sách: ");
        String bookID = sc.nextLine();
        System.out.print("Nhập tên sách: ");
        String bookName = sc.nextLine();
        System.out.print("Nhập năm xuất bản: ");
        int publishYear = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập giá bìa: ");
        double price = Double.parseDouble(sc.nextLine());
        System.out.print("Sách còn trong kho (true/false): ");
        boolean isAvailable = Boolean.parseBoolean(sc.nextLine());

        System.out.println("\n --- PHIẾU THÔNG TIN SÁCH --- \n");
        System.out.printf("Tên sách: %s \n", bookName);
        System.out.printf("Mã số: %s | Tuổi thọ: %d năm \n", bookID, 2026 - publishYear);
        System.out.printf("Giá bán: %.2f \n", price);
        System.out.printf("Tình trạng: %s \n", isAvailable ? "Còn sách" : "Hết sách");

        sc.close();
    }
}