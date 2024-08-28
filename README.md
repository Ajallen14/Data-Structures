## [**STACK**](https://github.com/Ajallen14/Data-Structures/blob/master/Stack/stack.c)
* Push
* Pop
* Display

## [**QUEUE**](https://github.com/Ajallen14/Data-Structures/blob/master/Queue/queue.c)
A queue is a fundamental data structure in computer science that follows the First-In-First-Out (FIFO) principle. It's a linear collection of elements, where elements are added and removed in a specific order

**Main operations** :
* Enqueue
* Dequeue
* Display
### [**Circular Queue**](https://github.com/Ajallen14/Data-Structures/blob/master/Queue/circular_queue.c)
A circular queue is a type of data structure that follows the FIFO (First-In-First-Out) principle, where the last element is connected to the first element to form a circle

**Advantages**:
- Efficient Use of Space: Circular queues can be implemented using a fixed-size array, making them more memory-efficient.
- Faster Operations: Enqueue and dequeue operations are faster in circular queues compared to linear queues.

**Disadvantages**:
- Complex Implementation: Circular queues are more challenging to implement than linear queues.
- Risk of Overwriting: If not implemented correctly, there is a risk of overwriting the front element when the queue is full.

## [**POST FIX**](https://github.com/Ajallen14/Data-Structures/blob/master/Post%20fix/post_fix.c)
* If operand - add to postfix
* If left paranthesis - add to stack
* If right paranthesis - pop and add to postfix all operators till left paranthesis
* Operator - pop and add to postfix those operators that have precendence greater than or equal to the scanned operator

## [**SINGLE LIKED LIST**](https://github.com/Ajallen14/Data-Structures/tree/master/Linked%20Lists/Single%20Linked%20List)
### (Using java):
* Node class -> data & Node reference to the next node

        +------+------+
        | DATA | NEXT |
        +------+------+

* 
    - head = first node
    - tail = last node   


* 
    - addNode() : adds a new node with the given data to the end of the list.
    - addNodeAfter() : adds a new node with the given data after a node.
    - delete(): deletes the node with the given data from the list.
    - display(): prints the elements of the list.

### (Using C):
*

## [**DOUBLY LIKED LIST**](https://github.com/Ajallen14/Data-Structures/tree/master/Linked%20Lists/Doubly%20Linked%20List)
### (Using java):
* Node class -> data, Node reference to the next node, Node reference to the previous node

        +------+------+------+
        | PREV | DATA | NEXT |
        +------+------+------+


### (Using C):
*