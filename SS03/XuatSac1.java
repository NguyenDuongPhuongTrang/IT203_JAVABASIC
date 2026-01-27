import java.util.Scanner;

public class XuatSac1 {
    public static void displayBook (int[] arr, int n){
        System.out.printf("Kho sách hiện tại (%d cuốn): ", n);
        System.out.print("[ ");
        for (int i = 0; i < n; i++){
            System.out.printf("%d ", arr[i]);
        }
        System.out.print("]");
    }
    public static int deleteBook (int[] arr, int n, int bookId){
        if (bookId < 0 || bookId >= n){
            return n;
        }
        for (int i = 0; i < n-1; i++){
            arr[i] = arr[i+1];
        }
        return n-1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] book = {101, 102, 103, 104, 105};
        int n = book.length;
        displayBook(book, n);
        System.out.print("\nNhập mã sách cần xóa: ");
        int bookId = Integer.parseInt(sc.nextLine());
        int indexBook = 0;
        for (int i = 0; i < n; i++){
            if(bookId == book[i]){
                indexBook = i;
                break;
            }
        }
        n = deleteBook(book, n, indexBook);
        System.out.println("Đã xóa sách mã " + bookId);
        displayBook(book, n);
    }
}
