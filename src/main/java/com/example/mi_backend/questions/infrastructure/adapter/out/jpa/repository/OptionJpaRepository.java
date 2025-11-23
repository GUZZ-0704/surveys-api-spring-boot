package com.example.mi_backend.questions.infrastructure.adapter.out.jpa.repository;

import com.example.mi_backend.questions.infrastructure.adapter.out.jpa.entity.OptionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OptionJpaRepository extends JpaRepository<OptionEntity, Long> {
    List<OptionEntity> findByQuestionIdOrderByPositionAsc(Long questionId);
    void deleteByQuestionId(Long questionId);
}
