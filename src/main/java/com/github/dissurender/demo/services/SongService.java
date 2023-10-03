package com.github.dissurender.demo.services;

import com.github.dissurender.demo.entity.Song;

import java.util.List;

public interface SongService {

    Song getSongById(Long id);

    List<Song> getAllSongs();

    boolean addSong(Song song);

    boolean deleteSong(Long id);

    Song updateSong(Song newSong, Long id);

}
