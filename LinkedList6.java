// Delete Kth element of the SLL

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

public class LinkedList6 {
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

    private static Node removeKth(Node head, int k) {
        if (head == null)
            return head;
        if (k == 1) {
            return head.next;
        }
        int cnt = 1;
        Node temp = head;
        Node prev = null;
        while (temp != null) {

            if (cnt == k) {
                prev.next = temp.next;
                break;
            }
            prev = temp;
            temp = temp.next;
            cnt++;
        }
        return head;

    }

    public static void main(String[] args) {
        int arr[] = { 12, 34, 56, 78, 90 };
        Node head = convertArr2LL(arr);
        head = removeKth(head, 4);
        print(head);

    }
}
