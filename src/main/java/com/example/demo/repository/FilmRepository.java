package com.example.demo.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Film;


@Repository
public interface FilmRepository extends JpaRepositoryImplementation<Film, Integer>{

}
