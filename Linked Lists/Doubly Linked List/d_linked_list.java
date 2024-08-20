public class d_linked_list {

    class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
        }
    }

    public Node head;
    public Node tail;

    public void addNode(int data){ //TO ADD A NODE 
        Node newNode = new Node(data);

        if (head == null){
            head = newNode;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
        }

        tail = newNode;
        System.out.println("Element is added\n");
    }

    public void f_display(){ //TO DISPLAY ELEMENTS FROM FRONT
        Node temp = head;

        if(temp == null){
            System.out.println("List is empty\n");
            return;
        }

        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void r_display(){ //TO DISPLAY ELEMENTS FROM REAR
        Node temp = tail;

        if(head == null){
            System.out.println("List is empty\n");
            return;
        }

        while(temp != null){
            System.out.println(temp.data);
            temp = temp.prev;
        }
    }

    public static void main(String[] args) {
        d_linked_list list = new d_linked_list();
        
        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        
        list.f_display();
        list.r_display();
    }
}