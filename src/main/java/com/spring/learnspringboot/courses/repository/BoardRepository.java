package com.spring.learnspringboot.courses.repository;

import com.spring.learnspringboot.courses.bean.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board,Long> {
}
