package org.bostonbragg.billstracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.sql.DataSource;

@SpringBootApplication
@EnableJpaRepositories
@EnableJpaAuditing
public class BillsTrackerApplication {
	public static void main(String[] args) {
		SpringApplication.run(BillsTrackerApplication.class, args);
	}
	@Bean
	@Primary
	@ConfigurationProperties(prefix="spring.datasource")
	public DataSource primaryDataSource() {
		return DataSourceBuilder.create().build();
	}
}
