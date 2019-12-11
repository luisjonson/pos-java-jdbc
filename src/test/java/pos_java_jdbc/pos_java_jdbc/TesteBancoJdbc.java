package pos_java_jdbc.pos_java_jdbc;

import org.junit.Test;

import dao.UserPosDao;
import model.Userposjava;

public class TesteBancoJdbc {

	@Test
	public void initBanco() {
		UserPosDao userPosDao = new UserPosDao();
		Userposjava userPosJava = new Userposjava();

		userPosJava.setId(8L);
		userPosJava.setNome("carlos");
		userPosJava.setEmail("carlos@gmail.com");
		userPosDao.salva(userPosJava);
	}

}
