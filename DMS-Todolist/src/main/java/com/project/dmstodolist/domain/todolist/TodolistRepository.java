package com.project.dmstodolist.domain.todolist;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodolistRepository extends JpaRepository<Todolist, Long> {
}
