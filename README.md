# Employee Management System

A console-based Employee Management System built with Java, demonstrating the MVC (Model-View-Controller) architecture pattern.

## 🚀 Features

- **Create Employee**: Add new employees with name, salary, and hire date
- **View All Employees**: Display employees in a paginated table format
- **View Employee by ID**: Search and display a specific employee
- **Update Employee**: Modify existing employee information
- **Delete Employee**: Remove employees from the system
- **Pagination**: Navigate through employee records with customizable page size
- **Input Validation**: Ensures data integrity with proper validation rules

## 📋 Prerequisites

- Java 11 or higher
- Lombok library
- texttablefmt library for table formatting

## 🛠️ Technologies Used

- **Java**: Core programming language
- **Lombok**: Reduces boilerplate code with annotations
- **texttablefmt**: Creates formatted console tables
- **MVC Pattern**: Separates concerns for better code organization

## 📁 Project Structure

```
miniProjet/
├── src/
│   ├── Main.java                          # Application entry point
│   ├── controller/
│   │   └── EmployeeController.java        # Handles user interactions
│   ├── view/
│   │   └── EmployeeView.java              # Manages UI and display
│   ├── model/
│   │   ├── entities/
│   │   │   └── Employee.java              # Employee entity
│   │   ├── dao/
│   │   │   ├── EmployeeDao.java           # Data Access Object interface
│   │   │   └── EmployeeDaoImpl.java       # DAO implementation
│   │   └── service/
│   │       ├── EmployeeService.java       # Business logic interface
│   │       └── EmployeeServiceImpl.java   # Service implementation
│   ├── dto/
│   │   ├── EmployeeCreateDto.java         # Data Transfer Object for creation
│   │   ├── EmployeeUpdateDto.java         # Data Transfer Object for updates
│   │   ├── EmployeeDeleteDto.java         # Data Transfer Object for deletion
│   │   └── EmployeeResponse.java          # Response object
│   ├── mapper/
│   │   └── EmployeeMapper.java            # Maps between entities and DTOs
│   ├── db/
│   │   └── EmployeeDb.java                # In-memory database
│   └── exception/
│       └── EmployeeException.java         # Custom exception handling
└── README.md
```

## 🎯 Architecture

The project follows the **MVC (Model-View-Controller)** pattern:

- **Model**: Contains business logic, data access layer, and entities
- **View**: Handles console input/output and display formatting
- **Controller**: Coordinates between Model and View, handles user requests

### Design Patterns Used

1. **MVC Pattern**: Separates presentation, business logic, and data access
2. **DAO Pattern**: Abstracts data persistence operations
3. **DTO Pattern**: Transfers data between layers
4. **Singleton Pattern**: Single instance of database
5. **Dependency Injection**: Constructor-based dependency injection

## 🚦 Getting Started

### Installation

1. Clone the repository:
```bash
git clone https://github.com/yourusername/miniProjet.git
cd miniProjet
```

2. Ensure you have the required dependencies:
   - Add Lombok to your IDE and project
   - Add texttablefmt library to your classpath

3. Compile and run:
```bash
javac -d bin src/**/*.java
java -cp bin Main
```

## 📖 Usage

When you run the application, you'll see a menu with the following options:

```
<<<<<Employee Management System>>>>>

1. Create Employee
2. Get All
3. Get By ID
4. Update Employee
5. Delete Employee
6. Set up page size
7. Go to page
8. Next page
9. Previous page
0. Exit
```

### Examples

**Creating an Employee:**
- Select option 1
- Enter full name, salary, and hire date (format: yyyy-mm-dd)

**Viewing Employees:**
- Select option 2 to view all employees in paginated format
- Use options 8 and 9 to navigate between pages
- Option 6 allows you to customize the page size

**Updating an Employee:**
- Select option 4
- Enter the employee ID and new information

## 🔒 Validation Rules

- Employee name cannot be blank
- Hire date must be at least 18 years before the current date
- All fields are required for create and update operations

## 🤝 Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📝 License

This project is open source and available under the [MIT License](LICENSE).

## 👨‍💻 Author

Your Name - [Your GitHub Profile](https://github.com/yourusername)

## 🙏 Acknowledgments

- Thanks to the Java community for excellent documentation
- Inspired by enterprise-level Java applications
- Special thanks to contributors and testers

## 📧 Contact

For questions or feedback, please open an issue on GitHub.

---

**Note**: This is a demonstration project for learning purposes. It uses an in-memory database, so data is not persisted between application runs.

