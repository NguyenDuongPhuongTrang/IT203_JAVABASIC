import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Gioi2 {
    public static void main(String[] args) {
        String cardID = "TV202345678";
        String start = cardID.substring(0, 2);
        if (cardID.length() != 11){
            System.out.println("Độ dài thẻ không hợp lệ");
        } else if (!start.matches("[A-Z]{2}")){
            System.out.println("Kí tự bắt đầu không hợp lệ!");
        } else {
            String year = cardID.substring(2, 6);
            if (!year.matches("\\d{4}")){
                System.out.println("Năm không hợp lệ!");
            }else {
                String end = cardID.substring(6);
                if (!end.matches("\\d{5}")){
                    System.out.println("Chuỗi kết thúc không hợp lệ!");
                }else {
                    System.out.println("Mã thẻ hợp lệ");
                }
            }
        }
    }
}
