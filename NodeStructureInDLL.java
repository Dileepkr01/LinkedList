// Doubly Linked List (DLL)
// Node Structure
class Node {

    int data;     // stores node value
    Node next;    // pointer to next node
    Node back;    // pointer to previous node

    // Double Constructor
    Node(int data1, Node next1, Node back1) {
        this.data = data1;   // initialize data
        this.next = next1;   // initialize next pointer
        this.back = back1;   // initialize previous pointer
    }

    // Single Constructor
    Node(int data1) {
        this.data = data1;   // initialize data
        this.next = null;    // next pointer initially null
        this.back = null;    // previous pointer initially null
    }
}
public class NodeStructureInDLL {
    
}
