public class Gioi1 {
    public static void maxQuantityOfBooks(String[] names, int[] quantities){
        int max = quantities[0];
        for (int i = 0; i < quantities.length; i++){
            if(quantities[i] > max){
                max = quantities[i];
            }
        }
        int count = 0;
        for (int i = 0; i < quantities.length; i++){
            if(quantities[i] == max){
                count++;
            }
        }
        int[] index = new int[count];
        int j = 0;
        for (int i = 0; i < quantities.length; i++){
            if (quantities[i] == max){
                index[j] = i;
                j++;
            }
        }
        System.out.printf("Sách có số lượng nhiều nhất (%d):\n", max);
        for (int i = 0; i < index.length; i++){
            System.out.printf("- %s\n", names[index[i]]);
        }
    }
    public static void minQuantityOfBooks(String[] names, int[] quantities){
        int min = quantities[0];
        for (int i = 0; i < quantities.length; i++){
            if(quantities[i] < min){
                min = quantities[i];
            }
        }
        int count = 0;
        for (int i = 0; i < quantities.length; i++){
            if(quantities[i] == min){
                count++;
            }
        }
        int[] index = new int[count];
        int j = 0;
        for (int i = 0; i < quantities.length; i++){
            if (quantities[i] == min){
                index[j] = i;
                j++;
            }
        }
        System.out.printf("Sách có số lượng ít nhất (%d):\n", min);
        for (int i = 0; i < index.length; i++){
            System.out.printf("- %s\n", names[index[i]]);
        }
    }
    public static void main(String[] args) {
        String[] names = {"Tư duy ngược", "Sói và bầy cừu", "Cô bé bán diêm", "Bầy thiên nga", "Hạt gạo"};
        int[] quantities = {10, 10, 2, 7, 3};
        maxQuantityOfBooks(names, quantities);
        minQuantityOfBooks(names, quantities);
    }
}
