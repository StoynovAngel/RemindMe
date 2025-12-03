package com.angel.remindme.medicine;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "medicine")
public class MedicineEntity {

	private String name;
	private double price;
	private int dosage;
	private int timesPerDay;
	private int isTaken;
}
