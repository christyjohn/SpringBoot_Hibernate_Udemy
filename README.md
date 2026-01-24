# Spring Boot 4, Spring 7 & Hibernate for Beginners
Code from Chad Darby's course on Spring, Spring Boot and Hibernate from Udemy at https://www.udemy.com/course/spring-hibernate-tutorial

Note: All the code is provided by Chad Darby himself. This is no way to plagiarize or discredit
his work, it is only added for as a quick future reference for me at work or as needed.
But in no way I am simply pushing the downloaded code, all of the code has been typed by me and
tested on my local computer (Just for proof I am changing the package names (The only reason for it)).

And when possible I have come up with my on scenarios to replicate what Chad has been trying to do.
For example in the initial stages, when he is using Coach interface and CricketCoach, TennisCoach etc.
for implementation, I have substituted with Tutor interface and JavaTutor, SpringTutor etc. (Yeah! Yeah! Yeah!,
I know there is not much ingenuity in there. Let me see if I can get more creative as I progress.)

I may in future add some of my own code or unit testing to the same in future. 
I will update the changes here as and when it happens.


## NOTES
#### Qualifiers
If Class contains consecutive capital letters, we need to add @Qualifier at both class level and at the Controller level.

#### Bean Scopes - Prototype Beans and Destroy Lifecycle
There is a subtle point you need to be aware of with "prototype" scoped beans.
For "prototype" scoped beans, Spring does not call the destroy method.

In contrast to the other scopes, Spring does not manage the complete lifecycle of a prototype bean: the container instantiates, configures, and otherwise assembles a prototype object, and hands it to the client, with no further record of that prototype instance.

Thus, although initialization lifecycle callback methods are called on all objects regardless of scope, in the case of prototypes, configured destruction lifecycle callbacks are not called. The client code must clean up prototype-scoped objects and release expensive resources that the prototype bean(s) are holding.