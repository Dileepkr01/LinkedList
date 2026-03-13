// Insert Tail of The SLL

class Node {
    int data;
    Node next;

    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;

    }
}

public class LinkedList9 {
    private static Node convertArr2LL(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    private static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static Node insertTail(Node head, int val) {
        if(head == null){
            return new Node(val); 
        }
       Node temp = head;
       while(temp.next != null){
        temp = temp.next;
       }
       Node newNode = new Node(val);
       temp.next = newNode;
       return head;
    }

    public static void main(String[] args) {
        int arr[] = { 12, 34, 56, 78, 90 };
        Node head = convertArr2LL(arr);
        head = insertTail(head, 97);
        print(head);

    }
}
