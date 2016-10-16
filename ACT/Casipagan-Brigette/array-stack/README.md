Stack
=======================

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
    
    --------------
    
    
    
    OUTPUT
    
    
    
    STORAGE CAPACITY = 10

stack[9] = null
stack[8] = null
stack[7] = null
stack[6] = null
stack[5] = null
stack[4] = null
stack[3] = null
stack[2] = null
stack[1] = null
stack[0] = null

STORAGE IS EMPTY.

Remove Failed.
PEEK TOP = null

... trying to push on stack[0] ...
one was successfully added.

stack[9] = null
stack[8] = null
stack[7] = null
stack[6] = null
stack[5] = null
stack[4] = null
stack[3] = null
stack[2] = null
stack[1] = null
stack[0] = one

PEEK TOP = one

... trying to push on stack[1] ...
two was successfully added.

stack[9] = null
stack[8] = null
stack[7] = null
stack[6] = null
stack[5] = null
stack[4] = null
stack[3] = null
stack[2] = null
stack[1] = two
stack[0] = one

PEEK TOP = two

... trying to push on stack[2] ...
three was successfully added.

stack[9] = null
stack[8] = null
stack[7] = null
stack[6] = null
stack[5] = null
stack[4] = null
stack[3] = null
stack[2] = three
stack[1] = two
stack[0] = one

PEEK TOP = three

... trying to push on stack[3] ...
four was successfully added.

stack[9] = null
stack[8] = null
stack[7] = null
stack[6] = null
stack[5] = null
stack[4] = null
stack[3] = four
stack[2] = three
stack[1] = two
stack[0] = one

... trying to push on stack[4] ...
five was successfully added.

stack[9] = null
stack[8] = null
stack[7] = null
stack[6] = null
stack[5] = null
stack[4] = five
stack[3] = four
stack[2] = three
stack[1] = two
stack[0] = one

... trying to pop stack[4] ...
five was successfully removed.

... trying to push on stack[4] ...
six was successfully added.

... trying to push on stack[5] ...
seven was successfully added.

... trying to push on stack[6] ...
eight was successfully added.

... trying to push on stack[7] ...
nine was successfully added.

... trying to push on stack[8] ...
ten was successfully added.

stack[9] = null
stack[8] = ten
stack[7] = nine
stack[6] = eight
stack[5] = seven
stack[4] = six
stack[3] = four
stack[2] = three
stack[1] = two
stack[0] = one

PEEK TOP = ten

... trying to push on stack[9] ...
eleven was successfully added.

Storage is full.
Add Failed.
stack[9] = eleven
stack[8] = ten
stack[7] = nine
stack[6] = eight
stack[5] = seven
stack[4] = six
stack[3] = four
stack[2] = three
stack[1] = two
stack[0] = one

