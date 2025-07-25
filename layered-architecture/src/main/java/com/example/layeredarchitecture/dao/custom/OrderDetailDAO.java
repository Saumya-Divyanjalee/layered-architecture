package com.example.layeredarchitecture.dao.custom;

import com.example.layeredarchitecture.dao.CrudDAO;
import com.example.layeredarchitecture.dto.OrderDetailDTO;
import com.example.layeredarchitecture.entity.OrderDetail;

import java.sql.SQLException;

public interface OrderDetailDAO extends  CrudDAO<OrderDetail> {
    public boolean saveOrderDetail(OrderDetail orderDetailDTO) throws SQLException, ClassNotFoundException;

}
