package com.example.LibraryManagementSys.repositories;

import com.example.LibraryManagementSys.models.Book;
import com.example.LibraryManagementSys.models.Student;
import com.example.LibraryManagementSys.models.Transaction;
import com.example.LibraryManagementSys.models.TransactionType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {

    Transaction findTopByBookAndStudentAndTransactionTypeOrderByIdDesc(
            Book book,Student student, TransactionType transactionType
    );

}
