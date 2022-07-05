package com.project.dmstodolist.controller.dto.todolistdto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotNull;

@Builder
@AllArgsConstructor
@NotNull
@Getter
public class CreateTodolistDto {

    @NotNull
    private String title;

    @NotNull
    private String content;
}
