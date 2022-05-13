package com.example.demo;

import com.example.demo.model.Filter;
import com.example.demo.model.MovieFilter;
import com.example.demo.service.BookingServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class MultiplexManagementRunner {

	public static void main(String[] args) {
		SpringApplication.run(MultiplexManagementRunner.class, args);
		BookingServiceImpl bookingService = new BookingServiceImpl();
		List<Filter> filters = new ArrayList<>();
		filters.add(new MovieFilter("abc"));
		bookingService.checkAvailability(filters);
	}

}
