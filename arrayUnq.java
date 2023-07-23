public class UniqueCharacters {
    public static boolean isUniqueChars(String str) {
        if (str.length() > 128)
            return false;

        boolean[] charSet = new boolean[128];

        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);

            if (charSet[val]) { // Already found this char in string
                return false;
            }

            charSet[val] = true;
        }

        return true;
    }

    public static void main(String[] args) {
        String input1 = "Hello";
        String input2 = "World";

        boolean isInput1Unique = isUniqueChars(input1);
        boolean isInput2Unique = isUniqueChars(input2);

        System.out.println(input1 + " has unique characters: " + isInput1Unique);
        System.out.println(input2 + " has unique characters: " + isInput2Unique);
    }
}
