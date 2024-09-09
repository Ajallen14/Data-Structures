#include <stdio.h>
#include <stdlib.h>

#define MAX 10

int array[MAX], front, rear;

void initializeQueue();
int isEmpty();
int isFull();
void insertFront(int x);
void insertRear(int x);
int deleteFront();
int deleteRear();
void display();

int main() {
    int n;

    initializeQueue();

    int c;
    float c_c;
    do
    {
        printf("Enter 1 for Enqueue\n");
        printf("Enter 2 for Dequeue\n");
        printf("Enter 3 for Display\n");
        printf("Enter 4 for exit\n");
        printf("Enter ur choice : ");
        scanf("%d", &c);
        if(c==1){
            printf("Enter 1.1 for insertion at front\n");
            printf("Enter 1.2 for insertion at rear\n");
            printf("Enter ur choice : ");
            scanf("%f", &c_c);
            if(c_c == 1.1){
                printf("Enter the element to push: ");
                scanf("%d", &n);
                insertFront(n);
            }if(c_c == 1.2){
                printf("Enter the element to push: ");
                scanf("%d", &n);
                insertFront(n);
            }
        }
        if(c==2){
            printf("Enter 2.1 for deletion at front\n");
            printf("Enter 2.2 for deletion at rear\n");
            printf("Enter ur choice : ");
            scanf("%f", &c_c);
            if(c_c == 1.1){
                deleteFront();
            }if(c_c == 1.2){
                deleteRear();
            }
        }
        if(c==3){
            display();
        }
    }while (c!=4);
}

void initializeQueue() {
    front = rear = -1;
}

int isEmpty() {
    if (front == -1) {
        return 1;
    }

    return 0;
}

int isFull() {
    if ((front == 0 && rear == MAX-1) || (front == rear + 1)) {
        return 1;
    }

    return 0;
}

void insertFront(int x) {
    if (isFull()) {
        printf("Queue Overflow!\n");
        return;
    }

    if (front == -1) {
        front = rear = 0;
    }

    else if (front == 0) {
        front = MAX-1;
    }

    else {
        front = front - 1;
    }

    array[front] = x;
}

void insertRear(int x) {
    if (isFull()) {
        printf("Queue Overflow!\n");
        return;
    }

    if (front == -1) {
        front = 0;
    }

    if (rear == MAX-1) {
        rear = 0;
    }

    else {
        rear += 1;
    }

    array[rear] = x;
}

int deleteFront() {
    int x;

    if (isEmpty()) {
        printf("Queue Underflow!\n");
        exit(1);
    }

    x = array[front];

   if (front == rear) {
    front = rear = -1;
   } 

   else if (front == MAX-1) {
    front = 0;
   }

   else {
    front += 1;
   }

   return x;
}

int deleteRear() {
    int x;

    if (isEmpty()) {
        printf("Queue Underflow!\n");
        exit(1);
    }

    x = array[rear];

    if (front == rear) {
        front = rear = -1;
    }

    else if (rear == 0) {
        rear = MAX-1;
    }

    else {
        rear = rear-1;
    }

    return x;
}

void display() {
    if (isEmpty()) {
        printf("Empty Queue!\n");
        return;
    }

    printf("Queue is: \n");
    
    int i = front;

    if (front <= rear) {
        while (i <= rear) {
            printf("%d\t", array[i++]);
        }
    }

    else {
        while (i <= MAX-1) {
            printf("%d\t", array[i++]);
        }

        i = 0;

        while (i <= rear) {
            printf("%d\t", array[i++]);
        }
    }

    printf("\n");
}