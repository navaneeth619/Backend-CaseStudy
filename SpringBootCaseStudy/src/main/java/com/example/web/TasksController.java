package com.example.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.domain.Tasks;
import com.example.repository.TasksRepository;
import com.example.service.TaskService;
import com.sun.xml.bind.v2.model.core.ID;

@RestController
public class TasksController {
	@Autowired
	private TaskService taskService;

	@Autowired
	TasksRepository repo;
	
	@PostMapping("/tasks")
	public long saveTasks(@RequestBody Tasks task) {
		System.out.println("saveTasks was called");
		taskService.saveOrUpdate(task);
		return task.getId();
	}
	
	@GetMapping("/tasks")
	public List<Tasks> getAllTasks() {
		System.out.println("getTasks was called");
		return taskService.findAllTasks();
	}
	
	@PutMapping("/tasks")
	public long updateTasks(@RequestBody Tasks task) {
		System.out.println("updateTasks was called");
		taskService.saveOrUpdate(task);
		return task.getId();
	}
	
	@GetMapping("/tasks/{id}")
	public Tasks getTaskById(@PathVariable long id) {
		System.out.println("getTaskById was called");
		return taskService.findTaskById(id);
	}
	
	@DeleteMapping("/tasks/{id}")
	public void deleteTaskById(@PathVariable long id) {
		System.out.println("deleteTaskById was called");
		taskService.deleteTaskById(id);
	}
	
	@GetMapping("/tasks?parent={id}")
	public List<Tasks> getTasksWithParent(@RequestParam int parent) {
		System.out.println("getTasksWithParent was called");
		return taskService.findTasksWithParent(parent);
	}
}