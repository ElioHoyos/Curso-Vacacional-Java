package com.example.system_inventory.dto;

import lombok.Builder;
import lombok.Getter;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Builder
public class CategoryDto implements Serializable {
    private Long id;
    private String name;
    private Boolean state;
    private LocalDate dateCreated;
    private LocalDate dateModified;
}
