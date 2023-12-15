
# Use an official Maven image as the base image
FROM maven:3-eclipse-temurin-11

# Set the working directory in the container
WORKDIR /app

# Copy the pom.xml file to the container
COPY pom.xml .

# Download the project dependencies
RUN mvn dependency:resolve

# Copy the project source code to the container
COPY src ./src

# Build the Maven project
RUN mvn package

# Specify the command to run when the container starts
#CMD ["java", "-jar", "target/my-app-1.0-SNAPSHOT.jar" , ";" , "sleep" , "1000"]

CMD  ["java", "-jar", "target/my-app-1.0-SNAPSHOT.jar" , ";" , "sleep" , "1000"] 

#ENTRYPOINT [ "mvn" ,"test" , "surefire-reports/*.xml " ]

#COPY supervisord.conf /etc/supervisor/conf.d/supervisord.conf

# Specify the command to run when the container starts
#CMD ["/usr/bin/supervisord"]

