import java.util.Scanner;

public class s_linked_list {

    class Node{
        int data; 
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void addNode(int data){ //TO ADD A NEW NODE
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
        }else{
            tail.next = newNode;
        }
        tail = newNode;
        System.out.println("Element is added\n");
    }

    public void addNodeAfter(int nextTo, int data){ //TO ADD A NEW NODE BETWEEN TO NODES
        Node newNode = new Node(data);
        Node temp = head;

        while(temp != null && temp.data != nextTo){
            temp = temp.next;
        }

        if(temp == null){
            System.out.println("Positon not found\n");
            return;
        }

        if(temp == tail){
            tail.next = newNode;
            tail = newNode;
            System.out.println("Element is added\n");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        System.out.println("Element is added\n");

    }    


    public void delete(int data){ //TO DELETE A NUMBER
        Node temp = head, prev = null;
        if(temp != null && temp.data == data){ //Deletion in head
            head = temp.next;
            System.out.println("Element is deleted\n");
            return;
        }

        while(temp !=null && temp.data != data){ //Deletion in between an element 
            prev = temp;
            temp = temp.next;
        }

        if(temp == null){ //Given element not present
            System.out.println("Element is not present to delete\n");
            return;
        }

        if(temp == tail){ //Deletion in tail
            tail = prev;
            tail.next = null;
            System.out.println("Element is deleted\n");
            return;
        }

        prev.next = temp.next;
        System.out.println("Element is deleted\n");
    }

    public void display(){ //TO DISPLAY THE LIST
        if(head == null){
            System.out.println("List is empty\n");
            return;
        }

        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    
    public void main(String[] args) {
        s_linked_list list = new s_linked_list();
        Scanner sc = new Scanner(System.in);

        int c;
        do{
            System.out.println("Enter 1 to Add an element");
            System.out.println("Enter 2 to Add an element between to element");
            System.out.println("Enter 3 to Delete an element");
            System.out.println("Enter 4 to Display");
            System.out.println("Enter 5 to Exit");
            System.out.print("Enter ur choice :");
            c= sc.nextInt();

            if(c == 1){
                int n;
                System.out.print("Enter a no : ");
                n = sc.nextInt();
                list.addNode(n);
            }

            if(c == 2){
                int p, n;
                System.out.print("Enter the element after which the new element should be added : ");
                p = sc.nextInt();
                System.out.print("Enter a no which is to be added : ");
                n = sc.nextInt();
                list.addNodeAfter(p,n);
            } 

            if(c == 3){
                int n;
                System.out.print("Enter an elemet to delete : ");
                n = sc.nextInt();
                list.delete(n);
            }

            if(c == 4){
                list.display();
                System.out. println();
            }
        }while(c != 5);
        System.out.println("Quiting!!!");
        sc.close();
    }
}