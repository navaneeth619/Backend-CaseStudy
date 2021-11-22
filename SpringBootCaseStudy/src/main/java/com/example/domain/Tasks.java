package com.example.domain;

import java.util.Optional;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TASKS")
public class Tasks {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	long id;
	
	@Column
	String title;
	
	@Column
	String details;
	
	@Column
	String when;
	
	@Column
	String deadline;
	
	@Column
	Boolean is_project;
	
	@Column
	int parent;
	
	@Column
	Boolean done;
	
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	Boolean isproject;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getWhen() {
		return when;
	}

	public void setWhen(String when) {
		this.when = when;
	}

	public String getDeadline() {
		return deadline;
	}

	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

	public Boolean getIs_project() {
		return is_project;
	}

	public void setIs_project(Boolean is_project) {
		this.is_project = is_project;
	}

	public int getParent() {
		return parent;
	}

	public void setParent(int parent) {
		this.parent = parent;
	}

	public Boolean getDone() {
		return done;
	}

	public void setDone(Boolean done) {
		this.done = done;
	}


//	public Boolean getIsproject() {
//		return isproject;
//	}
//
//	public void setIsproject(Boolean isproject) {
//		this.isproject = isproject;
//	}
}
