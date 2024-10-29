package dtos;

import java.time.LocalDate;
import Enum.Speciality;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;


@Data
public class DoctorDTO {

    private Long id;
    private String name;
    private LocalDate dateOfBirth;
    private int yearOfGraduation;
    private String nameOfClinic;
    private Speciality speciality;

    public DoctorDTO(String name, LocalDate dateOfBirth, int yearOfGraduation, String nameOfClinic, Speciality speciality) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.yearOfGraduation = yearOfGraduation;
        this.nameOfClinic = nameOfClinic;
        this.speciality = speciality;
    }
}
