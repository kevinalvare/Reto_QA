package com.company.dto;

import java.sql.Date;
import java.util.ArrayList;

public class CategoriaDto {
    ArrayList<Integer> id_Categoria= new ArrayList<Integer>();
    ArrayList<String>nombre = new ArrayList<>();
    ArrayList<Date>fecha_Categoria= new ArrayList<Date>();

    public CategoriaDto() {
    }

    public ArrayList<Integer> getId_Categoria() {
        return id_Categoria;
    }

    public void setId_Categoria(ArrayList<Integer> id_Categoria) {
        this.id_Categoria = id_Categoria;
    }

    public ArrayList<String> getNombre() {
        return nombre;
    }

    public void setNombre(ArrayList<String> nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Date> getFecha_Categoria() {
        return fecha_Categoria;
    }

    public void setFecha_Categoria(ArrayList<Date> fecha_Categoria) {
        this.fecha_Categoria = fecha_Categoria;
    }
}
