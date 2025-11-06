package com.example.mi_backend.forms.application.usecase;

import com.example.mi_backend.common.dto.PagedResult;
import com.example.mi_backend.forms.application.dto.FormListQuery;
import com.example.mi_backend.forms.application.port.in.ListFormsUseCase;
import com.example.mi_backend.forms.application.port.out.SearchFormsPort;
import com.example.mi_backend.forms.domain.model.Form;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class ListFormsService implements ListFormsUseCase {
    private final SearchFormsPort searchPort;
    public ListFormsService(SearchFormsPort searchPort){ this.searchPort = searchPort; }
    @Override public PagedResult<Form> handle(FormListQuery query){ return searchPort.search(query); }
}
