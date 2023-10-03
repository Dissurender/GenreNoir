package com.github.dissurender.demo.repository;

import com.github.dissurender.demo.entity.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaylistRepository extends JpaRepository<Playlist, Long> {
}
