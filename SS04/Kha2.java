import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Kha2 {
    public static void main(String[] args) {
        String description = "Sách giáo khoa toán lớp 12, Kệ: A1-102, tình trạng mới";
        Pattern pattern = Pattern.compile("Kệ: \\s*([^,]+)");
        Matcher matcher = pattern.matcher(description);
        if (matcher.find()){
            String index = matcher.group(1);
            System.out.println("Vị trí tìm thấy: " + index);
        }
        String newDes = description.replaceAll("Kệ: \\s*([^,]+)", "Vị trí: $1");
        System.out.println(newDes);
    }
}
