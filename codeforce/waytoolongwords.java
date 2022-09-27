import java.util.*;
public class waytoolongwords {
    public static void main(String[] args) {
        //in
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        String [] arr = new String[n];
        
        for (int i = 0; i < arr.length; i++) {
            arr [i] = in.nextLine();
        }    

        for(int j=0;j<n;j++)
        {
            if(arr[j].length()<=10)
            {
                System.out.print(arr[j]);
            }

            else
            {
                System.out.print(arr[j].charAt(0));
                System.out.print(arr[j].length()-2);
                System.out.print(arr[j].charAt(arr[j].length()-1));
            }

            System.out.print("\n");
        }
    }

}
