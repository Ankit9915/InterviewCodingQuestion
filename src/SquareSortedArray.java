public class SquareSortedArray {
    public static void main(String[] args) {
        int array[]={-6,1,-2,4,5};
        int squarearray[]=squaresortedarray(array);
        for (int i=0;i< squarearray.length;i++){
            System.out.println(squarearray[i]);
        }
    }

    private static int[] squaresortedarray(int[] array) {
        int squarearray[]=new int[array.length];
        int start=0;
        int end=array.length-1;
        int squareIndex=array.length-1;
        while (start<=end){
            if (array[start]*array[start]>array[end]*array[end]){
                squarearray[squareIndex--]=array[start]*array[start];
                start++;
            }else {
                squarearray[squareIndex--]=array[end]*array[end];
                end--;


            }
        }
       /* while (start<=end){
            if(array[start]>array[end]){
                squarearray[squareIndex--]=array[start];
                start++;
            }else {
                squarearray[squareIndex--]=array[end];
                end--;
            }
        }*/
        return squarearray;

    }
}
