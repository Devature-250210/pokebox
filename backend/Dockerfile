FROM maven:3.8.5-openjdk-17 AS build

WORKDIR /app

COPY pom.xml .
COPY ./src/ src/

RUN mvn install -DskipTests

FROM openjdk:17

COPY --from=build /app/target/pokebox-0.0.1-SNAPSHOT.jar /app/pokebox-0.0.1-SNAPSHOT.jar

# define the working directory
WORKDIR /app

# expose the port
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "pokebox-0.0.1-SNAPSHOT.jar"]