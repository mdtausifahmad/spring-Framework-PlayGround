## Spring  Framework 
Framework to develop enterprise application

- [x] Spring Core
- [ ] Spring MVC
- [ ] Spring AOP
- [ ] Spring Test

### List of Topics 

#### IoC Container(dependency injection)

Dependency Injection, an aspect of Inversion of Control (IoC), is a general concept stating that you do not create your 
objects manually but instead describe how they should be created. An IoC container will instantiate required classes if needed.

To understand dependency injection we have give following answers
1. what are beans?
Ans. If we want that spring should take care of our dependency injection of bean then we must specify the java class 
      whose instance we want. we do by annotating them as @component 
      
2. What are the dependencies of a bean?
Ans. We have to specify the dependencies by annotating @Autowire

3. Where to search for beans?   
Ans. Spring Boot will automatically search the package and subpackage from root of the application.


###### When two or more candidate are available for DI. Then in following ways we can resolve.
1. Using @Primary at one of the candidate.
2. Using Autowiring by name.
3. Using @Qualifier 

###### Bean Scope
There are mainly 4 scope of bean
1. singleton - This is default. If a bean is singleton then there will be single copy through out app.
2. prototype - new bean whenever requested
             - Spring does not manage the complete lifecycle of a prototype bean.
             - Initialization lifecycle callback methods are called on all objects regardless 
               of scope, in the case of prototypes, configured destruction lifecycle callbacks 
               are not called.
3. request - one bean per HTTP request
4. session - one bean per HTTP session

Use proxy when we have one parent bean which is singleton and a dependent bean as prototype 

###### Bean Lifecycle management
Following are ways in which we can manage life cycle
1. The `InitializingBean` and `DisposableBean` callback interfaces
2. Custom `init()` and `destroy()` methods
3. The `@PostConstruct` and `@PreDestroy` annotations. 

Multiple lifecycle mechanisms configured for the same bean, 

Different initializing method are called as beloq

1. Methods annotated with `@PostConstruct`

2. `afterPropertiesSet()` as defined by the `InitializingBean` callback interface

3. A custom configured `init()` method

Destroy methods are called in the same order:

1. Methods annotated with `@PreDestroy`

2. `destroy()` as defined by the `DisposableBean` callback interface

3. A custom configured `destroy()` method


