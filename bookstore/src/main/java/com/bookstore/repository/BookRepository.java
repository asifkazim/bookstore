package com.bookstore.repository;

import com.bookstore.domain.Book;
import com.bookstore.domain.security.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {

    @Query("select b from Book b where b.id=:id")
    Book findOne(Long id);
}
