# Spring Boot - Model Libary 
<small></small>


<b>Author:</b> <a href="https://github.com/darksos34" target="_blank">Jordy Hamwijk</a><br>
<b>Created:</b> 2024-04-04<br>
<b>Last updated:</b> 2025-12-26</br>
### Model Library Version 0.0.7

[![](https://img.shields.io/badge/Spring%20Boot-8A2BE2)]() [![](https://img.shields.io/badge/release-Dec%2018,%202025-blue)]() [![](https://img.shields.io/badge/version-4.0.1-blue)]()

## 1.  What is the advantage of using a model library of DTOs?
A model library reduces file duplication by centralizing reusable components, resulting in fewer files in the project.

### 1.2 What is a DTO?
A Data Transfer Object (DTO) is an object used to encapsulate data and send it from one subsystem of an application to another. Here’s why we use DTOs:

1. Reducing Data Overhead:
* In N-Tier applications, DTOs are commonly used by the Services layer to transfer data between itself and the UI layer.
* By using DTOs, we reduce the amount of data sent across the wire in distributed applications.
2. Modeling in MVC:
* DTOs also serve as great models in the Model-View-Controller (MVC) pattern.
* They help separate concerns and improve code organization.
3. Parameter Encapsulation:
* DTOs can encapsulate parameters for method calls.
* Useful when a method takes more than a few parameters.
4. Domain Object Conversion:
* DTOs are used with DTO assemblers to convert between Domain Objects and DTOs.
* Conversion between Domain Object and DTO can be costly, but it’s essential for distributed applications.

## 2. How can you implement a model library in your project?
This library can be implemented in your project by following the steps below

### 2.1 Create a Spring Boot Application
Go to [Spring](https://start.spring.io) and create a new Spring Boot project.
![01-start-spring-io](https://github.com/darksos34/modellibary/blob/master/src/main/resources/images/spring-initializr.png)


Add the following dependencies:


[![](https://img.shields.io/badge/Spring%20Web-88888)]()
This Spring Framework dependency will provide us with all the necessary functionality to create and manage our REST endpoints.

[![](https://img.shields.io/badge/Lombok-8A2BE2)]()
Because it is just that easy to use.
Want to know more about <b>Project Lombok</b>? [Click this link](https://projectlombok.org/features/)

[![](https://img.shields.io/badge/Spring%20Validation-88888)]()
This Spring Validation dependency will provide us with all the necessary functionality to validate our DTOs.

[![](https://img.shields.io/badge/Hateoas%20-123)]()
This Spring Hateoas dependency will provide us with all the necessary functionality to create hypermedia-driven REST endpoints.

[![](https://img.shields.io/badge/Swagger%20-111111)]()
This Spring Swagger dependency will provide us with all the necessary functionality to create API documentation.

### 2.3 Create a DTO

Let's create a DTO class that will represent the data that we want to expose to the client.

`ModelDTO.java`
```java

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ModelDTO {

    @Null
    private String url;

    @Null
    private String uuid;

    @Size(max = 40)
    private String name;

    @Size(max = 15)
    private String code;
}


```
`@Getter` is a Lombok annotation that generates a getter method for each field in the class.</br>
`@Setter` is a Lombok annotation that generates a setter method for each field in the class.</br>
`@Builder` is a Lombok annotation that produces complex builder APIs for the class it is applied to unit tests.</br>
`@NoArgsConstructor` is a Lombok annotation that generates a no-argument constructor.</br>
`@AllArgsConstructor` is a Lombok annotation that generates a constructor with one parameter for each field in the class.</br>

`@Null` is a Spring Validation annotation that validates that the annotated element must be null.</br>
`@Size` is a Spring Validation annotation that validates that the annotated element must be within the specified size.

## 3. Model Library Implementation

To implement the model library in your project, follow these steps:

Step 1 - Go to your ````Pom.xml```` of the main project and add the following dependency:

```
     <dependency>
            <groupId>dev.jda</groupId>
            <artifactId>demo-model-libary</artifactId>
            <version><your-version>-SNAPSHOT</version>
     </dependency>
       
```

Step 2 - Remove `SNAPSHOT` from the version when you are done developing " remove snapshot from the version", 

```
     <dependency>
            <groupId>dev.jda</groupId>
            <artifactId>demo-model-libary</artifactId>
            <version><your-version></version>
     </dependency>
       
```
Step 3 - Before using the library, you must reload and install your Maven dependencies. 
![img.png](https://github.com/darksos34/modellibary/blob/master/src/main/resources/images/maven-reload.png)
```
mvn clean install
```
## Let's Stay Connected

Feedback is always welcome. If you have any questions, comments, or suggestions, please do not hesitate to reach out.

- <b>Star</b> the repository to show your support.       

- Follow me for more interesting repositories!
