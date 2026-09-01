session-08-01/09/26

# Class Reflection
- Understanding the relationship between linear equations, variables, and unique solutions
- Implementing interactive graphical applications using event listeners in Java
- Exploring data structures for graphical representation, specifically stacks for undo operations
- Defining and implementing binary trees and ASCII-based tree visualization


## Keywords
Linear Equations, Determinant, Rank, MouseListener, Stack, Queue, Binary Tree, ASCII Art


## List of topics discussed:
- **Linear Systems and Solutions** – equations, variables, determinant, and rank
- **Interactive Graphics Programming** – MouseListeners, coordinates, and distance-based hit detection
- **Undo Functionality** – using a Stack (LIFO) vs. a Queue (FIFO)
- **Binary Trees** – nodes, edges, children, and drawing trees within canvas bounds


## Notes

### Topic 1 - Linear Systems and Solutions
- A system with fewer equations than variables results in non-unique solutions
- A unique solution requires the number of equations to equal the number of variables (square matrix)
- The determinant of the matrix must be non-zero for a unique solution to exist
- **Rank** is the number of linearly independent rows or columns in a matrix

### Topic 2 - Interactive Graphics Programming
- Use `MouseListener`s to handle user input like clicks and drags on a canvas
- Event objects provide coordinates (X, Y) for drawing shapes
- To check if a point is inside a circle, calculate the distance from the point to the center and compare it to the radius
- **Distance formula:** `sqrt((x2 - x1)^2 + (y2 - y1)^2)`

### Topic 3 - Undo Functionality
- Use a **Stack** data structure to keep track of drawn objects for undo (LIFO)
- A **Queue** is not suitable for undo operations, as it follows FIFO logic

### Topic 4 - Binary Trees
- A tree consists of nodes and edges, where each node has at most one parent (except the root)
- A **binary tree** restricts nodes to a maximum of two children
- Drawing trees requires careful calculation of node positions to ensure they fit within the canvas boundaries

## Review Questions
- **Why is a square matrix required for a unique solution in a system of linear equations?**
  - *Reference: Linear Systems and Solutions > Determinant and Rank*
- **What is the primary difference between a Stack and a Queue in the context of an undo operation?**
  - *Reference: Interactive Graphics Programming > Undo Functionality*

## Advanced Questions
- How would you modify the circle-drawing program to handle overlapping circles when determining which one to delete during an undo operation?
- Compare the constraints of rendering graphics on a canvas versus printing an ASCII tree to a console. How does the 'left-to-right, top-to-bottom' constraint affect your data structure traversal?