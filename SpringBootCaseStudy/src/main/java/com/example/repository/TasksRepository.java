package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.domain.Tasks;
import com.sun.xml.bind.v2.model.core.ID;

public interface TasksRepository extends CrudRepository<Tasks, Long> {
	
	@Query("select t from  Tasks t where t.parent = ?1 ")
	List<Tasks> findTasks(Integer parent);
}
