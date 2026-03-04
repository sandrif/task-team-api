package com.sandra.task_team_api;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
@org.junit.jupiter.api.Disabled
@SpringBootTest(classes = TaskTeamApiApplication.class)
//		(properties = {
//				"spring.autoconfigure.exclude=" +
//						"org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration," +
//						"org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration," +
//						"org.springframework.boot.autoconfigure.flyway.FlywayAutoConfiguration"
//		})

//@org.springframework.test.context.ActiveProfiles("nodb")
@org.springframework.test.context.ActiveProfiles("test")

class TaskTeamApiApplicationIT {

	@Test
	void contextLoads() {
	}

}
