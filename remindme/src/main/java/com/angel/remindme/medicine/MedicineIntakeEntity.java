package com.angel.remindme.medicine;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "medicine_intake")
public class MedicineIntakeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "date_of_intake", nullable = false)
	private LocalDate dateOfIntake;

	@Column(name = "time_of_intake", nullable = false)
	private LocalTime timeOfIntake;

	@Column(name = "is_taken", nullable = false)
	private boolean isTaken;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "medicine_id", nullable = false)
	private MedicineEntity medicine;
}

