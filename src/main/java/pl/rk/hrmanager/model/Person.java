package pl.rk.hrmanager.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Person {

    @Id
    @NotNull
    @Column (name = "pesel")
    private Long pesel;

    @NotNull
    @Column (name = "name")
    private String name;

    @NotNull
    @Column (name = "surname")
    private String surname;

    @NotNull
    @Column (name = "sex")
    private Sex sex;

    @NotNull
    @Column (name = "salary")
    private Double salary;

    @NotNull
    @Column (name = "penality")
    private Penality penality;

    @NotNull
    @Column (name = "employment_data")
    private LocalDate employmentData;



}
