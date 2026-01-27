public class XuatSac2 {

    public static int[] mergeBooks(int[] arr1, int[] arr2) {
        int[] newArr = new int[arr1.length + arr2.length];
        int index = 0;

        for (int i = 0; i < arr1.length; i++) {
            newArr[index++] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            boolean exists = false;
            for (int j = 0; j < index; j++) {
                if (arr2[i] == newArr[j]) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                newArr[index++] = arr2[i];
            }
        }

        int[] result = new int[index];
        for (int i = 0; i < index; i++) {
            result[i] = newArr[i];
        }

        for (int i = 0; i < result.length - 1; i++) {
            for (int j = 0; j < result.length - 1 - i; j++) {
                if (result[j] > result[j + 1]) {
                    int temp = result[j];
                    result[j] = result[j + 1];
                    result[j + 1] = temp;
                }
            }
        }

        return result;
    }

    public static void displayBook(int[] arr) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] arrayFirst = {1, 3, 5, 7, 9};
        int[] arraySecond = {2, 3, 5, 6, 8, 9, 10};

        int[] arrayMerge = mergeBooks(arrayFirst, arraySecond);

        System.out.print("Kho cũ: ");
        displayBook(arrayFirst);

        System.out.print("Lô mới: ");
        displayBook(arraySecond);

        System.out.print("Kho tổng (đã gộp & lọc trùng): ");
        displayBook(arrayMerge);
    }
}
