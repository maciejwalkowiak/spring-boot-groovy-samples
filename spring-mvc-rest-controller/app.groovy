@RestController
class HelloController {
    @GetMapping("/hello")
    def hello() {
        return new Person(firstName: "John", lastName: "Doe")
    }
}

class Person {
    String firstName
    String lastName
}