<div align="center">

# 🏗️ BuildSphere

### SMART CONSTRUCTION MANAGEMENT SYSTEM

**BUILD • MANAGE • DELIVER**

A centralized digital platform designed to simplify construction operations, streamline project workflows, and improve workforce management.

<br/>

![Java](https://img.shields.io/badge/Java-26-orange?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.1.1-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-Database-4479A1?style=for-the-badge&logo=mysql&logoColor=white)
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-Template%20Engine-005F0F?style=for-the-badge&logo=thymeleaf&logoColor=white)

![HTML5](https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=html5&logoColor=white)
![CSS3](https://img.shields.io/badge/CSS3-1572B6?style=for-the-badge&logo=css3&logoColor=white)
![JavaScript](https://img.shields.io/badge/JavaScript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black)
![Hibernate](https://img.shields.io/badge/Hibernate-ORM-59666C?style=for-the-badge&logo=hibernate&logoColor=white)

<br/>

**[Explore Repository](https://github.com/rsharma09680-lab/Build-sphere)**

</div>

---

# 📌 About The Project

**BuildSphere** is a web-based Construction Management System developed using Java, Spring Boot, Thymeleaf, and MySQL.

It provides a centralized platform for managing essential construction activities, reducing manual work, organizing project information, and improving operational visibility.

The system brings multiple construction management operations together, allowing administrators, owners, and workers to interact with relevant project information through role-oriented interfaces.

### 🎯 Project Vision

To transform traditional construction management into a more organized, efficient, transparent, and technology-driven process.

---

# ✨ Key Features

### 📊 1. Dashboard Management
- Centralized dashboard interface.
- Overview of important construction activities.
- Quick access to management modules.
- Organized project information.

### 🏗️ 2. Project Management
- Add and manage construction projects.
- View project information.
- Update project details.
- Delete project records.

### 👷 3. Worker Management
- Maintain worker information.
- Manage workforce records.
- Organize worker-related data.

### 📅 4. Attendance Management
- Manage worker attendance records.
- Maintain attendance information.
- Monitor workforce attendance.

### 🧱 5. Material Management
- Maintain construction material records.
- View and manage material information.
- Organize material-related data.

### 🚜 6. Equipment Management
- Maintain construction equipment records.
- Manage equipment information.
- Track equipment-related details.

### 📈 7. Daily Progress Tracking
- Record daily construction progress.
- Maintain progress information.
- Monitor project activities.

### 🦺 8. Safety Management
- Organize construction safety information.
- Maintain safety-related records.
- Support construction site safety management.

### 📑 9. Reports Management
- Centralized reports interface.
- Access organized project information.
- Support construction activity monitoring.

### 🔐 10. Role-Based Access
- Admin Dashboard
- Owner Dashboard
- Worker Dashboard
- Role-oriented navigation and access management.

---

# 🛠️ Technology Stack

BuildSphere uses a Java-based full-stack architecture.

| Technology | Purpose |
|---|---|
| Java 26 | Core Programming Language |
| Spring Boot 4.1.1 | Backend Framework |
| Spring MVC | Web Application Architecture |
| Spring Data JPA | Database Operations |
| Hibernate | ORM Framework |
| MySQL | Relational Database |
| Thymeleaf | Server-Side Template Engine |
| HTML5 | Web Structure |
| CSS3 | UI Styling |
| JavaScript | Frontend Interactivity |
| Maven | Dependency Management |
| IntelliJ IDEA | Development Environment |

---

# 🏛️ Project Architecture

BuildSphere follows a layered Spring Boot application architecture.

```text
                 BUILDSPHERE
                      |
          +-----------+-----------+
          |                       |
      FRONTEND                 BACKEND
          |                       |
    HTML / CSS / JS          Spring Boot
          |                       |
      Thymeleaf             Controllers
                                  |
                               Services
                                  |
                              Repositories
                                  |
                              Spring Data JPA
                                  |
                               Hibernate
                                  |
                                MySQL
```

### 📂 Project Structure

```text
BuildSphere/
│
├── src/
│   └── main/
│       │
│       ├── java/
│       │   └── com/buildsphere/ui/
│       │       │
│       │       ├── controller/
│       │       │   ├── AttendanceController.java
│       │       │   ├── DashboardController.java
│       │       │   ├── DailyProgressController.java
│       │       │   ├── EquipmentController.java
│       │       │   ├── MaterialController.java
│       │       │   ├── ProjectController.java
│       │       │   ├── ReportsController.java
│       │       │   ├── SafetyController.java
│       │       │   ├── UserController.java
│       │       │   └── WorkerController.java
│       │       │
│       │       ├── model/
│       │       ├── repository/
│       │       ├── service/
│       │       └── BuildSphereApplication.java
│       │
│       └── resources/
│           │
│           ├── static/
│           │   ├── css/
│           │   ├── js/
│           │   └── images/
│           │
│           ├── templates/
│           │   ├── dashboard.html
│           │   ├── owner-dashboard.html
│           │   ├── worker-dashboard.html
│           │   ├── projects.html
│           │   ├── workers.html
│           │   ├── materials.html
│           │   ├── equipment.html
│           │   ├── attendance.html
│           │   ├── progress.html
│           │   ├── safety.html
│           │   └── reports.html
│           │
│           └── application.properties
│
├── .gitignore
├── pom.xml
└── README.md
```

---

# ⚙️ Installation & Setup

Follow these steps to run BuildSphere locally.

### 1. Prerequisites

Make sure you have installed:

- Java Development Kit (JDK 26)
- IntelliJ IDEA
- MySQL Server
- Git
- Apache Maven

### 2. Clone Repository

Open your terminal and execute:

```bash
git clone https://github.com/rsharma09680-lab/Build-sphere.git
```

### 3. Open Project

Open the cloned `Build-sphere` folder in IntelliJ IDEA.

Wait for Maven to download and configure the dependencies.

### 4. Configure MySQL Database

Open MySQL Workbench or MySQL Command Line.

Create the database:

```sql
CREATE DATABASE buildsphere;
```

### 5. Configure Application Properties

Open:

```text
src/main/resources/application.properties
```

Configure your database connection:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/buildsphere
spring.datasource.username=root
spring.datasource.password=${DB_PASSWORD}

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

**Important:** Set your MySQL password through an environment variable. Never upload real database credentials to GitHub.

For Windows PowerShell:

```powershell
$env:DB_PASSWORD="YOUR_MYSQL_PASSWORD"
```

### 6. Run the Application

From the project root directory, execute:

```bash
mvn spring-boot:run
```

Alternatively, run:

```text
BuildSphereApplication.java
```

directly from IntelliJ IDEA.

### 7. Open in Browser

Once the application starts successfully, visit:

```text
http://localhost:8080
```

---

# 🖥️ Application Modules

| Module | Description |
|---|---|
| Dashboard | Construction activity overview |
| Projects | Construction project management |
| Workers | Workforce information |
| Attendance | Attendance records |
| Materials | Construction material management |
| Equipment | Equipment information |
| Daily Progress | Project progress records |
| Safety | Construction safety management |
| Reports | Reports interface |
| User Management | User accounts and roles |

---

# 📸 Screenshots

Screenshots of the BuildSphere application will be added here.

### Login Page

<!-- Add your login screenshot here -->

### Admin Dashboard

<!-- Add your admin dashboard screenshot here -->

### Owner Dashboard

<!-- Add your owner dashboard screenshot here -->

### Worker Dashboard

<!-- Add your worker dashboard screenshot here -->

### Project Management

<!-- Add your project management screenshot here -->

---

# 🚀 Future Enhancements

The following improvements are planned for future development:

- Advanced project analytics and reporting.
- Interactive charts and visual dashboards.
- Improved role-based authorization.
- Enhanced attendance management.
- Material inventory monitoring.
- Equipment maintenance tracking.
- Cloud deployment and hosting.
- Mobile-responsive improvements.
- Automated report generation.
- Notification and alert management.

---

# 🔒 Security & Configuration

- Keep database credentials outside the source code.
- Use environment variables for sensitive configuration.
- Do not commit passwords, API keys, or private tokens.
- Maintain proper access restrictions for different user roles.

---

# 👨‍💻 Developer

**Rohit Sharma**

Java Developer | Full-Stack Development Enthusiast

**Project:** BuildSphere – Construction Management System

**GitHub:** [rsharma09680-lab](https://github.com/rsharma09680-lab)

---

# 📄 License

No open-source license has currently been specified for this project. All rights are reserved by the project owner unless a license is added.

---

<div align="center">

## 🏗️ BUILDSPHERE

### BUILD • MANAGE • DELIVER

*Simplifying Construction Management Through Technology.*

**Thank you for visiting BuildSphere!**

⭐ If you find this project interesting, consider giving the repository a star.

</div>
