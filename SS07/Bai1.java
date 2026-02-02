class Student{
    String idStudent;
    String studentName;
    public static int totalStudent = 0;

    public Student(String idStudent, String studentName){
        this.idStudent = idStudent;
        this.studentName = studentName;
        totalStudent++;
    }

    public void displayStudent(){
        System.out.println(idStudent +" "+ studentName);
    }
}

public class Bai1 {
    public static void main(String[] args) {
        Student student1 = new Student("1", "Trang");
        Student student2 = new Student("2", "Minh");
        System.out.println("Thông tin các sinh viên");
        student1.displayStudent();
        student2.displayStudent();
    }
}
