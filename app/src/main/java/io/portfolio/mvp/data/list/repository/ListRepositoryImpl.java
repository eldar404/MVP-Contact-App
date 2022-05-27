package io.portfolio.mvp.data.list.repository;

import androidx.room.Room;

import java.util.List;

import javax.inject.Inject;

import io.portfolio.mvp.data.list.data.ListDatabase;
import io.portfolio.mvp.data.list.local.LocalListModel;

public class ListRepositoryImpl implements ListRepository {

    ListDatabase database;

    @Inject
    public ListRepositoryImpl(ListDatabase database) {
        this.database = database;
    }

    @Override
    public List<LocalListModel> getAllListItem() {
        return database.listDao().getAll();
    }
}
