public class CharCounter_toUpper {
    public static void main(String[] args) {
        int[] count = new int[128];
        String a;

        for (String arg : args) {
            a = arg.toUpperCase();
            for (int i = 0; i < arg.length(); i++) {
                count[a.charAt(i)] += 1;
            }
        }

        for (int i = 65; i < 91; i++) {
            if (count[i] > 0) {
                System.out.printf("%c\t%s%n", (char) i, "#".repeat(count[i]));
            }
        }
    }
}
