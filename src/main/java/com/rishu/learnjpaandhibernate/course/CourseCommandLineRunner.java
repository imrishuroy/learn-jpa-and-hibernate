package com.rishu.learnjpaandhibernate.course;

import com.rishu.learnjpaandhibernate.course.jdbc.CourseJdbcRepository;
import com.rishu.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.rishu.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CourseJdbcRepository repository;

//    @Autowired
//    private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {

        repository.save(new Course(1, "Learn GCP", "rishu"));
        repository.save(new Course(2, "Learn Flutter", "rishu"));
        repository.save(new Course(3, "Learn AWS", "rishu"));
        repository.save(new Course(4, "Learn Node", "rishu"));


        repository.deleteById(1l);

        System.out.println(repository.findById(2l));

        System.out.println(repository.findAll());
        System.out.println(repository.count());

        System.out.println(repository.findByAuthor("rishu"));

        System.out.println(repository.findByName("Learn Flutter"));

//        repository.insert(new Course(1, "Learn GCP", "rishu"));
//        repository.insert(new Course(2, "Learn Flutter", "rishu"));
//        repository.insert(new Course(3, "Learn AWS", "rishu"));
//        repository.insert(new Course(4, "Learn Node", "rishu"));
//
//
//        repository.deleteById(1);
//
//        System.out.println(repository.findById(2));
    }
}
