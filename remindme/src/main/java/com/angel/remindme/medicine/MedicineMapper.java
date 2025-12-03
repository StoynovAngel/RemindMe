package com.angel.remindme.medicine;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MedicineMapper {

	MedicineDTO toDto(MedicineEntity entity);

	MedicineEntity toEntity(MedicineDTO dto);
}