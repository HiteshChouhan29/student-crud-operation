# Database configuration
Using MySql as database and running on port : 3306

1. Create database "test"  

2. Update the database username and password in the application.properties file inside resources folder with your database username and Password.

    Ex -

    spring.datasource.username=yourUserName 
    spring.datasource.password=yourPassword

3. Application will automatically create the tables 

# Build

# Run
1. Open project directory in CMD.
2. Enter the command - mvn clean install
 

# Api's

1. To get all Students -
 http://localhost:8085/getAll

2. To get Student by id
http://localhost:8085/get/{id}

3. To create/update  the Student imformation add new Student
http://localhost:8085/save
 
 Student json Obj - {
    "firstName": "shiv",
    "lastName": "bhati",
    "fatherName": "anuj",
    "rollNo": 675,
    "clss": "cs"
}
 for updating the existing Student we need to send the existing Student id in the json Object.
     ex - {
    "id": 53,
    "firstName": "updated",
    "lastName": "bhati",
    "fatherName": "anuj",
    "rollNo": 675,
    "clss": "cs"
}


4. To delete the Student by id
http://localhost:8085/delete/{id}

