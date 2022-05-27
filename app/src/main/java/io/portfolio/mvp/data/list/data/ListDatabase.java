package io.portfolio.mvp.data.list.data;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;

import io.portfolio.mvp.data.list.local.LocalListModel;

@Database(entities = {LocalListModel.class}, version = 1, exportSchema = false)
public abstract class ListDatabase extends RoomDatabase {

    public static final String dataBaseName = "list-database";

    public abstract ListDao listDao();
}
