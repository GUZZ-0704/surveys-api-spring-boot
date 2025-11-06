package com.example.mi_backend.forms.application.port.out;

import com.example.mi_backend.common.dto.PagedResult;
import com.example.mi_backend.forms.application.dto.SectionListQuery;
import com.example.mi_backend.forms.domain.model.Section;

public interface SearchSectionsPort {
    PagedResult<Section> search(SectionListQuery query);
}
