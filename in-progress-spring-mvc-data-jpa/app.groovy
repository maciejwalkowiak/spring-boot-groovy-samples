package foo;

@Grab("spring-boot-starter-data-jpa")
@Grab("org.postgresql:postgresql:42.1.4")

import javax.persistence.*
import org.springframework.data.jpa.repository.*
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@Entity
class Person {
    @Id
    Long id
    String firstName
    String lastName
}

@EnableJpaRepositories(basePackages = "foo")
@Configuration
class Application {
}

interface PersonRepository extends JpaRepository<Person, Long> {}

@RestController
@RequestMapping("/person")
class PersonController {
    @Autowired PersonRepository repository
    @GetMapping
    def all() {
        repository.findAll()
    }
}
