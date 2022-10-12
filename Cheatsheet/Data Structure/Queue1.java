import java.util.*;
public class Queue1 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        //add queue 
        for (int i = 0; i <5; i++) {
            queue.add(i);
        }
        //remove head
        int removed = queue.remove(); //! if null return exception
        int remove = queue.poll(); // ! if null return null

        //peek
        int head = queue.peek();

        //size
        int size = queue.size();

        //cari elemen
        boolean elemenFound = queue.contains(1);
        // iterate queue
        Iterator iterator= queue.iterator();
        while (iterator.hasNext()) {
            System.out.println((String) iterator.next());
        }
    
    }
}
