import java.util.Map;
import java.util.TreeMap;

public class CountWordVowelFrequency {
    public static void main(String[] args) {
        String s="Hello ChaGpt How Are You.";
        CountWordVowelFrequency cf=new CountWordVowelFrequency();
        cf.getwords(s);
        cf.getfrequency(s);
    }

    private void getfrequency(String s) {
        TreeMap<Character,Integer> map=new TreeMap<>();
        for (int i=0;i<s.length();i++){
            Integer c=map.get(s.charAt(i));
            if(map.get(s.charAt(i))==null){
                map.put(s.charAt(i),1);
            }else{
                map.put(s.charAt(i),++c);
            }
        }
        for (Map.Entry entry:map.entrySet()){
            System.out.println("Character="+entry.getKey());
            System.out.println("Frequency="+entry.getValue());
        }

    }

    private void getwords(String s) {
        int wcount=0;
        int vcount=0;
        int ucount=0;
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            switch (ch){
                case ' ':
                case '.':
                    wcount++;
            }
            switch (ch){
                case 'A':
                case 'E':
                case 'I':
                case '0':
                case 'U':
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vcount++;
            }
            if(ch>=65 && ch<=90){
                ucount++;
            }


        }
        System.out.println("Wordcount="+wcount);
        System.out.println("Vowelscount="+vcount);
        System.out.println("Uppercaseount="+ucount);
    }
}
