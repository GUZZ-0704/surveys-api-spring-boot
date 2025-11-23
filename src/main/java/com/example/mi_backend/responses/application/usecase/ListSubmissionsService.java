package com.example.mi_backend.responses.application.usecase;

import com.example.mi_backend.common.dto.PagedResult;
import com.example.mi_backend.responses.application.dto.ListSubmissionsQuery;
import com.example.mi_backend.responses.application.port.in.ListSubmissionsUseCase;
import com.example.mi_backend.responses.application.port.out.SearchSubmissionsPort;
import com.example.mi_backend.responses.domain.model.Submission;

public class ListSubmissionsService implements ListSubmissionsUseCase {

    private final SearchSubmissionsPort searchPort;

    public ListSubmissionsService(SearchSubmissionsPort searchPort) {
        this.searchPort = searchPort;
    }

    @Override
    public PagedResult<Submission> handle(ListSubmissionsQuery q) {
        return searchPort.findByForm(q.formId(), q.status(), q.page(), q.size());
    }
}
