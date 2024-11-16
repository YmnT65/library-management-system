package com.library.library_management_system.models.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.library.library_management_system.models.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
