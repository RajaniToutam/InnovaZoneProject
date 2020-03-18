package NikhilPrac;

public class PracSessionforTest {

    public static void main(String[] args) {

        System.out.println(wordInMiddle("computer", "science"));
        System.out.println(wordInMiddle("science", "computer"));
        System.out.println(flippedString("computer"));
        System.out.println(flippedString("science"));
        System.out.println(first2Last2("computer"));
        System.out.println(first2Last2("science"));
        System.out.println(first2Last2("AP"));

    }


    public static String wordInMiddle(String str1, String str2){
        String firstHalf = str1.substring(0, str1.length()/2);
        String secondHalf = str1.substring(str1.length()/2, str1.length());
        return firstHalf+str2 +secondHalf;

    }
    public static String flippedString(String str){
        String firstHalf = str.substring(0, str.length()/2);
        String secondHalf = str.substring(str.length()/2, str.length());
        return secondHalf+firstHalf;
    }
    public static String first2Last2(String str){
        String firstTwo = str.substring(0,2);
        String lastTwo = str.substring(str.length()-2, str.length());
        return firstTwo+lastTwo;
    }
    public class StringMethods {


        /* * wordInMiddle("computer", "science") -> "compscienceuter"
         * wordInMiddle("science", "computer") -> "scicomputerence"
         *
         * * flippedString("computer") -> "utercomp"
         * flippedString("science") -> "encesci"
         *
         * * first2Last2("computer") -> "coer"
         * first2Last2("science") -> "scce"
         * first2Last2("AP") -> "APAP"
         *
         * PRECONDITION: str.length() > 1
         */



    }
}

