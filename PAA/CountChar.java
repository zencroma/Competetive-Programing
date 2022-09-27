import java.util.*;
public class CountChar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        String str = n.replaceAll(" ","");
        int length= str.length();
        char []chr = str.toCharArray();
        char []chrNonDuplicate =Arrays.stream(chr).distinct().toArray(char[]::new);
        int [] jumlahAbjad = new int[length];
        int index = 0;
        // //char no duplicate
        // for (int i = 0; i < chr.length; i++) {
        //     int flag = 1;
        //     for (int j = 0; j < chrNonDuplicate.length; j++) {
        //         if (chr[i] == chrNonDuplicate[j]) {
        //             flag = 1;
        //             break;
        //         }
        //     }
        //     if (flag == 0) {
        //         chrNonDuplicate[index] = chr[i];
        //         index++;
        //     }
        // }
        for (int i = 0; i < chrNonDuplicate.length; i++) {
            int flag = 1;
            if(chrNonDuplicate[i] != 0){
                for (int j = 0; j < chrNonDuplicate.length; j++) {
                    if (chrNonDuplicate[i] == chr[j]) {
                        jumlahAbjad[i] = flag++;
                    }
                }
            }
        }

        for (int i = 0; i < jumlahAbjad.length; i++) {
            if (chrNonDuplicate[i] != 0) {
                System.out.print(chrNonDuplicate[i] +" : "+ jumlahAbjad[i]);
                System.out.println();
            }   
        }
        



    }
}
