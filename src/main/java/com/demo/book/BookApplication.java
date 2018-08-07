package com.demo.book;

import com.demo.book.repo.impl.AbstractRepoImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 *
 * @author Michael
 */
@SpringBootApplication
@EnableJpaRepositories(repositoryBaseClass = AbstractRepoImpl.class)
public class BookApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookApplication.class, args);
    }
}
