package Strings;
import java.io.*;
import java.text.*;
// ! Time Complexity:O(n)
// ! Space Complexity:O(1)
public class IterateString {
    static void traverseThroughString(String str){
        CharacterIterator it = new StringCharacterIterator(str);
        //iterasi string one by one dan print satu persatu
        while (it.current()!=CharacterIterator.DONE) {
            System.out.println(it.current()+"");

            it.next();
        }
    }
}
