package com.github.dissurender.demo.repository;

import com.github.dissurender.demo.entity.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Long> {
}
