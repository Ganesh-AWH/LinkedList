public class SinglyLinkedList{
    Node head;
    static class Node{
        //data
        int data;
        //next address
        Node next;
        
        //constructor will create node with provided data
        Node(int data){
            this.data = data;
            next = null;
        }
    }

    //insert new node 
    private static SinglyLinkedList insert(SinglyLinkedList list,int ele){
            //create new node
            Node newNode = new Node(ele);
            if(list.head == null){
                list.head = newNode;
            }else{
                Node temp = list.head;
                while(temp.next != null){
                    temp = temp.next;
                }
                temp.next = newNode;
            }

            return list;
    }
    private static void printList(SinglyLinkedList list){
        Node temp = list.head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
    }
    private static SinglyLinkedList convertArray2LinkedList(int []arr){
        SinglyLinkedList list = new SinglyLinkedList();
        list.head = new Node(arr[0]);
        Node mover = list.head;
        for(int i=1;i<arr.length;i++){
            Node newNode = new Node(arr[i]);
            mover.next = newNode;
            mover = mover.next;    
        }

        return list;
    }
    public static void main(String[] args) {
        // SinglyLinkedList list = new SinglyLinkedList();
        // list = insert(list,1);
        // list = insert(list,2);
        // list = insert(list,3);
        // printList(list);
        SinglyLinkedList list = convertArray2LinkedList(new int[]{3,2,1});
        printList(list);
    }
}