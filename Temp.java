public class Temp {
    public static void main(String[] args) {
        String sentence = "Java is fun to learn";
        String[] words = sentence.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
