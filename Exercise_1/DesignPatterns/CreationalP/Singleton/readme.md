Intro:
This project demonstrates how to ensure a class has only one instance, useful for managing shared resources like a database connection.

Core Idea:
Use a single DatabaseConnection instance accessed via a static "Database.getInstance()" method to avoid multiple connections and ensure consistency.

Folder/Class Purpose:

DatabaseConnection → manages a single instance of the database connection

Main → demonstrates usage of the singleton instance and verifies only one object exists

Design Principle Used:
Singleton Pattern – ensures only one instance exists and provides a global access point

Worked Outputs:

<img width="619" height="159" alt="image" src="https://github.com/user-attachments/assets/5434322a-36df-488a-814c-f5b57bace0ce" />
