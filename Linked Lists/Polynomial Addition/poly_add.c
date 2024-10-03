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
    
}