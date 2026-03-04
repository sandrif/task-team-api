package com.sandra.task_team_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class TaskTeamApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskTeamApiApplication.class, args);
	}

}
