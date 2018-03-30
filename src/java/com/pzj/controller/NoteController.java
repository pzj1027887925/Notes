package com.pzj.controller;

import com.pzj.bean.Note;
import com.pzj.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/note")
public class NoteController {
    @Autowired
    private NoteService noteService;

    @RequestMapping("/findAll")
    public String findAll(ModelMap map){
        List<Note> list=noteService.findAll();
        map.put("list",list);
        return "noteList";
    }

    @RequestMapping("/addNote")
    public String addNote(Note note,ModelMap map){
        noteService.addNote(note);
        return "redirect:/note/findAll";
    }

    @RequestMapping("/deleteByid/{id}")
    public String deleteByid(@PathVariable("id") Integer id){
        noteService.deleteByid(id);
        return "redirect:/note/findAll";
    }

    @RequestMapping("/findById/{id}")
    public String findById(@PathVariable("id") Integer id, ModelMap map){
        Note note=noteService.findById(id);
        map.put("note",note);
        return "updateNote";
    }

    @RequestMapping("/updateNote")
    public String updateNote(Note note,ModelMap map){
        noteService.updateNote(note);
        return "redirect:/note/findAll";
    }


}
