package it.exolab.dao;

import org.apache.ibatis.session.SqlSession;

import it.exolab.mapper.AutomobileMapper;
import it.exolab.model.Automobile;
import it.exolab.util.MyBatisUtils;

public class AutomobileDao {

	public void insert(Automobile model) {
		
		SqlSession session = MyBatisUtils.getSqlSessionFactory().openSession();
		try {
			
			AutomobileMapper mapper = session.getMapper(AutomobileMapper.class);
			mapper.insert(model);
			session.commit();
		}
		catch(Exception e) {
			session.rollback();
			e.printStackTrace();
		}
		finally {
			session.close();
		}
		
	}
	
	
	
	
	
	
}
