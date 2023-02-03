# CFG Playground

## Notes

- This project uses Gradle
- The code is written in Java

## Useful links

- [Java 8 documentation](https://docs.oracle.com/javase/8/docs/api/)
    - [java.util.Collection](https://docs.oracle.com/javase/8/docs/api/java/util/Collection.html)
    - [java.util.Stack](https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html)
    - [java.util.PriorityQueue](https://docs.oracle.com/javase/8/docs/api/java/util/PriorityQueue.html)
- [AssertJ](https://assertj.github.io/doc/#assertj-core-simple-example)

## Exercises

### February 3rd, 2023

#### Problem

Take a collection of numbers and create new collection containing

1. The numbers in the reverse of "arrival" order
2. Followed by the numbers in their descending natural order

For example, if your input is:

```  
1,3,2
```  

then the result will be:

```  
2,3,1,3,2,1
```  

---
Decomposing this you would create a collection that would contain:

1. The numbers in the reverse of "arrival" order: `2,3,1`
2. Followed by the numbers in their descending natural order: `3,2,1`
3. -> `2,3,1,3,2,1`

__Tip:__ Using collections built-in algorithms can help solve this faster
than writing the algorithms.

#### Bonus

Transform the `transformWorks` test into a parameterised test incorporating the example above.
