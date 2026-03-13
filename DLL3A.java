// Single Function Version Delete Kth Element in DLL

class Node {

    int data;     // value of node
    Node next;    // pointer to next node
    Node back;    // pointer to previous node

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

public class DLL3A {

    // Function to delete kth node
    private static Node removeKthElement(Node head, int k) {

        if (head == null) return null;

        int cnt = 0;
        Node temp = head;

        while (temp != null) {
            cnt++;
            if (cnt == k) break;
            temp = temp.next;
        }

        if (temp == null) return head;

        Node prev = temp.back;
        Node front = temp.next;

        // Case 1: only one node
        if (prev == null && front == null) {
            return null;
        }

        // Case 2: delete head
        if (prev == null) {
            head = front;
            front.back = null;
            temp.next = null;
            return head;
        }

        // Case 3: delete tail
        if (front == null) {
            prev.next = null;
            temp.back = null;
            return head;
        }

        // Case 4: delete middle node
        prev.next = front;
        front.back = prev;

        temp.next = null;
        temp.back = null;

        return head;
    }

    // Print DLL
    private static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    // Convert array to DLL
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

    public static void main(String[] args) {

        int arr[] = {1, 5, 7, 8, 3};

        Node head = convertArr2DLL(arr);

        head = removeKthElement(head, 3);

        print(head);
    }
}