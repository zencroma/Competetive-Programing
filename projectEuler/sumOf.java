
public class Sumof {

    public static void main(String[] args) {
        
        int total = 0;
        int batas = 1000;
        for (int i = 0; i < batas; i++) {
            //cek jika i merupakan bilangan yang berkelipatan 3 atau 5
            //jika iya maka bilangan-bilangan yang berkelipatan 3 atau 5 ditambah 
            if (i%3==0||i%5==0) {
                total+=i;
            }
        }
        System.out.println(total);
        
    }
}