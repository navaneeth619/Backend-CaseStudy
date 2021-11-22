package com.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Tasks;
import com.example.repository.TasksRepository;
import com.sun.xml.bind.v2.model.core.ID;

@Service
public class TaskServiceImpl implements TaskService {
	@Autowired
	private TasksRepository repo;


	public void saveTasks(Tasks tasks) {
		repo.save(tasks);
	}


	public List<Tasks> findAllTasks() {
		List<Tasks> tasks = new ArrayList<Tasks>();
		repo.findAll().forEach(task -> tasks.add(task));
		return tasks;
	}


	public Tasks findTaskById(long id) {
		return repo.findById(id).get();
	}


	@Override
	public void saveOrUpdate(Tasks task) {
		repo.save(task);
		
	}


	@Override
	public void deleteTaskById(long id) {
		repo.deleteById(id);
		
	}


	@Override
	public List<Tasks> findTasksWithParent(int parent) {
		// TODO Auto-generated method stub
		return repo.findTasks(parent);
	}

}
