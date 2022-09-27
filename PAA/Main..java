import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan jumlah data : ");
        int n = in.nextInt();
        System.out.println("Masukan nilai yang ingin di iiput");
        Doublylinkedlist dll = new Doublylinkedlist();
        for (int i = 0; i < n; i++) {
            dll.addNode(in.nextInt());
        }
        dll.printnode();
    }
}
