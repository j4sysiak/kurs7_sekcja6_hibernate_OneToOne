package pl.jaceksysiak.hibernate.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import pl.jaceksysiak.hibernate.demo.entity.Course;
import pl.jaceksysiak.hibernate.demo.entity.Student;
import pl.jaceksysiak.hibernate.demo.repository.CourseRepository;
import pl.jaceksysiak.hibernate.demo.repository.StudentRepository;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	
	@Autowired
	CourseRepository courseRepository;
	
	@Autowired
	StudentRepository studentRepository;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*
		Course course = courseRepository.findById(10001L);
		
		logger.info("Course 10001L -> {}", course);
		
		courseRepository.save(new Course("Microservices in 100 Steps"));
		
	   // komentuje, żeby nie usuwało mi tego rekordu	courseRepository.deleteById(10001L);
       */
		
	   //	courseRepository.playWithEntityManager();
		
		studentRepository.saveStudentWithPassport();
		
	}
}