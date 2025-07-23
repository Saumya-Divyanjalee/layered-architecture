package com.example.layeredarchitecture.bo.custom;

import com.example.layeredarchitecture.bo.custom.impl.CustomerBOImpl;
import com.example.layeredarchitecture.bo.custom.impl.ItemBOimpl;
import com.example.layeredarchitecture.bo.custom.impl.PlaceOrderBOimpl;

public class BOFactory {
    private static BOFactory boFactory;
    private BOFactory() {}//constructor private,return type na,0bject create krnn ba ,private use krla nisa,but method share krnn one nisa,static use krnwa.
    public static BOFactory getInstance() {
        return (boFactory == null) ? new BOFactory() : boFactory;//bofactory one unoth eka gnn,null nm object ekk hadala return krnwa,tiye nm e instance ekm return krnwa
    }//singleton tiye,factory design pattern walt use krnwa,object create krna eka hide krnwa

    public enum BOTypes {//types define krnwa//enum item define krgnnwa
        CUSTOMER,
        ITEM,
        ORDER,
        PLACE_ORDER,

    }
    public SuperBO getBO(BOTypes boType) {//method type eka anuwa related bo tika return krnwa
        switch (boType) {
            case CUSTOMER:
                return new CustomerBOImpl();
            case ITEM://case eka item nm return krnn ItemBOImpl ekk.. e widiyt krnne
                return new ItemBOimpl();
            case PLACE_ORDER:
                return new PlaceOrderBOimpl();
            default:
                return null;

        }
    }


}
