# CINEMA APP
[![N|Solid](https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRiP1Vlyn93LS0rU2JxJm3c7c0UFPJUUxTpS7DDkBSijHu8K_fdLuQw5QaT_P7OvvyYYxI&usqp=CAU)

## About app
This is application for on-line cinema ticket booking.

As admin, you can add movies/cinema-halls/movie-sessions, also you can edit 
or delete movie-session

Register as user, and you can search for cinema-halls/movies/
available sessions/order Tickets.

## Project Structure
 ```http
 cinema

--config

--controller

--dao

--dto

--exception

--lib

--model

--service

--util

resources
```


## Technologies
* Java 17
* Hibernate
* MySQL
* Spring Security
* Spring MVC
* Apache Tomcat

## SetUp
* Clone this repository
 ```http
  git clone <repository-url>
```
 
* Configure the Database: 
```http
Create schema in MySQL workbench, 
and fill the db.properties file in resources folder
```
* Build the Project using Maven
* Use TomCat server or any other servlet container

## License

MIT

**Free Software, Hell Yeah!**