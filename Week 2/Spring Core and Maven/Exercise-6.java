package com.library.service;

import org.springframework.stereotype.Service;

@Service
public class BookService {

}

package com.library.repository;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {

}

package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.service.BookService;

public class LibraryManagementApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

    }
}
