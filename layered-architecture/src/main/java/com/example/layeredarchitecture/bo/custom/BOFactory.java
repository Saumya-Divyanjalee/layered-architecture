package com.example.layeredarchitecture.bo.custom;

import com.example.layeredarchitecture.bo.custom.impl.CustomerBOImpl;
import com.example.layeredarchitecture.bo.custom.impl.ItemBOimpl;
import com.example.layeredarchitecture.bo.custom.impl.PlaceOrderBOimpl;

public class BOFactory {
    private static BOFactory boFactory;
    private BOFactory() {}
    public static BOFactory getInstance() {
        return (boFactory == null) ? new BOFactory() : boFactory;
    }

    public enum BOTypes {
        CUSTOMER,
        ITEM,
        ORDER,
        PLACE_ORDER,

    }
    public SuperBO getBO(BOTypes boType) {
        switch (boType) {
            case CUSTOMER:
                return new CustomerBOImpl();
            case ITEM:
                return new ItemBOimpl();
            case PLACE_ORDER:
                return new PlaceOrderBOimpl();
            default:
                return null;

        }
    }


}
