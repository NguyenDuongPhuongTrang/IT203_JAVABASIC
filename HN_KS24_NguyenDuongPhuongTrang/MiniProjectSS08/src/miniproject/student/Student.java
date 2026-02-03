package miniproject.student;

public class Student {
    //Thuộc tính
    private String id;
    private String name;
    private double score;

    //Constructors
    public Student(){
    };

    public Student(String id, String name, double score){
        this.id = id;
        this.name = name;
        this.score = score;
    }

    // Getters & Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    //Phương thức trả về xếp loại học lực
    public String getRank(){
        if (score >= 8.0) {
            return "Giỏi";
        } else if (score >= 6.5) {
            return "Khá";
        } else {
            return "Trung Bình";
        }
    }

    // Trả về chuỗi thông tin
    @Override
    public String toString() {
        return "Mã sinh viên: " + id +
                "\nTên: " + name +
                "\nĐiểm: " + score +
                "\nHọc lực: " + getRank() +
                "\n---------";
    }
}
