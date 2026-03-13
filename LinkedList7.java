// Delete given element of the SLL

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

public class LinkedList7 {
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
    private static Node removeEl(Node head, int el) {
        if (head == null)
            return head;
        if (head.data == el) {
            return head.next;
        }

        Node temp = head;
        Node prev = null;
        while (temp != null) {
            if (temp.data == el) {
                prev.next = temp.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;

    }

    public static void main(String[] args) {
        int arr[] = { 12, 34, 56, 78, 90 };
        Node head = convertArr2LL(arr);
        head = removeEl(head, 12);
        print(head);

    }
}
