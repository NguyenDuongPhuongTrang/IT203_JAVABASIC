import java.time.LocalDate;

public class Gioi1 {
    public static void main(String[] args) {
        String[] transaction = {"BK001-20/01", "BK005-21/02", "BK099-22/01"};
        System.out.println("--- BÁO CÁO MƯỢN SÁCH ---");
        System.out.println("Ngày tạo: " + LocalDate.now());
        StringBuilder list = new StringBuilder();
        for (String tran: transaction){
            list.append("Giao dịch: ").append(tran).append("\n");
        }
        System.out.println(list);
    }
}
