package com.example.layeredarchitecture.dao.custom;

import com.example.layeredarchitecture.dao.CrudDAO;
import com.example.layeredarchitecture.dto.OrderDTO;
import com.example.layeredarchitecture.entity.Order;

import java.sql.*;

public interface OrderDAO extends CrudDAO<Order> {
    public String generateNewOrderId() throws SQLException, ClassNotFoundException ;
    public boolean existOrder(String orderId) throws SQLException, ClassNotFoundException ;
    public boolean saveOrder(OrderDTO orderDTO) throws SQLException, ClassNotFoundException;

}





