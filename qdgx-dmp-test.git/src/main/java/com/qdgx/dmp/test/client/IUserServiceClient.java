package com.qdgx.dmp.test.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.qdgx.dmp.comm.ResponseData;
import com.qdgx.dmp.test.client.fallback.UserServiceFallback;

@FeignClient(value = "qdgx-dmp-system",fallback = UserServiceFallback.class)
public interface IUserServiceClient {
	@PostMapping(value = "/sys/item/findTypeList")
	ResponseData sysAddType(String json);
	
	@GetMapping(value = "/auth/findMenuByRoles")
	ResponseData findMenuByRoles();
	
	@PostMapping(value = "/auth/login")
	ResponseData login(String json);
	
	@GetMapping(value = "/sys/item/getTypeById/{id}")
	ResponseData getTypeById(@PathVariable("id") String id);
}
