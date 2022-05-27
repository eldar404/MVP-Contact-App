package io.portfolio.mvp.domain.list.usecases;

import javax.inject.Inject;

import io.portfolio.mvp.data.list.repository.ListRepository;

public class GetListUseCase {

    @Inject
    ListRepository repository;
}
