import java.util.Scanner;

public class XuatSac2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int borrowBook = 0;
        int total = 0;
        int max = 0;
        int min = 0;
        int count = 0;
        for (int i = 2; i <= 8; i++){
            if (i == 8) {
                System.out.print("Nhập số lượt mượn sách ngày Chủ Nhật: ");
            } else {
                System.out.printf("Nhập số lượt mượn sách ngày Thứ %d: ", i);
            }

            borrowBook = Integer.parseInt(sc.nextLine());

            total += borrowBook;
            if (borrowBook == 0){
                continue;
            }else {
                count++;
            }

            if (count == 0) {
                min = borrowBook;
                max = borrowBook;
            } else {
                if (borrowBook > max) {
                    max = borrowBook;
                }
                if (borrowBook < min) {
                    min = borrowBook;
                }
            }
        }
        double avg = (double) total / count;
        System.out.printf("Lượt mượn cao nhất: %d\n", max);
        System.out.printf("Lượt mượn thấp nhất: %d\n", min);
        System.out.printf("Trung bình lượt mượn/ngày: %.2f", avg);
    }
}
