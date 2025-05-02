# kotlin-racingcar-precourse

Model
- Car
  - Name
  - Progress
  - with a randomly generated number (0-9), move forward if number is 4 or greater

View
- InputView
  - user input car names
    - comma-separated when entered by the user
    - each car must have a name, not exceed 5 char
  - user input number of rounds
- OutputView
  - display progress of car with car name in each round
  - after the race complete, display the winners
    - can be multiple winners if they reach same final position
    - if multiple winner, names should be displayed in separated by commas.

Controller
- Cars
- NumberOfRounds
- the N cars can move forward or stay still in each round

Util
- with **a randomly generated number (0-9)**, move forward if number is 4 or greater

Exception
- for invalid user inputs, the program should throw an `IllegalArgumentException` and terminate
