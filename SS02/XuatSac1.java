import java.util.Scanner;

public class XuatSac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- HỆ THỐNG ĐÁNH GIÁ ĐỘC GIẢ ---");
        int dayLate;
        int prestigeScore = 100;
        while (true) {
            System.out.print("Số ngày trễ của lần này (Nhập 999 để kết thúc): ");
            dayLate = Integer.parseInt(sc.nextLine());
            if (dayLate == 999) {
                System.out.printf("\nTổng điểm uy tín: %d\n\n", prestigeScore);
                if (prestigeScore > 120) {
                    System.out.println("Xếp loại: Độc giả Thân thiết");
                } else if (prestigeScore <= 120 && prestigeScore >= 80) {
                    System.out.println("Xếp loại: Độc giả Tiêu chuẩn");
                } else {
                    System.out.println("Xếp loại: Độc giả cần lưu ý");
                }
                break;
            }
            ;
            if (dayLate <= 0) {
                prestigeScore += 5;
                System.out.println("-> Trả đúng hạn/ sớm hạn: Cộng 5 điểm");
            } else {
                prestigeScore -= dayLate * 2;
                System.out.printf("-> Trả trễ %d ngày: Trừ %d điểm \n", dayLate, dayLate * 2);
            }
        }
    }
}
