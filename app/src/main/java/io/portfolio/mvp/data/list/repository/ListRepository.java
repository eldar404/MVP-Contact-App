package io.portfolio.mvp.data.list.repository;

import java.util.List;

import io.portfolio.mvp.data.list.local.LocalListModel;

public interface ListRepository {
    List<LocalListModel> getAllListItem();
}
