package com.example.mi_backend.questions.application.port.out;

import com.example.mi_backend.questions.domain.model.MatchingItem;

import java.util.List;

public interface LoadMatchingItemsPort {
    List<MatchingItem> loadLeftItems(Long questionId);
    List<MatchingItem> loadRightItems(Long questionId);
}
