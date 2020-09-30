package com.training;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {
	@Autowired
	ProjectRepository projectRepository;
	
	@PostMapping("/project")
	public void createProject(@RequestBody Project p) {
		projectRepository.save(p);
		
	}
	@GetMapping("/project")
	public ArrayList<Project> getAll(){
		ArrayList<Project> projects=new ArrayList<Project>();
		Iterable<Project> projectI=projectRepository.findAll();
		for(Project p:projectI) {
			projects.add(p);
		}
		return projects;
	}
	@GetMapping("/person/{id}")
	public Optional<Project> findById(@PathVariable("id") Long id) {
		return projectRepository.findById(id);
	}
	
}
