import java.util.ArrayList;

public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        this.head = null;
    }
    // SLL methods go here. As a starter, we will show you how to add a node to the list.
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }
    public ArrayList<Integer> printValues() {
        ArrayList<Integer> sllPrint = new ArrayList<Integer>();
        Node outputNode = new Node(value);
        Node runnerNode = new Node(value);
        if (this.head == null) {
            return null;
        }

        outputNode = this.head.value;
        runnerNode = this.head.next;

        while (runnerNode != null) {
            sllPrint.add(runnerNode.value);
            runnerNode = runnerNode.next;
        }

        return sllPrint;
    }
}
