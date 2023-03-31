package com.devmountain.noteApp.entities;

import javax.persistence.Table;

import com.devmountain.noteApp.dtos.NoteDto;
import com.fasterxml.jackson.annotation.JsonBackReference;
//import com.fasterxml.jackson.databind.annotation.JsonAppend.Prop;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "Notes")
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "text")
    private String body;

    @ManyToOne
    @JsonBackReference
    private User user;

    public Note(NoteDto noteDto){
        if (noteDto.getBody() != null){
            this.body = noteDto.getBody();
        }
    }

}

