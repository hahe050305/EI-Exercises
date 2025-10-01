Intro:
This project shows how different sorting algorithms can be swapped easily without changing the client code.

Core Idea:
Use a SortingStrategy interface and implement multiple sorting algorithms (e.g., BubbleSort, InsertionSort). The client just chooses which strategy to use.

Folder/Class Purpose:

SortingStrategy → common interface

BubbleSort, InsertionSort → algorithm implementations

SorterClient → picks and executes sorting

Design Principle Used:
Strategy Pattern – defines a family of algorithms and makes them interchangeable.

Worked Outputs:

<img width="565" height="158" alt="image" src="https://github.com/user-attachments/assets/dc26ab53-c145-44dc-bcdf-6dd31e5be034" />
