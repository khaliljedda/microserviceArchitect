# microserviceArchitect
microservice architect witdh springboot and spring cloud


<h4>service company: </h4></br>
	dependecies: web,jpa,H2,RestRepository,lombok,config client,eureka client,actuator
	port:8081

<h4>config server:</h4></br>
	dependecies:config server
	port:8888

<h4>registration server:</h4></br>
	dependecies:Eureka server, clientConfig
	port:8761

<h4>proxy server:</h4></br>
	dependecies:netflix zuul,  eurekaClient
	port:8089

![Schema][shema.png]
