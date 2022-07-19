package Class7objects;

public class Question7 {
    public static void main(String[] args) {
        DoubleyLinkedList<Integer> dlist = new DoubleyLinkedList<>();
        dlist.insertAtbegin(3);
        dlist.insertAtbegin(6);
        dlist.insertAtbegin(12);
        dlist.insertAtbegin(13);
        dlist.insertAtbegin(7);
        dlist.insertAtbegin(8);

         dlist.insertAtpos(2,10);
         dlist.deleteAtBegin();
         dlist.deleteAtpos(2);
        System.out.println("Normal : ");
        dlist.display();
        System.out.println("Reverse iteration: ");
        dlist.displayRev();
    }
}

class DoubleyLinkedList<T> {

    class Node {
        T data;
        Node next;
        Node prev;

        Node(T data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head, tail;

    DoubleyLinkedList() {
        head = null;
        tail = null;
    }

    public void insertAtbegin(T data) {
        Node newNode = new Node(data);
        if (head == null) {

            tail = newNode;
            newNode.next = head;

        } else {
            head.prev = newNode;
            newNode.next = head;

        }
        head = newNode;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void displayRev() {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
    }

    public void insertAtpos(int pos, T data) {
        Node newnode = new Node(data);
        if (pos == 0) {
            insertAtbegin(data);
        } else {
            Node temp = head;
            for (int i = 1; i < pos; i++) {
                temp = temp.next;
                if (temp == null) {
                    throw new IndexOutOfBoundsException("Reached end of list");
                }
            }
            newnode.next = temp.next;
            newnode.prev = temp;
            if (temp == tail) {
                tail = newnode;
            }
            else {
                temp.next.prev = newnode;
                temp.next = newnode;
            }
        }
    }
    public void deleteAtBegin()  {
        if(head==null){
            throw new NullPointerException("list is empty");
        }
        head=head.next;
        if(head==null){
            tail=null;
        }
        else{
            head.prev=null;
        }
    }
    public void deleteAtpos(int pos){
        Node temp=head;
        Node prev=null;
        if(pos==0){
            deleteAtBegin();
        }
        else {
            for (int i = 1; i <= pos; i++) {
                 prev=temp;
                 temp=temp.next;
            }
            prev.next=temp.next;
            if(temp.next==null){
                tail=prev;
            }
            else {
                temp.next.prev = prev;
            }
        }
    }

}
