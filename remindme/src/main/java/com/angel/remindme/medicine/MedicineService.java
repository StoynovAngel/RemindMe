package com.angel.remindme.medicine;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MedicineService {

	private final MedicineRepository medicineRepository;
	private final MedicineMapper medicineMapper;

	public Optional<MedicineDTO> getMedicine(String name) {
		if (name.isEmpty()) {
			return Optional.empty();
		}

		return medicineRepository.findByName(name).map(medicineMapper::toDto);
	}
}
