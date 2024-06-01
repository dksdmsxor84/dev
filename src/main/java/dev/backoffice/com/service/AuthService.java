package dev.backoffice.com.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.backoffice.com.repository.AuthMapper;

@Service
public class AuthService {
	
	@Autowired
	AuthMapper authMapper;
	
	public List<Map<String, Object>> selectList(Map<String, Object> param) {
		return authMapper.selectList(param);
	}

}