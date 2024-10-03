#include<stdio.h>
#include<stdlib.h>

struct Node{
    int coeff;
    int pow;
    struct Node* next;
};

struct Node* createNode(int c, int p){
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode -> coeff = c;
    newNode -> pow = p;
    newNode -> next = NULL;
    return newNode;
}

struct Node* addPoly(struct Node* head1, struct Node* head2){
    struct Node* temp = createNode(0, 0);
    struct Node* prev = temp; 
    struct Node* cur1 = head1;
    struct Node* cur2 = head2;

    while (cur1 != NULL && cur2!= NULL){
        if(cur1->pow < cur2->pow){
            prev->next = cur2;
            prev = cur2;
            cur2 = cur2->next;
        }else if(cur1->pow > cur2->pow){
            prev->next = cur1;
            prev = cur1;
            cur1 = cur1->pow;
        }else{
            cur1->coeff = cur1->coeff + cur2->coeff;
            prev->next = cur1;
            prev = cur1;
            cur1 = cur1->next;
            cur2 = cur2->next;
        }
    }

    if(cur1 != NULL){
        prev->next = cur1;
    }

    if(cur1 != NULL){
        prev->next = cur2;
    }
    
    return temp->next;
}