public class CharCounter_ternary {
    public static void main(String[] args) {
        int[] count = new int[128];
        int temp;

        for (String arg : args) {
            for (int i = 0; i < arg.length(); i++) {
                temp = arg.charAt(i);
                count[temp > 96 ? temp - 32 : temp] += 1;
            }
        }

        for (int i = 65; i < 91; i++) {
            if (count[i] > 0) {
                System.out.printf("%c\t%s", (char) i, "#".repeat(count[i]));
            }
        }
    }
}