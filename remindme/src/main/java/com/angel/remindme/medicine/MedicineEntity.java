package com.angel.remindme.medicine;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "medicine")
public class MedicineEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "name", nullable = false, length = 100)
	private String name;

	@Column(name = "image_url")
	private String imageUrl;

	@Column(name = "price", nullable = false)
	private double price;

	@Column(name = "dosage", nullable = false)
	private int dosage;

	@OneToMany(mappedBy = "medicine", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<MedicineTimeEntity> timesPerDay = new ArrayList<>();
}