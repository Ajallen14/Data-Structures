import java.util.Scanner;

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
        Scanner sc = new Scanner(System.in);

        int c, n;

        do {
            System.out.println("Enter 1 to insert an element");
            System.out.println("Enter 2 to insert an element after an elements");
            System.out.println("Enter 3 to insert an element before an element");
            System.out.println("Enter 4 to delete an element");
            System.out.println("Enter 5 to display the list");
            System.out.println("Enter 6 to display the list in reverse");
            System.out.println("Enter 7 to EXIT");
            System.out.print("Enter ur choice : ");
            c = sc.nextInt();

            if( c == 1 ){
                System.out.print("Enter an element : ");
                n = sc.nextInt();
                 list.addNode(n);
                 System.out.println();
            }

            if( c == 2 ){
                System.out.print("Enter an element : ");
                n = sc.nextInt();
                
                 System.out.println();
            }

            if( c == 3 ){
                System.out.print("Enter an element : ");
                n = sc.nextInt();

                 System.out.println();
            }

            if( c == 4 ){
                

                 System.out.println();
            }

            if( c == 5 ){
                list.f_display();
                System.out.println();
            }

            if( c == 6 ){
                list.r_display();
                System.out.println();
            }

        } while (c != 7);
        System.out.println("Quiting....");

        sc.close();
    }
}