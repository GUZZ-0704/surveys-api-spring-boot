package com.example.mi_backend.forms.application.port.in;

import com.example.mi_backend.common.dto.PagedResult;
import com.example.mi_backend.forms.application.dto.SectionListQuery;
import com.example.mi_backend.forms.domain.model.Section;

public interface ListSectionsUseCase {
    PagedResult<Section> handle(SectionListQuery query);
}
