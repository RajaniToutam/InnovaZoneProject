/*
package NikhilPrac;

public class IntoArrayMethod2 {

*/
/*
        public static int[] arrayToInt(int num){
            String numbers = Integer.toString(num);
            int[] numArr = new int[numbers.length()];

            for(int i = 0; i<numbers.length(); i++){
                numArr[i] = Integer.parseInt("" + numbers.charAt(i));
            }

            return numArr;
        }*//*


    public static int[] arrayToInt(int num) {
        String k = Integer.toString(num);
        int[] res = new int[k.length()];
        for (int i : k.length()) {
            res[i] = k.charAt(i) - '0';
        }
    }

        public static void main (String[]args){
            int w = 1;
            System.out.println("Print int to array { } " + arrayToInt(w));

        }
    }

*/

