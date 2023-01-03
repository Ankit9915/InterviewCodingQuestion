import java.util.HashSet;
import java.util.Set;

public class CommonElementsArray {
    public static void main(String[] args) {

        int arr1[] = {10, 20, 30, 60, 80};
        int arr2[] = {20, 60, 5000, 65, 90};
     // interscetion(arr1,arr2);
        unnion(arr1,arr2);
    }

  /*  static void interscetion(int arr1[], int arr2[]) {
        Set<Integer> s=new HashSet<>();

        for(int i=0;i<arr1.length;i++){
            s.add(arr1[i]);
        }
        for(int j=0;j<arr2.length;j++){

            if(s.contains(arr2[j])){
                System.out.println(arr2[j]+" ");

            }
        }
    }*/
    static void unnion(int arr1[],int arr2[]){
        Set<Integer> s=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            s.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){

            s.add(arr2[i]);
        }
        System.out.println(s);

    }


}
