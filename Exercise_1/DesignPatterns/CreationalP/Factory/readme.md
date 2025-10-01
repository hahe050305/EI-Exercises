Intro
This project shows how a factory can decide which vehicle object (Car or Bike) to create, without exposing the creation logic to the user.

Core Idea
The client only requests a vehicle type (like "car" or "bike"). The factory takes care of object creation. This removes direct dependency between client and concrete classes.

Folder/Class Purpose

Vehicle → common interface (all vehicles implement this).

Car, Bike → concrete vehicle classes.

VehicleFactory → contains logic to create and return the correct vehicle object.

Client → requests a vehicle from the factory and uses it.

Design Principle Used

Factory Pattern → encapsulates object creation logic.

Loose Coupling → client only depends on Vehicle, not Car or Bike.

Open/Closed Principle → new vehicles can be added without changing client code.

Worked Outputs:-

<img width="1073" height="241" alt="image" src="https://github.com/user-attachments/assets/6ffadc7c-d48d-4341-9da4-128541bfdc94" />

