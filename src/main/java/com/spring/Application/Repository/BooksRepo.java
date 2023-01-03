package com.spring.Application.Repository;

import com.spring.Application.Data.LibraryData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface BooksRepo extends JpaRepository<LibraryData, String> {
}
