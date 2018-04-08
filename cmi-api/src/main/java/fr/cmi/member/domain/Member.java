package fr.cmi.member.domain;

import lombok.*;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@EqualsAndHashCode
@Getter
@Builder
@ToString
@AllArgsConstructor
public class Member {

    @NotNull
    private String id;

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @NotNull
    private Long age;

    @NotNull
    private LocalDate birthDay;

    @NotNull
    private Role role;

    @NotNull
    private Gender gender;

    @NotNull
    private Status status;

    private String classe;
}
