# POC RabbitMQ : spring boot application consuming RabbitMQ messages
Rabbit MQ inspired from :  
basics :  
https://www.youtube.com/watch?v=5kxLeR_YuIk
https://github.com/dailycodebuffer/Spring-MVC-Tutorials/tree/master/spring-rabbitmq-producer
https://github.com/dailycodebuffer/Spring-MVC-Tutorials/tree/master/spring-rabbitmq-consumer

advanced :  
https://medium.com/trendyol-tech/rabbitmq-exchange-types-d7e1f51ec825

Note : the application to produce messages and run a RabbitMQ server is reachable at :  
https://github.com/skeres/rabbitMQ-producer  

## Versions used for this POC
**spring boot :**  
version : 2.7.8
This version support java 11. If you want to use spring boot version 3.0.0 or higher, you must use java 17

**RabbitMQ :**  
image : rabbitmq:3.9.28-management  

## Requirements
java 11 JDK


## Spring on https://start.spring.io/
*spring web*  
*spring for RabbitMQ*  
*lombock*


## consuming message
We have implemented 2 listeners : one for Strings, and one for object messages.
When the producer sends messages, you will see messages in the console :  

For a simple string message like "http://localhost:9001/publish/msg01"  
**result**
```
TheType=com.sks.demo.StringMessage01
StringMessage01 recieved : StringMessage01(message=msg01)
```
for object message like "http://localhost:9001/publish"  
**result**
```
heType=com.sks.demo.ObjectMessage01
ObjectMessage01 recieved : ObjectMessage01(messageId=add73a8d-2cc9-49fa-956d-cb345da9e6dc, message=hello, messageDate=Wed Feb 22 22:35:04 CET 2023)
```
