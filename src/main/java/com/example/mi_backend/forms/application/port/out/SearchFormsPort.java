package com.example.mi_backend.forms.application.port.out;

import com.example.mi_backend.common.dto.PagedResult;
import com.example.mi_backend.forms.application.dto.FormListQuery;
import com.example.mi_backend.forms.domain.model.Form;

public interface SearchFormsPort {
    PagedResult<Form> search(FormListQuery query);
}
