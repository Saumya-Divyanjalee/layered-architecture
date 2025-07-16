package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.CustomerDTO;
import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.*;
import java.util.ArrayList;

public interface CrudDAO<T> extends SuperDAO {

    public  ArrayList<T> getAll() throws SQLException,ClassNotFoundException ;

    public boolean save(T customerDTO)throws SQLException, ClassNotFoundException ;

    public boolean update(T customerDTO)throws SQLException, ClassNotFoundException ;

    public boolean exist(String id)throws SQLException, ClassNotFoundException ;

    public boolean delete(String id)throws SQLException, ClassNotFoundException ;

    public String generateNewId()throws SQLException, ClassNotFoundException ;

    public T search(String newValue)throws SQLException, ClassNotFoundException ;

}
