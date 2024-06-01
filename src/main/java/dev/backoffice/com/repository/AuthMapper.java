package dev.backoffice.com.repository;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AuthMapper {
	
	public List<Map<String, Object>> selectList(Map<String, Object> param);
	
}