package com.company.principal;
import com.company.conexion.Conexion;
import com.company.consulta.DatosConsulta;
import com.company.dto.ActorDto;
import com.company.dto.CategoriaDto;
import com.company.dto.ClientDto;

import java.sql.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        DatosConsulta datosConsulta = new DatosConsulta();
        Conexion conexion = new Conexion();
        ActorDto actorDto = new ActorDto();
        CategoriaDto categoriaDto = new CategoriaDto();
        conexion.Conexion();
        conexion.consultarActor(actorDto);
        System.out.println(actorDto.getApellido());
        conexion.consultarCategoria(categoriaDto);
        System.out.println(categoriaDto.getNombre());
        conexion.cerrar();


    }

}
