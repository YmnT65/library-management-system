package com.library.library_management_system.models.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookRequest {

    @NotBlank(message = "Title is required.")
    @Size(max = 100, message = "Title cannot exceed 100 characters.")
    private String title;

    @NotBlank(message = "Author is required.")
    @Size(max = 50, message = "Author name cannot exceed 50 characters.")
    private String author;

    @NotNull(message = "Publication year is required.")
    private Integer publicationYear;
    
}