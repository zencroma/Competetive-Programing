import java.io.*;
import java.util.*;
public class Question2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner read = new Scanner(new File("ascii.text"));
        read.useDelimiter("\\s+");
        int []ascii = new int[256];
        while (read.hasNext()) {
            ascii[read.nextInt()]++;
        }
        //sort ascii based on ascii appearance
        int []asciiSort = new int[256];
        for (int i = 0; i < ascii.length; i++) {
            asciiSort[i] = ascii[i];
        }
        
        for (int i = 0; i < asciiSort.length; i++) {
            for (int j = i+1; j < asciiSort.length; j++) {
                if (asciiSort[i] < asciiSort[j]&&asciiSort[i]!=0) {
                    int temp = asciiSort[i];
                    asciiSort[i] = asciiSort[j];
                    asciiSort[j] = temp;
                }
            }
        }
        //print ascii
        for (int i = 0; i < asciiSort.length; i++) {
            if (asciiSort[i] != 0) {
                System.out.println (i + " = " + asciiSort[i] + " kali");
            }
                
            }
        }
        // for (int i = 0; i < 256; i++) {
        //     if (ascii[i] != 0) {
        //         System.out.println(ascii[i]);
        //     }
        // }
    }

