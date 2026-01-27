public class Gioi2 {
    public static int[] sortBooks(int[] arr){
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length - 1 - i; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }
        return arr;
    }
    public static void displayBooks(int[] arr){
        System.out.print("\nMảng sau khi sắp xếp: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d", arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
    }
    public static void main(String[] args) {
        int[] idBook = {105, 103, 102, 104, 101};
        System.out.print("Mảng trước khi sắp xếp: ");
        for (int i = 0; i < idBook.length; i++){
            System.out.printf("%d", idBook[i]);
            if (i < idBook.length - 1){
                System.out.print(", ");
            }
        }
        int[] afterSort = sortBooks(idBook);
        displayBooks(afterSort);
    }
}
