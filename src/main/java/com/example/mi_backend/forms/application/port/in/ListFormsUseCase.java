package com.example.mi_backend.forms.application.port.in;

import com.example.mi_backend.common.dto.PagedResult;
import com.example.mi_backend.forms.application.dto.FormListQuery;
import com.example.mi_backend.forms.domain.model.Form;

public interface ListFormsUseCase {
    PagedResult<Form> handle(FormListQuery query);
}
