class StudentNew {
    String studentName;

    public StudentNew(String studentName) {
        this.studentName = studentName;
    }
}

public class Bai2 {
    public static void main(String[] args) {
        // Biến nguyên thủy
        int a = 10;
        int b = a;
        b = 20;
        System.out.println("Bien nguyen thuy");
        System.out.println("a " + a);
        System.out.println("b " + b);
        // Biến tham chiếu
        StudentNew s1 = new StudentNew("son");
        StudentNew s2 = s1;
        s2.studentName = "son bui";
        System.out.println("Bien tham chieu");
        System.out.println("s1 " + s1.studentName);
        System.out.println("s2 " + s2.studentName);
    }
}