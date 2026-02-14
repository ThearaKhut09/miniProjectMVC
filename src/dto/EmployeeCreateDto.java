package dto;


import java.time.LocalDate;

public record EmployeeCreateDto(
        String fullName,
        Double salary,
        LocalDate hireDate
) {

}
