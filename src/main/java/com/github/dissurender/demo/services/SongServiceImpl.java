package com.github.dissurender.demo.services;

import com.github.dissurender.demo.entity.Song;
import com.github.dissurender.demo.repository.SongRepository;

import java.util.List;

public class SongServiceImpl implements SongService{

    private SongRepository songRepository;

    public SongServiceImpl(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    @Override
    public Song getSongById(Long id) {
        return songRepository.findById(id).orElse(null);
    }

    @Override
    public List<Song> getAllSongs() {
        return null;
    }

    @Override
    public boolean addSong(Song song) {
        return false;
    }

    @Override
    public boolean deleteSong(Long id) {
        return false;
    }

    @Override
    public Song updateSong(Song newSong, Long id) {
        return null;
    }
}
