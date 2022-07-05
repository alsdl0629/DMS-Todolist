package com.project.dmstodolist.controller.dto.memberdto;

import lombok.*;

import javax.validation.constraints.NotNull;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class MemberSignInDto {

    @NotNull
    private String account_id;

    @NotNull
    private String password;

}
