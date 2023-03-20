package com.example.LibraryManagementSys.repositories;

import com.example.LibraryManagementSys.models.Book;
import com.example.LibraryManagementSys.models.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {

    // select * from book where name = ?1
    List<Book> findByName(String name);

    // select * from book, author where author.name = ?1 and author.id = book.author_id
    List<Book> findByAuthor_Name(String authorName);

    List<Book> findByGenre(Genre genre);

//    @Query("select b from Book b where b.:filterType = ?2")
//    List<Book> findEqualsGeneric(String filterType, String value);
}
