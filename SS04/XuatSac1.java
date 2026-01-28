import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class XuatSac1 {
    public static void main(String[] args) {
        String information = "2024-05-20 | User: NguyenVanA | Action: BORROW | BookID: BK12345";
        Pattern pattern = Pattern.compile("(\\d{4}-\\d{2}-\\d{2}) \\| User: ([^|]+) \\| Action: ([^|]+) \\| BookID: ([^|]+)");
        Matcher matcher = pattern.matcher(information);
        if (matcher.find()){
            String date = matcher.group(1);
            String name = matcher.group(2);
            String action = matcher.group(3);
            String id = matcher.group(4);

            System.out.println("Ngày: " + date);
            System.out.println("Người dùng: " + name);
            System.out.println("Hành động: " + action);
            System.out.println("Mã sách: " + id);
        }
    }
}
