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
        listaLibros.add(new LibroModel(3, "978-1617294945", "Spring in Action", "Manning", 2020, "Craig Walls"));
        listaLibros.add(new LibroModel(4, "978-1491950357", "Designing Data-Intensive Applications", "O'Reilly Media", 2017, "Martin Kleppmann"));
        listaLibros.add(new LibroModel(5, "978-0132350884", "Clean Code", "Prentice Hall", 2008, "Robert C. Martin"));

    }

}
