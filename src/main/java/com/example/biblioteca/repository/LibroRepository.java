package com.example.biblioteca.repository;

//se importan librerias
import com.example.biblioteca.model.LibroModel;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository //como notacion, aprovecha la base del lenguaje java
public class LibroRepository {
    
    private List<LibroModel> listaLibros = new ArrayList<>();

    @PostConstruct
    public void init() {
        listaLibros.add(new LibroModel(2, "9999-999","Spring in action", "Alfaguara", 1997, "Manning"));

    }

}
