# SprinngAOP

This repository demonstrates the use of Aspect-Oriented Programming (AOP) in the Spring Framework. AOP allows for the separation of cross-cutting concerns, such as logging, security, and transaction management, from the core business logic, leading to more modular and maintainable code.

## Overview

The project showcases how to implement AOP in a Spring application using AspectJ annotations. It includes examples of different types of advice:

- **Before Advice**: Executed before a join point, typically a method execution.
- **After Returning Advice**: Executed after a join point completes normally.
- **After Throwing Advice**: Executed if a method exits by throwing an exception.
- **Around Advice**: Surrounds a join point, allowing custom behavior before and after the method invocation.

## Project Structure

```
src/
│── main/
│   ├── java/com/example/aspect/   # Defines aspects using AspectJ annotations
│   ├── java/com/example/service/  # Contains service classes that represent business logic
│   ├── java/com/example/model/    # Defines data models used in the application
│   ├── resources/                 # Contains configuration files
│── test/java/                      # Includes test cases for the application
```

## Getting Started

To run this project locally:

### 1. Clone the repository

```bash
git clone https://github.com/stakerAchyut/SprinngAOP.git
```

### 2. Navigate to the project directory

```bash
cd SprinngAOP
```

### 3. Build the project using Maven

```bash
mvn clean install
```

### 4. Run the application

```bash
mvn spring-boot:run
```

## Dependencies

The project relies on the following dependencies:

- **Spring Boot Starter AOP**: Provides support for aspect-oriented programming in Spring applications.
- **Spring Boot Starter**: Core starter, including auto-configuration support, logging, and YAML.
- **Spring Boot Starter Test**: Starter for testing Spring Boot applications with libraries including JUnit, Hamcrest, and Mockito.

These dependencies are defined in the `pom.xml` file.

## Resources

For more information on Spring AOP, consider the following resources:

- [Spring AOP Tutorial - TutorialsPoint](https://www.tutorialspoint.com/springaop/index.htm)
- [Spring AOP Example Tutorial - DigitalOcean](https://www.digitalocean.com/community/tutorials/spring-aop-example-tutorial-aspect-advice-pointcut-joinpoint-annotations)
- [Introduction to Spring AOP - Baeldung](https://www.baeldung.com/spring-aop)

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
