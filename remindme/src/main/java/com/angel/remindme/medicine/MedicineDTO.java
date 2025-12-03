package com.angel.remindme.medicine;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalTime;
import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MedicineDTO {

	@NotBlank
	@Size(max = 100)
	private String name;

	@PositiveOrZero
	private double price;

	@Min(1)
	private int dosage;

	@NotNull
	@Size(min = 1)
	private List<LocalTime> timesPerDay;

	private String imageUrl;
}
