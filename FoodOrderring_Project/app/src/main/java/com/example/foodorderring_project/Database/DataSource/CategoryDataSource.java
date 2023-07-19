package com.example.foodorderring_project.Database.DataSource;

import android.database.sqlite.SQLiteDatabase;

import com.example.foodorderring_project.Database.MySQLiteHelper;

public class CategoryDataSource {
    // Database fields
    private SQLiteDatabase database;
    private MySQLiteHelper dbHelper;
    private String[] allColumns = { MySQLiteHelper.COLUMN_ID_FOOD,
            MySQLiteHelper.COLUMN_NAME_FOOD,
            MySQLiteHelper.COLUMN_PRICE
    };
}
