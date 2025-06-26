package com.example.system_inventory.dto.request;

import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class CategoryRequestDto {

    private Long id;
    @NotEmpty(message = "El nombre de la categoría no puede estar vacía.")
    private String name;
    private Boolean state;

}
