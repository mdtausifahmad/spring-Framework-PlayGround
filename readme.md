#Spring  Framework 
###List of Topics 
####1. IoC Container(dependency injection)

Dependency Injection, an aspect of Inversion of Control (IoC), is a general concept stating that you do not create your 
objects manually but instead describe how they should be created. An IoC container will instantiate required classes if needed.



######To understand dependency injection we have give following answers
1.what are beans?
Ans. If we want that spring should take care of our dependency injection of bean then we must specify the java class 
      whose instance we want. we do by annotating them as @component 
      
2.What are the dependencies of a bean?
Ans. We have to specify the dependencies by annotating @Autowire

3.Where to search for beans?   
Ans. Spring Boot will automatically search the package and subpackage from root of the application.


######When two or more candidate are available for DI. Then in following ways we can resolve.
1. Using @Primary at one of the candidate.
2. Using Autowiring by name.
3. Using @Qualifier 

###### Bean Scope
There are mainly 4 scope of bean
1. singleton - This is default. If a bean is singleton then there will be single copy through out app.
2. prototype - new bean whenever requested
             -Spring does not manage the complete lifecycle of a prototype bean.
             - Initialization lifecycle callback methods are called on all objects regardless 
               of scope, in the case of prototypes, configured destruction lifecycle callbacks 
               are not called.
3. request - one bean per HTTP request
4. session - one bean per HTTP session

Use proxy when we have one parent bean which is singleton and a dependent bean as prototype 

###### Bean Lifecycle
we have several annotations so that we can control stages of bean lifecycle
1. @PostConstruct
2. @PreDestroy





