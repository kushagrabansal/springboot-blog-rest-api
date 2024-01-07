# Blog app in Spring Boot

## Issues faced 

- Port 8080 was already in use so added `server.port = 8090` to `src/main/resources/application.properties`
- make sure exactly accurate properties are added in application.properties file mentioned above (faced issue with `spring.jpa.hibernate.ddl-auto=update`)
- Install Lombok plugin and restart IDE once so that IDE does not throw weird errors when you use Lombok related features (for e.g. IDE threw an error for a setter usage because it couldn't find it but Lombok annotations add it directly)

## Targets after this

- Review this project commit after commit to see what has been done
- Build a similar scale project taking 0 reference from this one and trying to kinda do it on my own end to end
- Learn the react + Spring boot thing from here : https://www.youtube.com/playlist?list=PLGRDMO4rOGcNLnW1L2vgsExTBg-VPoZHr and https://www.udemy.com/course/full-stack-react-and-java-spring-boot-the-developer-guide/ 
- (Maybe) Do this one to understand microservices : https://www.udemy.com/course/building-microservices-with-spring-boot-and-spring-cloud/?referralCode=6523E6A8A932A4359E6E 
- (Maybe) Complete this one to understand spring and springboot a bit more in depth, if not code along then at-least watch and revise PPTs - https://www.udemy.com/course/spring-hibernate-tutorial/
