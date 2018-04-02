package fr.cmi.member.domain;

import lombok.*;

import javax.validation.constraints.NotNull;

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

}
