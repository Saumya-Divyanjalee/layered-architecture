package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.dao.custom.impl.*;

import java.sql.SQLException;

import static com.example.layeredarchitecture.dao.DAOFactory.DAOTypes.QUERY;
import static com.sun.java.accessibility.util.EventID.ITEM;

public class DAOFactory {
    private static DAOFactory daoFactory;
    private DAOFactory() throws ClassNotFoundException, SQLException {

    }
    public static DAOFactory getInstance() throws ClassNotFoundException, SQLException {
        return (daoFactory == null) ? daoFactory = new DAOFactory() : daoFactory;

//        if (daoFactory == null) {
//            return  (daoFactory = new DAOFactory());
//        }else {
//            return daoFactory;
        }

        public enum DAOTypes{
        CUSTOMER,
        ORDER, ITEM,
        ORDER_DETAIL, QUERY

        }

    public SuperDAO getDAO(DAOTypes daoType) {
        switch(daoType){
            case CUSTOMER:
                return new CustomerDAOimpl();
            case ITEM:
                return new ItemDAOimpl();
            case ORDER:
                return new OrderDAOimpl();
            case ORDER_DETAIL:
                return new OrderDetailDAOimpl();
            case QUERY:
                return new QueryDAOimpl();
            default:
                return null;
        }




}
