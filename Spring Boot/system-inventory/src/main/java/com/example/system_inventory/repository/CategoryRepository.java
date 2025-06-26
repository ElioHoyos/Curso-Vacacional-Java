package com.example.system_inventory.repository;

import com.example.system_inventory.entity.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    //Método para buscar por nombre
    Optional<Category> findByName(String name);
    //Método para buscar por nombre e ID
    Optional<Category> findByNameAndIdNot(String name, Long id);

    //Método para paginación automático y filtrado por estado
    Page<Category> findByState(Boolean state, Pageable pageable);

    //Método para buscar por nombre (mayúsculas/minúsculas)
    Page<Category> findByNameContainingIgnoreCase(String name, Pageable pageable);

}
