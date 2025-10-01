
Design Patterns:-

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

    The context decides which algorithm to use, providing flexibility and interchangeability.

