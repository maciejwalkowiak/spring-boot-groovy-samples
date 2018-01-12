@EnableRabbit
@Component
class MyListener {

    @RabbitListener(bindings = @QueueBinding(value = @Queue,
                                             exchange = @Exchange(value = "\${exchange.name}", 
                                                                  type = "\${exchange.type}"), 
                                                                  key = "\${routing.key}"))
    def listen(message) {
        println "Received message ${new String(message.body)}"
    }
}
