package com.pzj.service;

import com.pzj.bean.Note;

import java.util.List;

public interface NoteService {
    List<Note> findAll();
    Note findById(Integer id);
    int addNote(Note note);
    int updateNote(Note note);
    int deleteByid(Integer id);
}
