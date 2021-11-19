package com.example.order.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.order.model.OrderModel;
import com.example.order.repository.OrderRepository;


@RestController
public class OrderController {

	@Autowired
	private OrderRepository mainRepository;
	
	//save the Order
	@PostMapping("/saveOrder")
	public String save(@RequestBody OrderModel order) {
		mainRepository.save(order);
		return "Added Employee with id: "+order.getId();
	}
	
	//find all Order
	@GetMapping("/findAllOrder")
	public Iterable<OrderModel> getAll(){
		return mainRepository.findAll();
	}
	
	//find the Order by id
	@GetMapping("/findAllOrder/{id}")
	public Optional<OrderModel> getOrder(@PathVariable int id){
		return mainRepository.findById(id);
	}
	
	//delete the Order by id
	@DeleteMapping("/delete/{id}")
	public String deleteOrder(@PathVariable int id) {
		 mainRepository.deleteById(id);
		 return "Delete Order with id: "+id;
	}
	
	//update the Order by id
	@PutMapping("/update/{id}")
	public String updateOrder(@RequestBody OrderModel order, @PathVariable int id) {
		mainRepository.findById(id);
		mainRepository.save(order);
		return "Update Order with id: "+id;
		
	}
}
