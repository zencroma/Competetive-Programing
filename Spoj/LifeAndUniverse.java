
import java.util.Scanner;
class LifeAndUniverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        while(true){
            n = in.nextInt();
            if(n == 42){
                break;
            } 
            System.out.println(n);
        }
    }
}
