public class RotationString {
    public static void main(String[] args) {

        System.out.println(isRoated("abcd", "dcba"));
    }

    private static boolean isRoated(String str, String roatedstr) {

        if (str == null || roatedstr == null) {
            return false;
        } else if (str.length() != roatedstr.length()) {
            return false;

        } else {
            String concat = str + str;
            return concat.contains(roatedstr);
        }
    }
}
