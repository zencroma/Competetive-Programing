public class UTS1 {
    static int total = 0;
    public static void main(String[] args) {
        for(int i = 1; i <= 7; i++){ 
            for (int j = 12; j > i; j--){
                System.out.print('*'); 
            } 
            System.out.println('\n');
            
        }
        System.out.println(total);
    }
}
