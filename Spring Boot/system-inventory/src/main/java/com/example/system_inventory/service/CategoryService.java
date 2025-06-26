package com.example.system_inventory.service;

import com.example.system_inventory.dto.CategoryDto;
import com.example.system_inventory.dto.request.CategoryRequestDto;
import com.example.system_inventory.entity.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface CategoryService {

    //Método para paginación sin termino de busqueda
    Page<CategoryDto> getCategories(Pageable pageable);

    //Método de paginación con termino de busqueda
    Page<CategoryDto> getCategories(String searchTerm, Pageable pageable);

    //Método para obtener todas las categorias sin paginación
    List<CategoryDto> getCategories();
    //Método para opciones de buscar y editar
    Optional<Category> getCategory(Long id);
    //Método para guardar categoria
    void saveCategory(CategoryRequestDto categoryRequestDto);
    //Método para actualizar categoria
    void updateCategory(CategoryRequestDto categoryRequestDto);
    //Método para eliminar categoria
    void delete(Long id);
    //Método para mostrar paginación
    void toggleState(Long id);

}
