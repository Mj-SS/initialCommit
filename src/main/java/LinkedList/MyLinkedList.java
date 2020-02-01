package LinkedList;

public class MyLinkedList {

    private Node startNode;

    public void add(Integer newValue) {

        if (startNode == null) {
            startNode = new Node(newValue, null);
        }else {
            Node currentNode = startNode;
            while (currentNode.nextNode != null){
                currentNode = currentNode.nextNode;
            }
            currentNode.nextNode = new Node(newValue,null);
        }
    }

    public void printAll(){

        if (startNode == null) {
            System.out.println(" No data ");
            System.out.println(startNode.value);
        }else {
            Node currentNode = startNode;
            while (currentNode.nextNode != null) {
                System.out.println(currentNode.value + " - ");
                currentNode = currentNode.nextNode;
            }
            System.out.println(currentNode.value);
        }
    }

}

