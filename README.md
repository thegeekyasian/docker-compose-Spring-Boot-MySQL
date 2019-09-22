# docker-compose-spring-boot-mysql

Hey! So this repository allows you to start a Spring Boot application and a MySQL database server by using only a single command in your system.
Both, the application and the database, will be started and hosted on docker constainers. 

All the configuration is done in the **docker-compose.yaml** file.

## How to?
In order to start the process, all you need to do is:
- Open your command-line terminal and browse to the root directory of this repository where **deploy.sh** file is located. (I am assuming you have cloned the repository already!)
- Execute the **deploy.sh** inside your terminal.
- Sit back and grab a cup of coffee!

## The Application
Now that your database has been setup and the application has been startd, by the docker-compose (deploy.sh did the job), how do you access it?

So the application is hosted on a docker container which is accessible at the **http://localhost/** on port **8087**. 

I have created an endpoint that allows you to test the endpoint by sending a message using a HTTP **POST** call on this endpoint: **http://localhost:8087/?message=Hello-World**

You can use this cURL request to test the endpoint:

```
curl -X POST 'http://localhost:8087/?message=Hello-World'
```

## The Database
The message, **Hello-World** is now peristed in your database! Wanna check, eh?
In order to access the database, you can connect to it using the following details:
- Hostname: localhost
- Port: 3301
- Username: root
- Password: root

A database, **thegeekyasian** has been created, and you can find the your message in the **messages** table using this SQL query:
```
SELECT * FROM `messages`;
```

I hope this worked well for you and you will be able to replace the code with your project and will be able to use this repository in order to setup docker for you projects!

For any questions and feedback, feel free to ping me on my blog at **http://thegeekyasian.com/contact/**
