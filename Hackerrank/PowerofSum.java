import java.lang.annotation.Target;

public class PowerofSum {
    public int PowerSum(int Target, int Power, int number) {
        int value =  (int)Math.pow(number, Power);
        int vSum  = Target - value;
        //base case
        if(value < Target){
            return 0;
        }else  if(value==Target){
            return 1;
        }else if()
        
    }
}

