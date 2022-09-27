/**
 * UTS
 */
public class UTS2{
    static int i=1;
    public static void main(String[] args) {
        System.out.println(x(2,0));
    }
    static int x(int A,int B ){
        System.out.println("fungsi dipanggil "+ i++);
        if(A == 0){
            return B+1;
        }else if (A>0 && B==0) {
            return x(A-1,1);
        } else if(A>0&&B>0) {
            return x(A-1,x(A,B-1));
        } else{
            return 0;
        }
        

    }
}