package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class DatabaseConnectionApplication {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(DatabaseConnectionApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		String sql="insert into user (name,email,password) VALUES (?,?,?)";
//		int result=jdbcTemplate.update(sql,"divyansh","gupta","hi");
//		if (result>0)
//			System.out.println("successful");
//	}

}
