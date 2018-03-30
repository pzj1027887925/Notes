package com.pzj.service;

import com.pzj.bean.Note;
import com.pzj.dao.NoteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("noteService")
@Transactional(propagation = Propagation.NOT_SUPPORTED,readOnly = true)
public class NoteServiceImpl implements NoteService{
    @Autowired
    private NoteMapper noteMapper;

    public List<Note> findAll() {
        return noteMapper.findAll();
    }

    public Note findById(Integer id) {
        return noteMapper.findById(id);
    }

    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,rollbackFor = Exception.class)
    public int addNote(Note note) {
        return noteMapper.addNote(note);
    }

    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,rollbackFor = Exception.class)
    public int updateNote(Note note) {
        return noteMapper.updateNote(note);
    }

    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,rollbackFor = Exception.class)
    public int deleteByid(Integer id) {
        return noteMapper.deleteByid(id);
    }
}
