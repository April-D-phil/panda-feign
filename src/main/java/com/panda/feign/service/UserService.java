package com.panda.feign.service;

import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value="PANDA-FRAME", fallback = UserServiceHystrix.class)
public interface UserService {

	@RequestMapping("/user/findAll")
	Map findAll();
	
}
