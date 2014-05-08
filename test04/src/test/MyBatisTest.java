package test;


import org.apache.ibatis.session.SqlSession;

public class MyBatisTest {

	//////////////////////////////////////////////
	
	public static void main(String[] args) throws Exception {
		
		SqlSession sqlSession = SqlSessionFactoryBean.getSqlSession();
		
		DAO dao = new DAO();
		
		dao.setSqlSession(sqlSession);
		
		System.out.println(dao.selectList());

		
	}

}
