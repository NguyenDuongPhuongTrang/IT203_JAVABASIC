public class Gioi1 {
    public static void main(String[] args) {

        String book1 = "Java Basic";
        String book2 = "Python Intro";
        // temp lưu địa chỉ của book1 trên stack
        String temp = book1;
        // book1 trỏ đến book2 và lưu địa chỉ book2 trên stack
        book1 = book2;
        // book2 trỏ đến địa chỉ mà biến temp đang lưu trên stack
        book2 = temp;
        // Chỉ hoán đổi tham chiếu nên Heap không thay đổi
    }
}
