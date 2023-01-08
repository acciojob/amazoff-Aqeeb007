package com.driver;

import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class OrderRepository {

    ///////////////////////////////////////////

    HashMap<String,Order> orderMap = new HashMap<>();
    HashMap<Integer,DeliveryPartner> deliveryPartnerMap = new HashMap<>();

    ///////////////////////////////////

    public void addOrder(Order order){
        String id = order.getId();
        orderMap.put(id,order);
    }

}
