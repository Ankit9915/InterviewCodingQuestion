
import java.security.KeyStore;
import java.util.LinkedHashMap;
import java.util.Map;

public class StringComparrison {
    public static void main(String[] args) {
        String s="sandeep";
        Map<Character,Integer> map=new LinkedHashMap<>();
        for (int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))!=null){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i),1);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            sb.append(entry.getKey());
            sb.append(entry.getValue());
        }
        System.out.println(sb.toString());


    }

}
