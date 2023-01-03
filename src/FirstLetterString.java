public class FirstLetterString {
    public static void main(String[] args) {
        String s="i am ankit Singh";
        splitwords(s);
    }

    private static void splitwords(String s) {
        String split[]=s.split(" ");
        for(int i=0;i<split.length;i++){
            String s1=split[i];
            System.out.println(s1.charAt(0));
        }
    }
}
