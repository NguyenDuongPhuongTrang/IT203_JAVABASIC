import java.util.regex.Pattern;

public class XuatSac2 {
    public static void main(String[] args) {
        String review = "Cuốn sách này rất tệ, nội dung thật là ngu ngốc, không đáng đọc.";
        String[] blackList = {"tệ", "ngu", "ngốc"};
        for (String word: blackList){
            review = review.replaceAll("i?" + word, "***");
        }
        StringBuilder newReview = new StringBuilder();
        int index = 40;
        if (review.length() > index){
            if (review.charAt(index) != ' '){
                for(int i = index; i > 0; i--){
                    if (review.charAt(i) == ' '){
                        newReview.append(review, 0, i).append("...");
                        break;
                    }
                }
            }
        }
        System.out.println("Sau khi xử lý: " + newReview);
    }
}
