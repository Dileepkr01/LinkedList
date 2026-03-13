//Singly Linked List (SLL) --> Node Structure
class Node {

    int data;     // stores the value of the node
    Node next;    // pointer/reference to the next node

    // Double Constructor
    Node(int data1, Node next1) {
        this.data = data1;   // initialize data
        this.next = next1;   // initialize next pointer
    }

    // Single Constructor
    Node(int data1) {
        this.data = data1;   // initialize data
        this.next = null;    // next is null initially
    }
}


public class NodeStructureInSLL {
    public static void main(String[] args) {
        
    }
}
