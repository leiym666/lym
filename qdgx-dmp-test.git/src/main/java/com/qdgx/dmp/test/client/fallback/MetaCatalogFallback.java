package com.qdgx.dmp.test.client.fallback;

import java.util.HashMap;
import java.util.Map;

import org.apache.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.qdgx.dmp.test.client.IMetaCatalogClient;

@Component
public class MetaCatalogFallback implements IMetaCatalogClient{

	@Override
	public Map<String, Object> getMetaCatalogById(Map<String,Object> paramMap) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("code", HttpStatus.SC_BAD_GATEWAY);
		map.put("message", "调用微服务异常");
		return map;
	}

}
