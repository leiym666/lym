package com.qdgx.dmp.test.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qdgx.dmp.test.client.IMetaCatalogClient;
import com.qdgx.dmp.test.entity.User;
import com.qdgx.dmp.test.service.IUserService;

@RestController
public class MetaCataLogController {
	
	@Autowired
	private IUserService userService;
	@Autowired
	private IMetaCatalogClient metaCataClient;
	
	@GetMapping("/getMetaCataLog")
	public Map<String,Object> getMetaCataLog(){
		List<User>  list = userService.findAllUsers();
		System.out.println(list);
		Map<String,Object> paramMap = new HashMap<String,Object>();
		paramMap.put("id", "8a818be86651ad8b016651ad9bf60000");
		Map<String, Object> result;
		try {
			result = metaCataClient.getMetaCatalogById(paramMap);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
