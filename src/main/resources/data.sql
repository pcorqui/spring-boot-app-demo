--insertando datos usando la secuancia creada en schema.sql
INSERT INTO COURSES(ID,NAME, CATEGORY, RATING, DESCRIPTION)
VALUES(NEXTVAL('my_sequence'),'Rapid Spring boot Application Development','Spring',4,'Spring boot gives all the power of the Spring Framework without all of the complexities');

INSERT INTO COURSES(ID,NAME, CATEGORY, RATING, DESCRIPTION)
VALUES(NEXTVAL('my_sequence'),'Getting Started with Spring Security DSL','Spring',3,'Spring Security DSL in easy steps');

INSERT INTO COURSES(ID, NAME, CATEGORY, RATING, DESCRIPTION)
VALUES(NEXTVAL('my_sequence'),'Scalable, Cloud Native Data Applications','Spring',4,'Manage Cloud based applications with Spring Boot');

INSERT INTO COURSES(ID,NAME, CATEGORY, RATING, DESCRIPTION)
VALUES(NEXTVAL('my_sequence'),'Fully Reactive: Spring, Kotlin, and JavaFX Playing Together','Spring',3,'Unleash the power of Reactive Spring with Kotlin and Spring Boot');

INSERT INTO COURSES(ID, NAME, CATEGORY, RATING, DESCRIPTION)
VALUES(NEXTVAL('my_sequence'),'Getting Started with Spring Cloud Kubernetes','Spring',5,'Master Spring Boot application deployment with Kubernetes');

INSERT INTO COURSES(ID, NAME, CATEGORY, RATING, DESCRIPTION)
VALUES(NEXTVAL('my_sequence'),'Getting Started with Spring Cloud Kubernetes','Spring',5,'Master Spring Boot application deployment with Kubernetes');

INSERT INTO COURSES(ID, NAME, CATEGORY, RATING, DESCRIPTION)
VALUES(NEXTVAL('my_sequence'),'Getting Started with Spring Cloud Kubernetes','Spring',5,'Master Spring Boot application deployment with Kubernetes');

INSERT INTO COURSES(ID, NAME, CATEGORY, RATING, DESCRIPTION)
VALUES(NEXTVAL('my_sequence'),'Getting Started with Spring Cloud Kubernetes','Spring',5,'Master Spring Boot application deployment with Kubernetes');

INSERT INTO COURSES(ID, NAME, CATEGORY, RATING, DESCRIPTION)
VALUES(NEXTVAL('my_sequence'),'Getting Started with Spring Cloud Kubernetes','Spring',5,'Master Spring Boot application deployment with Kubernetes');