package com.github.dissurender.demo.repository;

import com.github.dissurender.demo.entity.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {
}
