package com.example.system_inventory.service.impl;

import com.example.system_inventory.dto.CategoryDto;
import com.example.system_inventory.dto.request.CategoryRequestDto;
import com.example.system_inventory.entity.Category;
import com.example.system_inventory.repository.CategoryRepository;
import com.example.system_inventory.service.CategoryService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Page<CategoryDto> getCategories(Pageable pageable) {
        return null;
    }

    @Override
    public Page<CategoryDto> getCategories(String searchTerm, Pageable pageable) {
        return null;
    }

    @Override
    public List<CategoryDto> getCategories() {
        return List.of();
    }

    @Override
    public Optional<Category> getCategory(Long id) {
        return Optional.empty();
    }

    @Override
    public void saveCategory(CategoryRequestDto categoryRequestDto) {

    }

    @Override
    public void updateCategory(CategoryRequestDto categoryRequestDto) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void toggleState(Long id) {

    }
}
