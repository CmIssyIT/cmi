# CMI API Backend

The goal of this application is to provide a list of services for CMI portal.

## Build
```sh
./gradlew clean build
```

## Unit Test
```sh
./gradlew test
```

## Integration Test
```sh
./gradlew verify
```
## SonarQube
```sh
./gradlew sonar
```
## Start database
```sh
docker-compose up
```

## Run with Gradle
```sh
docker-compose up -d
./gradlew bootRun
```

## Run with Java
```
docker-compose up -d
java -jar ./build/libs/spring-boot-app-1.0.jar
```

## Convert MySQL to Postgres:
http://www.sqlines.com/online
## Endpoints

[/info](http://localhost:8080/info)

[/health](http://localhost:8080/health)

[/swagger-ui.html](http://localhost:8080/swagger-ui.html)
