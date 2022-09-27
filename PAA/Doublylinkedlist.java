
public class Doublylinkedlist {
    class Node {
        int data;
        Node next;
        Node prev;
        public Node(int data) {
            this.data = data;
            next = null;
            prev = null;
        }
    }
    Node head;
    Node tail;
    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
    public void printnode() {
        Node temp = head;
        System.out.print("isi dari doubly linked list : ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
