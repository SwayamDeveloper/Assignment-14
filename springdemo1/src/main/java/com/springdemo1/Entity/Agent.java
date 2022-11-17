package com.springdemo1.Entity;

import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Agent {

	private int id;
	private String name;
	private String Area;
	private int commission;
	
}
