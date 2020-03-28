# microserviceArchitect
microservice architect witdh springboot and spring cloud


service company: 
	dependecies: web,jpa,H2,RestRepository,lombok,config client,eureka client,actuator
	port:8081

config server:
	dependecies:config server
	port:8888

registration server:
	dependecies:Eureka server, clientConfig
	port:8761

proxy server:
	dependecies:netflix zuul,  eurekaClient
	port:8089