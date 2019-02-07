# Balanced MQTT Client using RabbitMQ and Spring Cloud Stream
This demo show how to scale a MQTT client horizontally, i.e. distribute the MQTT load between multiple consumers.You can check the tutorial on DZone using this link :https://dzone.com/articles/mqtt-client-load-balancing-with-rabbitmq-and-sprin

# To run this demo
1- Adjust RabbitMQ configuration in the file application.yml 
2- Compile the project and run multiple instances of it 
3- Push some data using a MQTT client 
4- The messages will be distributed among the instances \n
