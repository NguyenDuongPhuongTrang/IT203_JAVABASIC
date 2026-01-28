public class Kha1 {
    public static void main(String[] args) {
        String title = "lập  trình    Java cơ bẢn              ";
        String author = "nguyễn văn a";
        String newTitle = title.trim().toUpperCase().replaceAll("\\s+", " ");
        String[] words = author.split("\\s+");
        StringBuilder newAuthor = new StringBuilder();
        for (String word : words){
            newAuthor.append(word.substring(0, 1).toUpperCase())
                    .append(word.substring(1))
                    .append(" ");
        }
        System.out.println("[" + newTitle + "]");
        System.out.println("- Tác giả: " + newAuthor);
    }
}
