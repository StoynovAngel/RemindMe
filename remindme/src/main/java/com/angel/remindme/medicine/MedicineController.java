package com.angel.remindme.medicine;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/medicine")
public class MedicineController {

	private final MedicineService medicineService;

	@GetMapping
	public ResponseEntity<MedicineDTO> getMedicine(@RequestParam String medicineName) {
		return medicineService.getMedicine(medicineName)
				.map(ResponseEntity::ok)
				.orElse(ResponseEntity.noContent().build());
	}

	@GetMapping("/all")
	public Set<MedicineDTO> getAllMedicines() {
		return Set.of();
	}

	@PostMapping("/create")
	public MedicineDTO createMedicine(@RequestBody @Valid MedicineDTO medicineDTO) {
		return null;
	}
}
