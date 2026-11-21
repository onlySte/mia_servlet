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
	
//1) openSession() → apre la connessione al database
//2) getMapper(...) → prende il mapper, cioè l'oggetto che conosce le query di Automobile
//3) mapper.insert(model) → esegue l'insert
//4) commit() → conferma l'operazione (senza commit i dati non vengono salvati davvero)
//5)	 rollback() → se qualcosa va storto, annulla l'operazione
//6)	 close() → nel finally, quindi viene eseguito sempre: chiude la connessione sia che vada bene sia che vada male
	
	
	
	
}
