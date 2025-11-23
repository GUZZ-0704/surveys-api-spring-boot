package com.example.mi_backend.questions.infrastructure.adapter.out.jpa.repository;

import com.example.mi_backend.questions.infrastructure.adapter.out.jpa.entity.MatchingPairEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MatchingPairRepository extends JpaRepository<MatchingPairEntity, Long> {
    List<MatchingPairEntity> findByQuestionId(Long questionId);
    void deleteByQuestionId(Long questionId);
}
