package test;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

public class DAO {

	SqlSession sqlSession;
	
	public void setSqlSession(SqlSession sqlSession){
		
		this.sqlSession = sqlSession;
		
	}
	
	public Map<String, Object> selectList() throws Exception {

		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("list", sqlSession.selectList("TestMapper.selectList"));

		return map;
	}
}
