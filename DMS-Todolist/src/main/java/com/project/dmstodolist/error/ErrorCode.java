package com.project.dmstodolist.error;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {

    Bad_Request(400, "Bad Request"),

    Conflict(409, "Conflict"),

    Internal_Server_Error(500, " Internal Server Error");


    private final int status;

    private final String message;
}

