package com.ota.coding.challenge.exception.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResponseDto {

    private static final String GENERIC_ERROR_CODE = "GR01";


    private String message;
    private String errorCode;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<String> errors;

    public ErrorResponseDto (String message) {
        this.message = message;
        this.errorCode = GENERIC_ERROR_CODE;
    }
    public ErrorResponseDto (String message, String errorCode) {
        this.message = message;
        this.errorCode = errorCode;
    }

}
