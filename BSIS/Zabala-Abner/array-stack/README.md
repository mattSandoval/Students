Stack
=======================
![arraystack01](https://cloud.githubusercontent.com/assets/20467857/19293634/9d9f60d2-9058-11e6-9420-94a2f441fb31.png)
===>
![arraystack02](https://cloud.githubusercontent.com/assets/20467857/19293635/9dae3f26-9058-11e6-8e2b-c28b6e7eba4e.png)
===>
![arraystack03](https://cloud.githubusercontent.com/assets/20467857/19293636/9db941fa-9058-11e6-8bdd-041558effeb7.png)
===>
![arraystack04](https://cloud.githubusercontent.com/assets/20467857/19293637/9db9ad34-9058-11e6-9d74-05dd4b030450.png)
===>
![arraystack05](https://cloud.githubusercontent.com/assets/20467857/19293638/9dcb639e-9058-11e6-88cc-f4118c129638.png)


## Description

 - A STACK is an ADT (abstract data type) in LIFO order (last in, first out).
 - It has 2 main operations: (1) PUSH for adding, and (2) POP for removing elements.
 - It is a protected SINGLY LINKED LIST where PUSH and POP are only allowed on the top front or last element in the stack.
 - You may also PEEK to show the last element added.
 - Implementation can either be in ARRAY or LINKED LIST.
 - It's algorithmic complexity is CONSTANT or O(1).

## To Do:

 - Implement a STACK using ARRAY that can hold a maximum of 10 string values.
 - Create operations PUSH, POP, and PEEK.
 - Allow PUSH only if the stack is not yet full.
 - Allow POP only if the stack is not yet empty.
 - Allow PEEK to see the topmost topmost element.
 - Show the updated ARRAY STACK everytime you PUSH or POP.

## Pseudocode:

    START PROGRAM
    
     SET capacity, top, stack[]
    
     PROCEDURE show
      FOR EACH element IN stack.capacity
       PRINT stack[element]
    
     PROCEDURE isEmpty
      IF stack[0] == null
       PRINT stack is empty
       return TRUE
    
     PROCEDURE isFull
     IF top == capacity
       PRINT stack is full
       return TRUE
    
     PROCEDURE push(element)
      IF isFull
       PRINT add failed
      ELSE
       PRINT trying to push on stack[top]
       storage[top] = element
       top++
       PRINT element was successfully added
    
     PROCEDURE pop
      IF isEmpty
       PRINT remove failed
      ELSE
       PRINT trying to push on stack[top]
       storage[top] = null
       top--
      PRINT storage[top] was successfully removed
      
     PROCEDURE peek
      IF isEmpty
       PRINT NULL
      ELSE 
       PRINT storage[top]
    
     PROCEDURE main
     // show that stack is empty
     // push 10 integers until stack is full
     // show updated stack
     // try to push again, expect push error message
     // pop last element
     // peek last element
     // pop all elements until stack is empty
     // show updated stack
     // try to pop again, expect pop error message
    
    END PROGRAM 
