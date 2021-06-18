package com.company.consulta;

import com.company.dto.ActorDto;

import java.sql.*;
import java.util.ArrayList;

public class DatosConsulta {
    ActorDto actorDto = new ActorDto();
    Connection connection = null;
    ArrayList<String> List = new ArrayList<String>();
public ArrayList  ConsultarDatos(){

    try {
        Statement statement = connection.createStatement();
        statement.setQueryTimeout(40);
        ResultSet rs = statement.executeQuery("select * from actor");
        while (rs.next()){
            System.out.println("name: " + rs.getString("first_name"));
        }

    }catch (SQLException e){
        System.out.println(e.getMessage());
    }
    return List;
}

}
