package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.model.OrderDTO;

import java.sql.*;
import java.time.LocalDate;

public interface OrderDAO extends CrudDAO<OrderDTO>{
     /*String generateOrderId() throws SQLException, ClassNotFoundException;
     boolean checkOrderExist(String orderId) throws SQLException, ClassNotFoundException;*/
     boolean saveOrder(String orderId, LocalDate orderDate, String customerId) throws SQLException, ClassNotFoundException;
}
