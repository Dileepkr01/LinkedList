// Delete the Node of the DLL 
class Node {
    int data;
    Node next;
    Node back;

    Node(int data1, Node next1, Node back1) {
        this.data = data1;
        this.next = next1;
        this.back = back1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
        this.back = null;

    }
}

public class DLL4 {

    private static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    private static Node convertArr2DLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node prev = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
        return head;

    }

    private static void deleteNode(Node temp) {
        Node prev = temp.back;
        Node front = temp.next;

        if (front == null) {
            prev.next = null;
            temp.back = null;
            return;
        }
        prev.next = front;
        front.back = prev;

        temp.next = temp.back = null;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 5, 7, 8, 3 };
        Node head = convertArr2DLL(arr);
        deleteNode(head.next.next.next.next);

        print(head);
    }
}