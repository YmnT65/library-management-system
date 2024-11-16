package com.library.library_management_system.service;

import java.util.List;
import java.util.Optional;

import com.library.library_management_system.models.dto.BookRequest;
import com.library.library_management_system.models.entity.Book;

public interface BookService {

	public String updateBook(Long id, BookRequest bookDetails);
	
	public List<Book> getAllBooks();
	
	public Optional<Book> getBookById(Long id);
	
	public Book saveBook(BookRequest book);
	
	public String deleteBook(Long id);
	
}
