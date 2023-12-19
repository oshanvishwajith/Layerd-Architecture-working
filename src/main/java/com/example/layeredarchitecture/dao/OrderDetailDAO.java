package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.OrderDetailDTO;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

public interface OrderDetailDAO extends CrudDAO<OrderDetailDTO>{
    public boolean saveOrder(String orderId, String itemCode, BigDecimal unitPrice, int qty) throws SQLException, ClassNotFoundException ;

}
