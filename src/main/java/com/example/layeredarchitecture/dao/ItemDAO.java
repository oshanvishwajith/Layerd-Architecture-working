package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.*;
import java.util.ArrayList;

public interface ItemDAO extends CrudDAO<ItemDTO>{
    /* ArrayList<ItemDTO> loadAllItems() throws SQLException, ClassNotFoundException ;

     boolean saveItem(ItemDTO itemDTO) throws SQLException, ClassNotFoundException ;

     String generateId() throws SQLException, ClassNotFoundException ;

     boolean deleteItem(String code) throws SQLException, ClassNotFoundException ;

     boolean updateItem(ItemDTO itemDTO) throws SQLException, ClassNotFoundException ;
     boolean  existItem(String code) throws SQLException, ClassNotFoundException ;

      ItemDTO findItem(String newItemCode) throws SQLException, ClassNotFoundException;*/
}
