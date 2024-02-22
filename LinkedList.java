// class Node{
//     int data;
//     Node next;
//     Node(int data){
//         this.data = data;
//         next  = null;
//     }
// }
public class LinkedList {
    private static Node convert2List(int []arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1;i<arr.length;i++){
            Node newNode = new Node(arr[i]);
            mover.next = newNode;
            mover = mover.next;
        }
        return head;
    }
    private static void printList(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        int []arr = new int[]{50,594,49,34};
        Node head = convert2List(arr);
        printList(head);
    }
}
