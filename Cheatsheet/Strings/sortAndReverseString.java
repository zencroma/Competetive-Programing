package Strings;
import java.util.*;
public class sortAndReverseString {
    static void sortandreverse(String[] str){
        //sort dan reverse string dan string tidak case sensitive
        Arrays.sort(str,Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));
    }
}
