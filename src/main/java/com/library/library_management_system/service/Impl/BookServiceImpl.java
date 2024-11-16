package com.library.library_management_system.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.library_management_system.models.dao.BookRepository;
import com.library.library_management_system.models.dto.BookRequest;
import com.library.library_management_system.models.entity.Book;
import com.library.library_management_system.service.BookService;
import com.library.library_management_system.utils.exceptions.CustomException;
import com.library.library_management_system.utils.exceptions.ResourceNotFoundException;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookRepository bookRepository;

    public List<Book> getAllBooks() {
    	try {    		
    		List<Book> books =  bookRepository.findAll();
    		if (books == null) {
    			throw new CustomException("Error while getting books");
    		}
    		return books;
    	}catch (CustomException ex ) {
    		throw ex;
    	}
    	catch (Exception e) {
			e.printStackTrace();
		}
    	return null;
    }

    public Optional<Book> getBookById(Long id) {
    	try {
    		Optional<Book> book = bookRepository.findById(id);
			if(!book.isPresent()) {
				throw new CustomException("Book not found");
			}
			return book;
		} catch(CustomException ex) {
			throw ex;
		}
    	catch (Exception e) {
			e.printStackTrace();
		}
		return null;
    }

    public Book saveBook(BookRequest bookRequest) {
    	try {
    		Book book = new Book();
    		book.setAuthor(bookRequest.getAuthor());
    		book.setPublicationYear(bookRequest.getPublicationYear());
    		book.setTitle(bookRequest.getTitle());
    		
    		return bookRepository.save(book);
		} catch (Exception e) {
			throw new CustomException("Error while creating new Book", e);
		}
    }

    public String updateBook(Long id, BookRequest bookDetails) {
        
    	try {
    		Book book = bookRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Book not found"));
            book.setTitle(bookDetails.getTitle());
            book.setAuthor(bookDetails.getAuthor());
            book.setPublicationYear(bookDetails.getPublicationYear());
            return "Books updated successfully";
		} catch (Exception e) {
			throw new CustomException("Error while updating the book details", e);
		}
    	
    }

    public String deleteBook(Long id) {
    	try {			
    		Book book = bookRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Book not found"));
    		bookRepository.delete(book);
    		return "Book deleted Successfully";
		} catch (Exception e) {
			throw new CustomException("Error while deleting book",e);
		}
    }

}
