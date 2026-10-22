# Bank Account Management System

A Java console-based application for practising Object-Oriented Programming (OOP) and basic banking operations.

## Features

- Create a bank account
- View account details
- Deposit money
- Withdraw money
- Validate account details and transaction amounts
- Handle invalid input using exception handling
- Prevent withdrawals that exceed the available balance

## Technologies Used

- Java
- Object-Oriented Programming (OOP)
- `BigDecimal` for monetary calculations
- `Scanner` for user input
- Visual Studio Code

## Project Structure

```text
BankAccountManagementSystem/
├── src/
│   └── bankmanagement/
│       ├── BankAccount.java
│       └── Main.java
└── README.md
```

## How to Run

Make sure Java JDK is installed. Open the terminal in the project folder and compile:

```bash
javac -d out src/bankmanagement/*.java
```

Run the application:

```bash
java -cp out bankmanagement.Main
```

## Concepts Practised

- Classes and objects
- Encapsulation
- Constructors
- Methods
- Loops and switch statements
- Input validation
- Exception handling

## Future Improvements

- Constructor overloading
- Multiple bank accounts
- Transaction history
- Unit testing

## Disclaimer

This is a learning project. It is not connected to a real bank and does not process real financial transactions.

## Author

**Vansh Agrawal**

GitHub: [vansh-agrawal01](https://github.com/vansh-agrawal01)
