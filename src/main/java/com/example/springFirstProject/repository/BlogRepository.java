package com.example.springFirstProject.repository;

import com.example.springFirstProject.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog, Long> {
}
