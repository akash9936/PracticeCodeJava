package src;

public class ReverseLinkedList {
    private Node head;

    // Node class
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add a new node at the head of the LinkedList
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Print the LinkedList
    public void printLL() {
        Node currentNode = head; // Use a temporary node for traversal
        while (currentNode != null) {
            System.out.println("Data is --> " + currentNode.data);
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    // Reverse the LinkedList
    public void reverse() {
        if (head == null || head.next == null) {
            return; // Nothing to reverse if list is empty or has only one node
        }

        Node previousNode = null;
        Node currentNode = head;
        while (currentNode != null) {
            Node nextNode = currentNode.next; // Temporarily store the next node
            currentNode.next = previousNode;  // Reverse the current node's pointer

            // Move the pointers one step forward
            previousNode = currentNode;
            currentNode = nextNode;
        }
        head = previousNode; // Update head to the last node, now the new head
    }

    public static void main(String args[]) {
        ReverseLinkedList rll = new ReverseLinkedList();
        rll.addFirst("Singh");
        rll.addFirst("Kumar");
        rll.addFirst("Akash");

        System.out.println("Original LinkedList:");
        rll.printLL();

        rll.reverse();

        System.out.println("Reversed LinkedList:");
        rll.printLL();
    }
}
