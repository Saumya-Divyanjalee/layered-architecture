package com.example.layeredarchitecture.bo.custom.impl;

import com.example.layeredarchitecture.bo.custom.CustomerBO;
import com.example.layeredarchitecture.dao.DAOFactory;
import com.example.layeredarchitecture.dao.custom.CustomerDAO;
import com.example.layeredarchitecture.dao.custom.impl.CustomerDAOimpl;
import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerBOImpl implements CustomerBO {
    CustomerDAO customerDAO =
            (CustomerDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.CUSTOMER);

    public ArrayList<CustomerDTO> getAllCustomer() throws SQLException, ClassNotFoundException {
        return customerDAO.getAll();


    }
    public boolean saveCustomer(CustomerDTO customerDTO) throws SQLException,ClassNotFoundException{
        return customerDAO.save(customerDTO);
    }

    public boolean deleteCustomer(String id) throws SQLException,ClassNotFoundException{
        return customerDAO.delete(id);
    }

    public boolean updateCustomer(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException{
        return customerDAO.update(customerDTO);
    }

    public boolean existCustomer(String id) throws SQLException, ClassNotFoundException{
        return customerDAO.exist(id);
    }

    public String generateCustomerNewId() throws SQLException, ClassNotFoundException{
        return customerDAO.generateNewId();
    }
}
