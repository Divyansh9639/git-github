package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import lombok.Data;

@Entity
@Data
@Component
public class Student {
	private String name;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer roll;
	private String subject;

}
