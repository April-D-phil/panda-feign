package com.panda.feign.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class UserServiceHystrix implements UserService{

	@Override
	public Map findAll() {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("rtn", false);
		map.put("info", "获取接口数据失败！");
		return map;
	}

}
