package LinkedList;

public class Node {

    Integer value;
    Node nextNode;

    public Node(Integer value, Node nextNode) {
        this.value = value;
        this.nextNode = nextNode;
        System.out.println("New node value =" + value);
    }
}
