public class CharCounter_LUT {

    private final int[] toUpperTable = new int[128];

    public CharCounter_LUT() {
        // Shift the index of a-z by -32. Anything other than letters will be a zero (Null character)
        for (int i = 97; i < 123; i++) {
            this.toUpperTable[i] = i - 32;
            this.toUpperTable[i - 32] = i - 32;
        }
    }

    private int toUpper(char c) {
        return toUpperTable[c];
    }

    public static void main(String[] args) {
        CharCounter_LUT counter = new CharCounter_LUT();
        int[] count = new int[128];
        for (String arg : args) {
            for (int i = 0; i < arg.length(); i++) {
                count[counter.toUpper(arg.charAt(i))] += 1;
            }
        }

        for (int i = 65; i < 91; i++) {
            if (count[i] > 0) {
                System.out.printf("%c\t%s%n", (char) i, "#".repeat(count[i]));
            }
        }
    }
}
