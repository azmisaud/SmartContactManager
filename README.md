# Smart Contact Manager

<<<<<<< HEAD
A modern web application for managing contacts efficiently in the cloud. This project is currently under development.
> **Learning Journey**: This project was created as part of my Spring Boot learning journey. Special thanks to [Learn Code with Durgesh](https://www.youtube.com/@LearnCodeWithDurgesh) for their excellent tutorials and guidance in Spring Boot development.
=======
> A cloud-based contact management system built with Spring Boot and Thymeleaf. Store, organize, and manage your contacts efficiently with a modern, responsive interface.

A modern web application for managing contacts efficiently in the cloud. This project is currently under development.

>>>>>>> b1c8950 (Add local README.md)
## Tech Stack

### Backend
- Java 21
- Spring Boot 3.4.5
- Spring Data JPA
- MySQL Database
- Maven

### Frontend
- Thymeleaf
- Tailwind CSS
- HTML/CSS

## Features (Planned/In Progress)
- Contact management (Add, Edit, Delete, View)
- Cloud storage for contacts
- User authentication and authorization
- Responsive design
- Search and filter contacts

## Prerequisites
- Java 21 or higher
- Maven
- MySQL
- Node.js (for Tailwind CSS)

## Setup Instructions

1. Clone the repository
```bash
git clone [repository-url]
```

2. Configure MySQL database
- Create a new database
- Update the database configuration in `src/main/resources/application.properties`

3. Build and run the backend
```bash
mvn clean install
mvn spring-boot:run
```

4. For development with Tailwind CSS
```bash
npm install
npm run dev
```

## Project Structure
- `src/main/java` - Backend Java code
- `src/main/resources` - Configuration files and static resources
- `src/main/resources/static` - Frontend assets
- `src/test` - Test files
<<<<<<< HEAD
=======

## Contributing
This project is under active development. Feel free to contribute by:
1. Forking the repository
2. Creating a feature branch
3. Submitting a pull request

## License
ISC License 
>>>>>>> b1c8950 (Add local README.md)
