package pl.rk.hrmanager.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class PersonRequest {

    @NotNull
    private Long pesel;

    @NotNull
    private String name;

    @NotNull
    private String surname;

    @NotNull
    private Sex sex;

    @NotNull
    private Double salary;

    @NotNull
    private Penality penality;

    @NotNull
    private LocalDate employmentData;

}
