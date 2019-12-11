package com.qdgx.dmp.test.client;

import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import com.qdgx.dmp.test.client.fallback.MetaCatalogFallback;

@FeignClient(value = "qdgx-dmp-cs", fallback = MetaCatalogFallback.class)
public interface IMetaCatalogClient {
	@PostMapping(value = "/cs/mc/getMetaCatalogById")
	Map<String, Object> getMetaCatalogById(Map<String, Object> paramMap) throws Exception;

}
