import java.util.Scanner;

public class Kha1 {
    public static int[] addBookToLibraries(int n){
        Scanner sc = new Scanner(System.in);
        int [] book = new int[n];
        System.out.printf("Nhập mã số cho %d cuốn sách:\n", n);
        for (int i = 0; i < n; i++){
            System.out.printf("Sách thứ %d: ", i+1);
            book[i] = Integer.parseInt(sc.nextLine());
        }
        sc.close();
        return book;
    }

    public static void displayLibraries(int[] arr){
        System.out.print("Danh sách mã sách: ");
        for (int i = 0; i < arr.length; i++){
            System.out.printf("%d", arr[i]);
            if (i < arr.length - 1){
                System.out.print(",  ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng sách cần quản lý: ");
        int n = Integer.parseInt(sc.nextLine());
        int[] arr = addBookToLibraries(n);
        displayLibraries(arr);
        sc.close();
    }
}
