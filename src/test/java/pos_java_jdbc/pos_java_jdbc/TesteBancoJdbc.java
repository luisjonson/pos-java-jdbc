package pos_java_jdbc.pos_java_jdbc;

import java.util.List;

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

	@Test
	public void initListar() {
		UserPosDao dao = new UserPosDao();
		try {
			List<Userposjava> list = dao.listar();
			for (Userposjava userposjava : list) {
				System.out.println(userposjava);
				System.out.println("__________________________________________");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void initBuscar() {
		UserPosDao dao = new UserPosDao();
		try {
			Userposjava userposjava = dao.buscar(6L);

			System.out.println(userposjava);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test
	public void initAtualizar() {

		try {
			UserPosDao dao = new UserPosDao();
			Userposjava objetoBanco = dao.buscar(3L);
			objetoBanco.setNome("Nome mudado com metodo atualizar ");
			dao.atualizar(objetoBanco);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}
}
