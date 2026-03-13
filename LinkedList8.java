// Insert Head of The SLL

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

public class LinkedList8 {
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

    public static Node insertHead(Node head, int val) {
        
        return new Node(val, head);
        // Node temp = new Node(val, head);
        // return temp;
    }

    public static void main(String[] args) {
        int arr[] = { 12, 34, 56, 78, 90 };
        Node head = convertArr2LL(arr);
        head = insertHead(head, 6);
        print(head);

    }
}
