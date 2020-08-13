package com.example.database;

import com.example.database.Model.Order;
import com.example.database.Model.User;
import com.example.database.Repo.OrderRepo;
import com.example.database.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class DatabaseApplication {
	@Autowired
	private OrderRepo orderRepo;

	@Autowired
	private UserRepo userRepo;
	public static void main(String[] args) {
		SpringApplication.run(DatabaseApplication.class, args);

	}

	@EventListener(ApplicationReadyEvent.class)
	public void doSomeThing(){
		Order order = orderRepo.findById(2).get();
		System.out.println(order);
	}



}
