Prerequisites:
Please ensure Java 1.8 or above is installed and Maven is installed and on the path.
Also ensure port 8080 is not in use.

Instructions:

1. Unzip cars directory.
2. Open command line on the unzipped cars directory and use mvn install to build project.
3. Use mvn spring-boot:run to run the project.
4. Go to localhost:8080/cars?colour={colour} to filter the cars based on their colour.
