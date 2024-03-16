# Getting Started

## Running the Application
### Prerequisites
- Java 17
- Maven

### To run the application
#### Command Line
- Run the command 'mvn spring-boot:run'
#### IDE
- Import the project to the your IDE of choice as a maven project and run the 'com.ota.coding.challenge.Application.java' file

## Endpoints

### Create Note
#### Request

`POST /note`

    curl --location --request POST 'localhost:8080/note' \ --header 'Content-Type: application/json' \ --data-raw '{"title" : "Test", "body" : "Body"}'

#### Response

    {"id":"e2fa10ee-f947-4bcd-8e63-d32807410558","title":"Test","body":"Body"}


### Get All Notes
#### Request

`GET /note`

    curl --location --request GET 'localhost:8080/note'

#### Response

    {"notes":[{"id":"861414fd-d262-4fe0-9018-8eace98c43b1","title":"Another record","body":"testing record 2"},{"id":"e2fa10ee-f947-4bcd-8e63-d32807410558","title":"Test","body":"Update"}]}

### Get Note by ID
#### Request

`GET /note/{id}`

    curl --location --request GET 'localhost:8080/note/e2fa10ee-f947-4bcd-8e63-d32807410558'

#### Response

    {"id":"e2fa10ee-f947-4bcd-8e63-d32807410558","title":"Test","body":"Body"}


### Update Note
#### Request

`PUT /note/{id}`

    curl --location --request PUT 'localhost:8080/note/e2fa10ee-f947-4bcd-8e63-d32807410558' \ --header 'Content-Type: application/json' \ --data-raw '{"title" : "Test", "body" : "Update"}'

#### Response

    {"id":"e2fa10ee-f947-4bcd-8e63-d32807410558","title":"Test","body":"Update"}


### Delete Note
#### Request

`DELETE /note/{id}`

    curl --location --request DELETE 'localhost:8080/note/e2fa10ee-f947-4bcd-8e63-d32807410558'

#### Response

    {"message":"Successfully deleted record"}
