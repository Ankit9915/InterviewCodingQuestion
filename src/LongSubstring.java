import java.util.HashSet;

public class LongSubstring {
    public static void main(String[] args) {
        String s="abcdabd";
       System.out.println( longest(s));
    }

    private static String longest(String s) {
        HashSet<Character> set = new HashSet<>();
        String longesttillnow = "";
        String longestoverall = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (set.contains(ch)) {
                longesttillnow = "";
                set.clear();
            }
            set.add(ch);
            longesttillnow+=ch;
            if (longesttillnow.length() > longestoverall.length()) {
                longestoverall = longesttillnow;
            }
        }
        return longestoverall;
    }

}
