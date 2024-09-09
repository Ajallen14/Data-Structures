#include <stdio.h>
#include <stdlib.h>

typedef struct {
    int data;
    int priority;
} Element;

typedef struct {
    Element *array;
    int size;
    int capacity;
} PriorityQueue;

PriorityQueue* createPriorityQueue(int capacity) {
    PriorityQueue* queue = (PriorityQueue*) malloc(sizeof(PriorityQueue));
    queue->array = (Element*) malloc(sizeof(Element) * capacity);
    queue->size = 0;
    queue->capacity = capacity;
    return queue;
}

int isEmpty(PriorityQueue* queue) {
    return queue->size == 0;
}

int isFull(PriorityQueue* queue) {
    return queue->size == queue->capacity;
}

void enqueue(PriorityQueue* queue, int data, int priority) {
    if (isFull(queue)) {
        printf("Queue is full\n");
        return;
    }

    Element newElement;
    newElement.data = data;
    newElement.priority = priority;

    for (int i = queue->size; i > 0; i--) {
        if (queue->array[i - 1].priority < priority) {
            queue->array[i] = queue->array[i - 1];
        } else {
            break;
        }
    }

    queue->array[queue->size] = newElement;
    queue->size++;
}

void dequeue(PriorityQueue* queue) {
    if (isEmpty(queue)) {
        printf("Queue is empty\n");
        return;
    }

    for (int i = 0; i < queue->size - 1; i++) {
        queue->array[i] = queue->array[i + 1];
    }

    queue->size--;
    printf("Element is removed");
}


void display(PriorityQueue* queue) {
    for (int i = 0; i < queue->size; i++) {
        printf("Data: %d, Priority: %d\n", queue->array[i].data, queue->array[i].priority);
    }
}

int main() {
    int s;
    printf("Size of the queue :");
    scanf("%d", &s);
    PriorityQueue* queue = createPriorityQueue(s);

	int c;
	do{
		printf("Enter 1 for Enqueue \n");
		printf("Enter 2 for Dequeue \n");
		printf("Enter 3 for Display \n");
		printf("Enter 4 for Exit \n");
		printf("Enter ur choice : ");
		scanf("%d", &c);
		
		if(c==1){
			int data, pri;
			printf("Enter a no :");
			scanf("%d", &data);
            printf("enter the priority");
            scanf("%d", &pri);
			enqueue(queue, data, pri);
            printf("\n");
		}
		
		if(c==2){
			dequeue(queue);
            printf("\n");
		}
		
		if(c==3){
			display(queue);
            printf("\n");
		}
	}while(c!=4);
    printf("Quitting...");
}