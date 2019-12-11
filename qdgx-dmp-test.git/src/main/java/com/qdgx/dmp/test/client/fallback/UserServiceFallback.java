package com.qdgx.dmp.test.client.fallback;

import org.springframework.stereotype.Component;

import com.qdgx.dmp.comm.ResponseData;
import com.qdgx.dmp.test.client.IUserServiceClient;
@Component
public class UserServiceFallback implements IUserServiceClient {


	@Override
	public ResponseData sysAddType(String json) {
		return null;
	}

	@Override
	public ResponseData findMenuByRoles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseData login(String json) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseData getTypeById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
