package com.example.dohonghanh.repository;

import com.example.dohonghanh.entity.BookDetailsEntity;
import com.example.dohonghanh.entity.PublisherCatalogsEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepo extends JpaRepository<PublisherCatalogsEntity,Integer> {
    Page<PublisherCatalogsEntity> findAllByNameContaining(String firstname, Pageable pageable);
}
