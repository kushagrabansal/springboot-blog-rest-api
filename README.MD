# Blog app in Spring Boot

## Issues faced 

- Port 8080 was already in use so added `server.port = 8090` to `src/main/resources/application.properties`

- make sure exactly accurate properties are added in application.properties file mentioned above (faced issue with `spring.jpa.hibernate.ddl-auto=update`) 

- Install Lombok plugin and restart IDE once so that IDE does not throw weird errors when you use Lombok related features (for e.g. IDE threw an error for a setter usage because it couldn't find it but Lombok annotations add it directly)