package com.ferhad.accountservice;

import com.ferhad.accountservice.model.RoleAcc;
import com.ferhad.accountservice.model.UserAcc;
import com.ferhad.accountservice.repository.RoleRepository;
import com.ferhad.accountservice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
@EnableEurekaClient
@RequiredArgsConstructor
public class AccountServiceApplication {
	private final UserRepository userRepository;
	private final RoleRepository roleRepository;

	public static void main(String[] args) {
		SpringApplication.run(AccountServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner() {
		return args -> {
			RoleAcc roleAcc = RoleAcc.builder()
					.name("ROLE_ADMIN")
					.build();
			roleRepository.save(roleAcc);
			Set<RoleAcc> rolesOfAdmin= new HashSet<>();
			rolesOfAdmin.add(roleAcc);
			UserAcc admin = UserAcc.builder()
					.username("admin")
					.password("pass")
					.roles(rolesOfAdmin)
					.build();
			userRepository.save(admin);

			RoleAcc roleAcc1 = RoleAcc.builder()
					.name("ROLE_USER")
					.build();
			roleRepository.save(roleAcc1);
			Set<RoleAcc> rolesOfUser = new HashSet<>();
			rolesOfUser.add(roleAcc);
			UserAcc user = UserAcc.builder()
					.username("user")
					.password("pass")
					.roles(rolesOfUser)
					.build();
			userRepository.save(user);
		};
	}

}
