public class longestColletzSequence {
    public static void main(String[] args) {
        int batas = 1000000;
        int steps=0;
        int sequence=0;
        int terbesar =0;
        int terbesarStep=0;
        int i=2;
        while (i<batas) {
            sequence=i;
            while (sequence!=1) {
                //jika genap dioperasikan dibagi 2
                if (sequence %2==0) {
                    sequence/=2;
                //jika ganjil dioperasikan 3 dikali nilai plus satu 
                } else {
                    sequence=3*sequence+1;
                }
                //panjanganya rantai dihitung
                steps++;
            }
            //cel jika rantai lebih besar daripada nilai yang sudah dimiliki 
            if (steps>terbesarStep) {
                terbesar=i;
                terbesarStep=steps;
                System.out.println(terbesar+"  step  " +steps);
                
            }
            i++;
            //reset
            steps=0;

        }
        System.out.println("nilai dengan sequence terbesar adalah "+terbesar+" dengan rantai sebanyak " +terbesarStep );

    }
}
