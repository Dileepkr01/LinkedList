// Insert before Kth Element in  DLL 
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

public class InsertBeforeKthEl {

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

    private static Node insertBeforeHead(Node head, int val) {
        Node newHead = new Node(val, head, null);
        head.back = newHead;
        return newHead;
    }

    private static Node insertBeforeTail(Node head, int val) {
        if (head.next == null) {
            return insertBeforeHead(head, val);
        }
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;

        }
        Node prev = tail.back;
        Node newNode = new Node(val, tail, prev);
        prev.next = newNode;
        tail.back = newNode;
        return head;
    }

    private static Node insertBefKthEl(Node head, int k, int val) {
        if (k == 1) {
            return insertBeforeHead(head, val);
        }

        Node temp = head;

        int cnt = 0;

        while (temp != null) {
            cnt++;
            if (cnt == k)
                break;
            temp = temp.next;

        }
        Node prev = temp.back;
        Node newNode = new Node(val, temp, prev);
        prev.next = newNode;
        return head;
    }

    private static Node insertBeforeNode(Node node, int val) {

        Node prev = node.back;

        Node newNode = new Node(val, node, prev);

        prev.next = newNode;
        node.back = newNode;

        return newNode;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 5, 7, 8, 3 };
        Node head = convertArr2DLL(arr);

        head = insertBeforeNode(head.next.next, 100);
        print(head);
    }
}