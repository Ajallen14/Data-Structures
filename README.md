## [**STACK**](https://github.com/Ajallen14/Data-Structures/blob/master/Stack/stack.c)
A stack is a fundamental data structure in computer science that follows the *Last-In-First-Out (LIFO)* principle. It's a collection of elements that are added and removed from the top of the stack.


**Main operations** :
* Push
* Pop
* Display

        +---+---+---+---+
        | 5 | 6 | 7 |   |  => Push
        +---+---+---+---+
          f       r

        +---+---+---+---+
        | 5 | 6 |   |   |  => Pop
        +---+---+---+---+
          f   r    

## [**QUEUE**](https://github.com/Ajallen14/Data-Structures/blob/master/Queue/queue.c)
A queue is a fundamental data structure in computer science that follows the *First-In-First-Out (FIFO)* principle. It's a linear collection of elements, where elements are added and removed in a specific order

**Main operations** :
* Enqueue
* Dequeue
* Display

        +---+---+---+---+
        | 5 | 6 | 7 |   |  => Enqueue
        +---+---+---+---+
          f       r

        +---+---+---+---+
        |   | 6 | 7 |   |  => Dequeue
        +---+---+---+---+ 
              f   r

### [**Circular Queue**](https://github.com/Ajallen14/Data-Structures/blob/master/Queue/circular_queue.c)
A circular queue is a type of data structure that follows the FIFO (First-In-First-Out) principle, where the last element is connected to the first element to form a circle

        +---+---+---+---+
        | 5 | 6 | 7 | 8 |  => Enqueue
        +---+---+---+---+
          f           r

        +---+---+---+---+
        |   | 6 | 7 | 8 |  => Dequeue
        +---+---+---+---+ 
               f      r

        +---+---+---+---+
        | 9 | 6 | 7 | 8 |  => Enqueue
        +---+---+---+---+ 
          r   f

**Advantages**:
- Efficient Use of Space: Circular queues can be implemented using a fixed-size array, making them more memory-efficient.
- Faster Operations: Enqueue and dequeue operations are faster in circular queues compared to linear queues.

**Disadvantages**:
- Complex Implementation: Circular queues are more challenging to implement than linear queues.
- Risk of Overwriting: If not implemented correctly, there is a risk of overwriting the front element when the queue is full.

### [**Priority Queue**]()


### [**Deque (Double Ended Queue)**]()

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


## [**POLYNOMIAL ADDITION**](https://github.com/Ajallen14/Data-Structures/blob/master/Polynomial%20Addition/Poly_add.c)

* **readPolynomial(Poly *p)**: Reads a polynomial from the user, including the number of terms, coefficients, and exponents.

* **addPolynomial(Poly *p1, Poly *p2, Poly *p3, int term1, int term2)**: Adds two polynomials p1 and p2 and stores the result in p3.

* **displayPolynomial(Poly *p, int terms)**: Displays a polynomial in the format (coefficient)x^(exponent) + ...

### Working

* S1 : Compare the exponents of the current terms in p1 and p2. If they are equal, add the coefficients and store the result in p3.

* S2 : If the exponent of p1 is greater, copy the term from p1 to p3.

* S3 : If the exponent of p2 is greater, copy the term from p2 to p3.

* S4 : Repeat steps 1-3 until all terms from both polynomials have been processed.


       P1                P2               P3
      +---+             +---+           +---+ 
      | 5 |             | 4 |           | 5 | 
      +   +             +   +           +   + 
      | 3 |             | 2 |           | 3 | 
      +---+             +---+           +---+ 
      | 3 |             | 9 |           | 7 | 
      +   +             +   +           +   + 
      | 2 |             | 0 |           | 2 | 
      +---+             +---+           +---+ 
      | 4 |                             | 4 | 
      +   +                             +   + 
      | 1 |                             | 1 | 
      +---+                             +---+ 
                                        | 9 |
                                        +   +
                                        | 0 |
                                        +---+  