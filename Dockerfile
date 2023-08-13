# pulls base image from docker hub
FROM amazoncorretto:11.0.19

# Set the working directory inside the container
WORKDIR /app

# Copy the compiled Java classes from the IntelliJ IDEA output directory which is the fuckin target into the container
#cant put the path to actual src code because i need to research it more
COPY ./src/main/java/ /app

#RUN is always done on the image
#COPY the first arg is done on the host and the second arg is on the container

# Specify the entry point to run the Java application
#CMD ["java", "org.example.HelloWorld"]
CMD ["java", "org.example.HelloWorld"]