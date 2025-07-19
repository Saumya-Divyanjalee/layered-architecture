package com.example.layeredarchitecture.dao;


import com.example.layeredarchitecture.dao.custom.impl.QueryDAOimpl;
import com.example.layeredarchitecture.dao.custom.impl.*;


public class DAOFactory {
    private static DAOFactory daoFactory;
    private DAOFactory() {}
    public static DAOFactory getInstance() {
        return (daoFactory==null)?new DAOFactory():daoFactory;
    }
    public enum DAOTypes {
        CUSTOMER,
        ITEM,
        ORDER,
        ORDER_DETAIL,
        QUERY
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
}