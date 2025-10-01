Intro:
This project demonstrates how different document types can be created without exposing creation logic to the client.

Core Idea:
The factory decides whether to create a PDF, Word, or Excel document.

Folder/Class Purpose:

Document → common interface

PDFDocument, WordDocument, ExcelDocument → concrete implementations

DocumentFactory → decides which object to return

Client → asks factory for a document

Design Principle Used:
Factory Pattern – delegates object creation to a dedicated class.

Worked Outputs:-

<img width="1073" height="241" alt="image" src="https://github.com/user-attachments/assets/6ffadc7c-d48d-4341-9da4-128541bfdc94" />
