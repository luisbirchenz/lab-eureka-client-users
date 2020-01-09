package com.lab.user.api;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lab.user.api.dto.UserDto;

@RestController
@RequestMapping("/api")
public class UserController {

	@GetMapping("users")
	public List<UserDto> getUsers() {
		return Collections.unmodifiableList(getDummyData());
	}
	
	private List<UserDto> getDummyData() {
		return Stream.of(
			new UserDto(1L, "Luis", "Birchenz", "lbirchenz"),
			new UserDto(1L, "Simon", "Fermo", "sfermo"),
			new UserDto(1L, "Walter", "Peirone", "wpeirone")
		).collect(Collectors.toList());
	}
}
