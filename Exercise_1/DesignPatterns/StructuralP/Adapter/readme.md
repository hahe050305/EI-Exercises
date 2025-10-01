Intro:
This project demonstrates how a shopping system can work with multiple payment gateways that have different interfaces, without changing existing code.

Core Idea:
Use a PaymentAdapter to adapt various payment services like GPay, PhonePe, and PayTM to a common PaymentGateway interface.

Folder/Class Purpose:

PaymentGateway → common interface for all payment methods

PaymentAdapter → adapts different payment services to the PaymentGateway interface

Main → demonstrates using multiple payment gateways seamlessly

Design Principle Used:
Adapter Pattern – allows incompatible interfaces to work together, enabling flexibility and code reuse.

Worked Outputs:

<img width="998" height="175" alt="image" src="https://github.com/user-attachments/assets/2ca1c866-d2b6-42e4-83c7-47a5802fe887" />
