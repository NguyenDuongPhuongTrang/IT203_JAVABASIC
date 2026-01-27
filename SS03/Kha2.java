import java.util.Scanner;

public class Kha2 {
    public static int searchBooks(String[] arr, String search) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(search)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] books = {"Harry Potter", "Đắc Nhân Tâm", "Nhà Giả Kim", "Cha Giàu Cha Nghèo", "Có công mài sắt có ngày nên kim"};
        System.out.print("Nhập tên sách cần tìm: ");
        String searchWord = sc.nextLine();
        int n = searchBooks(books, searchWord);
        if (n == -1){
            System.out.println("Sách không tồn tại");
        } else {
            System.out.printf("Tìm thấy sách ở vị trí %d", n);
        }
    }
}
