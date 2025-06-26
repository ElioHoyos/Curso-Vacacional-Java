package com.example.system_inventory.controller;

import com.example.system_inventory.dto.CategoryDto;
import com.example.system_inventory.service.CategoryService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/category")
@Validated
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }
    //Endpoint paginado con Pageable
    @GetMapping("/paged")
    public ResponseEntity<Page<CategoryDto>> getCategoriesPaged(
            @PageableDefault(size = 10, sort = "dateCreated", direction = Sort.Direction.ASC)Pageable pageable){
            Page<CategoryDto> categories = categoryService.getCategories(pageable);
            return ResponseEntity.ok(categories);
    }

    //Método sin paginación
    @GetMapping
    public ResponseEntity<List<CategoryDto>> getAllCategories(){
        List<CategoryDto> categories = categoryService.getCategories();
        return ResponseEntity.ok(categories);
    }

    //

}
