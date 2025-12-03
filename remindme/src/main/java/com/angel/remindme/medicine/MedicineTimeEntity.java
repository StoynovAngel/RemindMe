package com.angel.remindme.medicine;

import jakarta.persistence.*;

import java.time.LocalTime;

@Entity
@Table(name = "medicine_time")
public class MedicineTimeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "schedule", nullable = false)
	private LocalTime schedule;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "medicine_id", nullable = false)
	private MedicineEntity medicine;
}