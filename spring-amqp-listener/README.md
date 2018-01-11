# Spring AMQP based RabbitMQ listener

Listens for *RabbitMQ* messages and prints them in the console.

In order to run it, you need to pass parameters:

- `exchange.name`
- `exchange.type` - topic, direct or fanout
- `routing.key` - routing key to bind the queue

Additionally you have to specify *Spring AMQP* properties required to connect to *RabbitMQ* instance (only if they are different from defaults):

- `spring.rabbitmq.host` - default `localhost`
- `spring.rabbitmq.port` - default `5672`
- `spring.rabbitmq.username` - default empty
- `spring.rabbitmq.password` - default empty

Example:

```
spring run rabbit.groovy -- --exchange.name=<exchange name> --exchange.type=<topic|direct|fanout> --routing.key=<routing key> --spring.rabbitmq.host=<host> --spring.rabbitmq.username=<username> --spring.rabbitmq.password=<password>
```
