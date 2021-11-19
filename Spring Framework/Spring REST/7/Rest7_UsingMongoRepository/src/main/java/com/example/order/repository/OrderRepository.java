package com.example.order.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.order.model.OrderModel;

public interface OrderRepository extends MongoRepository<OrderModel, Integer> {

}
