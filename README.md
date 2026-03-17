# Journal App Documentation

## Overview
The Journal App is a web application designed to allow users to create, manage, and share journal entries securely. It incorporates various modern technologies to provide a comprehensive and seamless user experience.

## Features
- **User Authentication**: The Journal App uses JWT (JSON Web Token) for secure authentication, ensuring that user sessions are handled safely.
- **OAuth with Google**: Users can log in using their Google accounts, making it easy and convenient to access their journals without managing extra credentials.
- **Database**: The application utilizes MongoDB for storing journal entries and user data, offering flexibility and scalability in data management.
- **Caching**: Redis is integrated for caching frequently accessed data, improving performance and response times.
- **Security**: Spring Security is employed to secure the application and manage user access levels efficiently.
- **Email Functionality**: Users can receive notifications and updates through email, improving engagement and user experience.

## Swagger UI
The API of the Journal App is documented using Swagger UI. This allows developers to easily explore and interact with the API endpoints.

### Accessing Swagger UI
1. Start the application.
2. Navigate to `http://localhost:{port}/swagger-ui/` to view the available API endpoints and their documentation.

## Installation
To set up the Journal App locally, follow these steps:
1. Clone the repository:
   ```bash
   git clone https://github.com/Shreyansh-sys/journalApp.git
   ```
2. Navigate to the project directory:
   ```bash
   cd journalApp
   ```
3. Install the necessary dependencies:
   ```bash
   mvn install
   ```
4. Run the application:
   ```bash
   mvn spring-boot:run
   ```

## Usage
Once the application is running, you can create an account, log in, and start managing your journal entries. Explore the API via Swagger UI to interact programmatically.

## Conclusion
The Journal App combines cutting-edge technologies to provide users with a secure, efficient, and enjoyable journaling experience. We welcome contributions and feedback to further improve the application!