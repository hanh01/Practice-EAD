package com.example.dohonghanh.service;

import com.example.dohonghanh.entity.BookDetailsEntity;
import com.example.dohonghanh.repository.BookDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookDetailsServiceImpl implements BookDetailsService {
    @Autowired
    BookDetailsRepo bookDetailsRepo;

    @Override
    public List<BookDetailsEntity> getAll() {
        return bookDetailsRepo.findAll();
    }

    @Override
    public BookDetailsEntity createBook(BookDetailsEntity p) {
        return bookDetailsRepo.save(p);
    }

    @Override
    public Page<BookDetailsEntity> findAll(Pageable pageable) {
        return bookDetailsRepo.findAll(pageable);
    }

    @Override
    public Page<BookDetailsEntity> findAllByFirstNameContaining(String firstname, Pageable pageable) {
        return bookDetailsRepo.findAllByNameContaining(firstname, pageable);
    }
}
