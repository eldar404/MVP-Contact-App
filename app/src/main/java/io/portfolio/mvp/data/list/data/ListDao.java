package io.portfolio.mvp.data.list.data;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import io.portfolio.mvp.data.list.local.LocalListModel;

@Dao
public interface ListDao {
    @Query("SELECT * FROM list")
    List<LocalListModel> getAll();

    @Query("SELECT * FROM list WHERE uid IN (:userIds)")
    List<LocalListModel> loadAllByIds(int[] userIds);

    @Query("SELECT * FROM list WHERE first_name LIKE :first AND " +
            "last_name LIKE :last LIMIT 1")
    LocalListModel findByName(String first, String last);

    @Insert
    void insertAll(LocalListModel... item);

    @Delete
    void delete(LocalListModel item);
}