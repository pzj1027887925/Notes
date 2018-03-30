package com.pzj.dao;

import com.pzj.bean.Note;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("noteMapper")
public interface NoteMapper {

    @Select("select * from note")
    @Results(value = {
            @Result(property = "id", column = "id"),
            @Result(property = "title", column = "title"),
            @Result(property = "content", column = "content"),
            @Result(property = "time", column = "time")
    }
    )
    List<Note> findAll();

    @Select("select * from note where id=#{id}")
    Note findById(Integer id);

    @Insert("insert into note(title,content,time) " +
            "values(#{title},#{content},#{time})")
    int addNote(Note note);

    @Update("update note set title=#{title},content=#{content},time=#{time} where id=#{id}")
    int updateNote(Note note);

    @Delete("delete from note where id=#{id}")
    int deleteByid(Integer id);
}
