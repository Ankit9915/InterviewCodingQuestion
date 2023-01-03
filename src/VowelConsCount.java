public class VowelConsCount {
    public static void main(String[] args) {
        String s="Ankitsingh";
        count(s);
    }

    private static void count(String s) {
        int vcount=0;
        int ccount=0;
        for (int i=0;i<s.length();i++){
            if(isvowel(s.charAt(i))){
                ++vcount;
            }else{
                ++ccount;
            }
        }
        System.out.println("Vcount :"+ vcount);
        System.out.println("Ccount :"+ ccount);
    }

    private static boolean isvowel(char ch) {
        ch=Character.toUpperCase(ch);
        return (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U');

    }
}
