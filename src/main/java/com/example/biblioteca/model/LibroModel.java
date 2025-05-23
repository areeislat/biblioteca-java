package com.example.biblioteca.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;


@AllArgsConstructor
@NoArgsConstructor
@Data

public class LibroModel {
        
    private int id;
    private String isbn;
    private String titulo;
    private int editoriales;
    private int fechaPublicacion;
    private String auto;

}
