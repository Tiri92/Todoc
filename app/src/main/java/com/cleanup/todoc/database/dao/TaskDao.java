package com.cleanup.todoc.database.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.cleanup.todoc.model.Task;

import java.util.List;

@Dao
public interface TaskDao {

    @Query("SELECT * FROM Task")
    LiveData<List<Task>> getTasks();

    @Insert
    long insertTask(Task task);

    @Update
    int updateTask(Task task);

    @Query("DELETE FROM Task WHERE id = :taskId")
    int deleteTask(long taskId);

}

/*
@Query("SELECT * FROM Task")
    public Single<List<Task>> getTasks();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public Completable insertTask(Task task);

    @Update
    public Completable updateTask(Task task);

    @Query("DELETE FROM Task WHERE id = :taskId")
    public Completable deleteTask(long taskId);
 */
