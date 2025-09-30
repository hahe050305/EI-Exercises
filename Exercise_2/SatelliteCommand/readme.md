Given Problem Statement:-

   You are tasked with developing a Satellite Command System that simulates controlling a satellite in orbit. 
   The satellite starts in a default initial state and can accept a series of commands to change its orientation, solar panel status, and data collection.

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


Working Overview:-

a) Display of initial conditions:

<img width="1048" height="466" alt="image" src="https://github.com/user-attachments/assets/a680810b-3ad6-4f80-bba3-efe0234b2447" />

b) Performing the satellite operations and status check:

<img width="813" height="237" alt="image" src="https://github.com/user-attachments/assets/f9047726-5d05-4dba-bfb3-ef909bf019d9" />

<img width="615" height="187" alt="image" src="https://github.com/user-attachments/assets/90ec7812-2f6e-4c8f-8ba0-b7db1c77521d" />

c) System failure simulation and recovery mode:-

<img width="615" height="187" alt="image" src="https://github.com/user-attachments/assets/33c1abf3-4e47-4f5d-9fc2-a997976c79c4" />

<img width="1053" height="80" alt="image" src="https://github.com/user-attachments/assets/8bb7eb19-253b-42d0-8b8f-31c6641ce8d9" />

d) Invalid command handling:-

<img width="491" height="87" alt="image" src="https://github.com/user-attachments/assets/84269ea5-e0ce-4f2d-bed5-7d1a54b16615" />

e) Recovery Mode and Normal Working:-

<img width="918" height="81" alt="image" src="https://github.com/user-attachments/assets/ee9d3293-1377-4a8d-aea1-bb2f30767b66" />

<img width="719" height="82" alt="image" src="https://github.com/user-attachments/assets/6f134b00-de1d-47b7-9b62-547265d53c67" />




  

