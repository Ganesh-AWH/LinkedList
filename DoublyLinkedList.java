class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
public class DoublyLinkedList {
    public static void main(String[] args) {
        int []arr = new int[]{1,2,5};
        Node head = convert2DoubleList(arr);
        head = DeleteBegin(head);
        printList(head);
    }
    private static Node convert2DoubleList(int []arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1;i<arr.length;i++){
            Node newNode = new Node(arr[i]);
            newNode.prev = mover;
            mover.next = newNode;
            mover = mover.next;
        }
        return head;
    }
    private static Node DeleteBegin(Node head){
        if(head == null || head.next == null) return null;
        Node prev = head;
        head = head.next;

        head.prev = null;
        prev.next = null;
        prev = null;
        return head;
    }
    private static void printList(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}
