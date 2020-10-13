package com.adminportal.repository;

import com.adminportal.domain.Book;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book,Long> {

    @Query("select b from Book b where b.id=:id")
    Book findOne(Long id);
}
