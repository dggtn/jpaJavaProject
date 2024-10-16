package com.aluracursos.screenmatch.model;

public enum Categoria {
    ACCION("Action"),
    ROMANCE("Romance"),
    COMEDIA("Comedy"),
    DRAMA("Drama"),
    CRIMEN ("Crime");


    private String categoriaOMDB;
    Categoria(String categoriaOMDB){
        this.categoriaOMDB = categoriaOMDB;
    }
}


