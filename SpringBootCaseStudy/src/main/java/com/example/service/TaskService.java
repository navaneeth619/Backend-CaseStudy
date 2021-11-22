package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.domain.Tasks;
import com.sun.xml.bind.v2.model.core.ID;

public interface TaskService {
	public void saveTasks(Tasks tasks);
	public List<Tasks> findAllTasks();
	public Tasks findTaskById(long id);
	public void saveOrUpdate(Tasks task);
	public void deleteTaskById(long id);
	public List<Tasks> findTasksWithParent(int parent);
}
