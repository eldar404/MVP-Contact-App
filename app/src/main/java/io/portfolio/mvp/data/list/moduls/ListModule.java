package io.portfolio.mvp.data.list.moduls;

import android.content.Context;

import androidx.room.Room;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import io.portfolio.mvp.data.list.data.ListDatabase;
import io.portfolio.mvp.data.list.repository.ListRepository;
import io.portfolio.mvp.data.list.repository.ListRepositoryImpl;

@Module
@InstallIn(SingletonComponent.class)
public class ListModule {

    @Singleton
    @Provides
    ListDatabase listAppDatabase(@ApplicationContext Context context) {
        return Room.databaseBuilder(context, ListDatabase.class, ListDatabase.dataBaseName).build();
    }

    @Singleton
    @Provides
    ListRepository listRepository(ListDatabase listDatabase) {
        return new ListRepositoryImpl(listDatabase);
    }
}
