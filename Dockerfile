######################################################
# Build Step
######################################################

# Maven container image. Version 3.5
FROM maven:3.9.7-amazoncorretto-17 as build

# Setting current workdir inside container
WORKDIR /gatewaysApp

# Copy required build files to container workdir
COPY . .

# Package the application into an executable .jar
RUN mvn clean package -DskipTests

RUN ls ./target

######################################################
# Run Step
######################################################

# Openjdk container image. Version 17
FROM openjdk:17 as environment

# Setting current workdir inside container
WORKDIR /gatewaysApp

# Setting local application port
ARG PORT=8000

# Exposing app port to host system
EXPOSE ${PORT}

# Copy the executable .jar file to the run container
COPY --from=build /gatewaysApp/target/gatewaysOfHellUser-0.0.1-SNAPSHOT.jar /gatewaysApp/gatewaysOfHellUser-0.0.1-SNAPSHOT.jar

# Execute app
ENTRYPOINT ["java", "-jar", "gatewaysOfHellUser-0.0.1-SNAPSHOT.jar"]