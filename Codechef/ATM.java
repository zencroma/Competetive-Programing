import java.util.*;
class ATM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float X = in.nextFloat();
        float Y = in.nextFloat();

        if(X % 5 == 0&&Y >=X+0.5){
            System.out.printf("%.2f \n",Y-X - 0.5);
        }else{
            System.out.printf("%.2f \n",Y);
        }
    }
}
