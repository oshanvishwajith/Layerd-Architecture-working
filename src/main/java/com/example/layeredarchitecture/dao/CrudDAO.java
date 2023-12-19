package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CrudDAO<T> {
    ArrayList<T> getAll() throws SQLException, ClassNotFoundException ;

    boolean save(T DTO) throws SQLException, ClassNotFoundException;

    boolean update(T DTO) throws SQLException, ClassNotFoundException ;
    boolean delete(String id) throws SQLException, ClassNotFoundException ;

    String generateNewId() throws SQLException, ClassNotFoundException ;
    boolean exist( String id ) throws SQLException, ClassNotFoundException ;
     T search(String newValue) throws SQLException, ClassNotFoundException;
}
