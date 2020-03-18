package NikhilPrac;

public class ArraytoIntMethod1 {

    public static int arrayToInt(int[] arr){
        int num = 0;
        String numArr = "";
        for(int i = 0; i <arr.length; i++){
            numArr += arr[i];
        }
        num = Integer.parseInt(numArr);
        return num;

    }
    public static void main(String[] args) {
       int[] w = {1, 2, 3, 4};
        System.out.println("Print int to array "+ arrayToInt(w));

    }
}
