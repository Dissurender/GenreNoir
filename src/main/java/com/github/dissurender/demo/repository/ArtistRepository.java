package com.github.dissurender.demo.repository;

import com.github.dissurender.demo.entity.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository extends JpaRepository<Artist, Long> {
}
