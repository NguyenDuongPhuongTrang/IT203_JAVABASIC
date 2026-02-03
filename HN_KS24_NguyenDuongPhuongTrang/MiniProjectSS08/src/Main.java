import miniproject.student.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[100];
        int count = 0;
        int choice;

        do {
            System.out.println("\n===== QUAN LY DIEM SINH VIEN =====");
            System.out.println("1. Nhập danh sách sinh viên");
            System.out.println("2. Hiển thị danh sch sinh viên");
            System.out.println("3. Tìm sinh viên theo học lực");
            System.out.println("4. Sắp xếp theo điểm giảm dần");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng: ");

            choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                // Nhập số lượng sinh viên
                case 1:
                    System.out.print("Nhập số lượng sinh viên: ");
                    int n = Integer.parseInt(sc.nextLine());

                    for (int i = 0; i < n; i++) {
                        System.out.println("Sinh viên thứ " + (i + 1));
                        String id;

                        // Validate ID: Kiểm tra startsWith("SV") và độ dài/số
                        while (true) {
                            System.out.print("Mã sinh viên: ");
                            id = sc.nextLine();
                            if (id.startsWith("SV") && id.length() == 5 &&
                                    id.substring(2).matches("\\d{3}")) {
                                break;
                            }
                            System.out.println("Mã sinh viên không hợp lệ (VD: SV001)");
                        }

                        System.out.print("Họ tên: ");
                        String name = sc.nextLine();
                        System.out.print("Điểm trung bình: ");
                        double score = Double.parseDouble(sc.nextLine());

                        students[count++] = new Student(id, name, score);
                    }
                    break;

                // Hiển thị danh sách
                case 2:
                    if (count == 0) {
                        System.out.println("Danh sách rỗng!");
                    } else {
                        for (int i = 0; i < count; i++) {
                            System.out.println(students[i]);
                        }
                    }
                    break;

                // Tìm kiếm theo học lực
                case 3:
                    System.out.print("Nhập học lực cần tìm: ");
                    String keyword = sc.nextLine();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (students[i].getRank().equalsIgnoreCase(keyword)) {
                            System.out.println(students[i]);
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Không tìm thấy sinh viên!");
                    }
                    break;

                // Sắp xếp giảm dần (Bubble Sort)
                case 4:
                    for (int i = 0; i < count - 1; i++) {
                        for (int j = i + 1; j < count; j++) {
                            if (students[i].getScore() < students[j].getScore()) {
                                Student temp = students[i];
                                students[i] = students[j];
                                students[j] = temp;
                            }
                        }
                    }
                    System.out.println("Đã sắp xếp theo điểm giảm dần!");
                    break;
                case 5:
                    System.out.println("Thoát chương trình!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
                    break;
            }
        }while (choice != 5);
    }
}