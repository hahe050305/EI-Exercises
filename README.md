This repository involves the workdone proofs of two exercises provided by E and I

Exercise 1:-  Problem Statement on Design patterns 

This repository demonstrates 6 core design patterns grouped into Creational, Structural, and Behavioral categories.

Each example uses multiple classes, follows SOLID principles, and is based on real-world analogies.


Creational Patterns:-

i) Singleton – DatabaseConnection

Only one database connection should exist at a time.

This pattern ensures controlled object creation.

"DatabaseConnection.getInstance()" always returns the same instance.

ii) Factory – Vehicle Factory

A user asks for a car or bike, and the factory decides which object to create.

This promotes loose coupling and follows the open/closed principle.

Structural Patterns:-

i) Adapter – Payment Gateway

The old system (`OldPaymentProcessor`) is adapted to a new interface (`PaymentGateway`).

This is commonly used when integrating legacy code into modern applications.

ii) Decorator – Pizza Toppings

Start with a `BasicPizza` and dynamically add toppings such as `Cheese` or `Olives`.

This extends functionality without modifying the original class.

Behavioral Patterns:-

i) Observer – Store & Customers

Customers subscribe to store updates.

 When a new product arrives, all subscribed customers are automatically notified.

ii) Strategy – Sorting Algorithms

The program can choose between different algorithms such as BubbleSort or InsertionSort at runtime.


Exercise:-2 

To develop a satellite command system

My Planning of folder creation and functonality spread:-
 
   To organise the various set of classes through 4 different folder structures by the corresponding import of the "packages".

Folder structure designing:-

  core/ → The heart of the system. Contains the Satellite class and satellite states (Normal/Failure).

  commands/ → Implements the Command Pattern. Each user operation (rotate, activate panels, collect data…) is its own command class.

  invoker/ → The command manager (CommandInvoker) that executes, tracks history, and supports undo.

  utils/ → Helpers like LoggerUtility for logging and InvalidOperationException for controlled errors.

  Main.java → The entry point. Handles user interaction and simulates the satellite launch.

Design Pattern Followed :- 

   [ Command Pattern => Encapsulation of each operation as a command object
  
   [ State Pattern (lightweight) → Normal vs Failure mode handling in the satellite

   Singleton (optional idea) → Could be used for logging or central mission control]
  
   Adapter (future upgrade) → To swap console input with WebSocket/HTTP input]

Overview and purpose of each classes:-

  1) Satellite ==> To keep track of the orientation, panels and data collected
    
  3) RotateCommand ==> To change the orientation of satellite

  4) PanelActivationCommands ==> Activate (data collection is done) , Deactive panels(no data collection allowed)
     
  6) CollectDataCommand → Collects data (only if panels are active).

  7) CommandInvoker → Executes commands, maintains history, and supports undo.
     
  9) LoggerUtility → Friendly timestamped logs of what the satellite is doing.

  10) InvalidOperationException → Custom exception for invalid actions (like trying to collect data with inactive panels).


