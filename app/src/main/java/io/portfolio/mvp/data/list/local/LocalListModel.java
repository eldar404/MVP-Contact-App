package io.portfolio.mvp.data.list.local;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.ArrayList;
import java.util.List;

@Entity(tableName = "list")
public class LocalListModel {
    @PrimaryKey
    public int uid;

    @ColumnInfo(name = "first_name")
    public String firstName;

    @ColumnInfo(name = "last_name")
    public String lastName;

    @ColumnInfo(name = "number")
    public String Number;

    @ColumnInfo(name = "school")
    public String school;

    @ColumnInfo(name = "numbers")
    public int numbers;
}
