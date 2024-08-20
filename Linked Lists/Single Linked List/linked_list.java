import java.util.Scanner;

public class linked_list {

    class Node{
        int data; 
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void addNode(int data){ //TO ADD NEW NODE
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
        }else{
            tail.next = newNode;
        }
        tail = newNode;
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
        linked_list list = new linked_list();
        Scanner sc = new Scanner(System.in);

        int c;
        do{
            System.out.println("Enter 1 to Add an element");
            System.out.println("Enter 2 to Delete an element");
            System.out.println("Enter 3 to Display");
            System.out.println("Enter 4 to Exit");
            System.out.print("Enter ur choice :");
            c= sc.nextInt();

            if(c == 1){
                int n;
                System.out.print("Enter a no : ");
                n = sc.nextInt();
                list.addNode(n);
            }

            if(c == 2){
                int n;
                System.out.print("Enter an elemet to delete : ");
                n = sc.nextInt();
                list.delete(n);
            }

            if(c == 3){
                list.display();
                System.out. println();
            }
        }while(c != 4);
        sc.close();
    }
}