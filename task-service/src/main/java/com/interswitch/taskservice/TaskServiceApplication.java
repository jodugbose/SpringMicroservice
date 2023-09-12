package com.interswitch.taskservice;

import com.interswitch.taskservice.model.Task;
import com.interswitch.taskservice.repository.TaskRepository;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@OpenAPIDefinition(info =
@Info(title = "Task API", version = "1.0", description = "Documentation Task API v1.0")
)
public class TaskServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskServiceApplication.class, args);
	}

	@Bean
	TaskRepository taskRepository(){
		TaskRepository taskRepository = new TaskRepository();
		taskRepository.add(new Task(1L,"Irene Ikpo",2L));
		taskRepository.add(new Task(1L,"Johnson Adenowo",1L));
		taskRepository.add(new Task(1L,"Anna London",1L));
		return taskRepository;
		
	}

}
