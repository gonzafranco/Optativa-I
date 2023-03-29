package ar.com.unpaz.cliente.serviceImp;

import java.util.List;

import ar.com.unpaz.cliente.repositoryImp.LecturaRepositoryImp;
import ar.com.unpaz.cliente.service.lecturaService;


public class LecturaServiceImp implements lecturaService {
	
	private LecturaRepositoryImp guardarDatos = new LecturaRepositoryImp();

	
	@Override
	public void leer(List l) {
		
		l.forEach(ls -> System.out.println(ls.toString()));

	}

}
