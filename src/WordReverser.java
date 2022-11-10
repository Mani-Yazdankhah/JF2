public class WordReverser {
    public static void main(String[] args) {
        for (String arg : args) {
            StringBuilder sb = new StringBuilder();
            int len = 0;
            String[] words = arg.split("\\s+"); // Split the input on spaces

            for (String word : words) {
                for (int i = word.length() - 1; i >= 0; i--) {
                    sb.append(word.charAt(i));
                }
                len += 1;
                if (len < words.length) {
                    sb.append(' ');
                }
            }
            System.out.println(sb);
        }
    }
}