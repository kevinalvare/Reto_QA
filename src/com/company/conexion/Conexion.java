package com.company.conexion;

import com.company.dto.ActorDto;
import com.company.dto.CategoriaDto;

import java.sql.*;
import java.util.ArrayList;

public class Conexion {
    Connection connection = null;
    Statement statement = null;
    ResultSet rs;



    public void Conexion(){

        try {
            connection = DriverManager.getConnection("jdbc:mysql://sofka-training.cpxphmd1h1ok.us-east-1.rds.amazonaws.com/KevinAlvarez?user=sofka_training&password=BZenX643bQHw&serverTimezone=UTC");


        }catch (SQLException e){
          System.out.println(e.getMessage());
        }
    }


    public void consultarActor(ActorDto actorDto){
        ArrayList<String> lis = new ArrayList<>();
        ArrayList<String> las_name= new ArrayList<>();
        ArrayList<Integer> id_actor= new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            statement.setQueryTimeout(40);
            rs = statement.executeQuery("select * from actor");
            while (rs.next()){
               lis.add(rs.getString("first_name"));
               las_name.add(rs.getString("last_name"));
               id_actor.add(rs.getInt("actor_id"));
               actorDto.setNombre(lis);
               actorDto.setApellido(las_name);
               actorDto.setId_Actor(id_actor);
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }/*finally {
            try {
                if (connection != null){
                    connection.close();
                }
            }catch (SQLException e){
                System.out.println(e.getMessage());
            }
        }*/

    }


    public void consultarCategoria(CategoriaDto categoriaDto){
        ArrayList<String> c_name= new ArrayList<>();
        ArrayList<Integer> id_Category= new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            statement.setQueryTimeout(40);
            rs = statement.executeQuery("SELECT * FROM category ");
            while (rs.next()){
                c_name.add(rs.getString("name"));
                id_Category.add(rs.getInt("category_id"));
                categoriaDto.setNombre(c_name);
                categoriaDto.setId_Categoria(id_Category);

            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }



    }
    public void cerrar(){
        try {
            if (connection != null){
                connection.close();
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

}
