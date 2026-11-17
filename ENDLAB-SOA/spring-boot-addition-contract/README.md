# Spring Boot Addition API + YAML contract

## Requirements
- JDK 17 or newer
- IntelliJ IDEA, Eclipse, or Spring Tool Suite
- Internet connection on the first Maven build so dependencies can be downloaded

## Import into an IDE
1. Extract `spring-boot-addition-contract.zip`.
2. Open IntelliJ IDEA and choose **File > Open**.
3. Select the extracted `spring-boot-addition-contract` folder (the folder containing `pom.xml`).
4. If prompted, choose **Load/Trust Maven project** and wait for dependencies to finish downloading.
5. Open `src/main/java/com/example/demo/DemoApplication.java`.
6. Click the green Run icon beside `main`, or right-click the file and choose **Run 'DemoApplication'**.

For Eclipse / Spring Tool Suite: choose **File > Import > Maven > Existing Maven Projects**, select the extracted folder, then Finish. Run `DemoApplication.java` as **Java Application** or **Spring Boot App**.

## Test the endpoint
Open a browser or Postman and send:

GET http://localhost:8080/ms1/add?a=5&b=10

Expected HTTP status: `200 OK`

Expected response body:
`MS Addition = 15`

## Run tests
In the IDE, right-click `AdditionControllerTest.java` and choose Run.
Or, from a terminal opened in the project folder, run:
- Windows: `mvnw.cmd test` (if Maven Wrapper is present) or `mvn test`
- macOS/Linux: `mvn test`

This project does not include Maven Wrapper; install Maven or use the IDE's bundled Maven integration.

## Important note about the YAML file
`src/main/resources/contracts/addition-contract.yml` is the YAML contract description requested for this practical. The application runs the controller independently. The YAML file is not automatically verified by Spring Cloud Contract in this project; automated Spring Cloud Contract verification requires its plugin and contract-test setup.
