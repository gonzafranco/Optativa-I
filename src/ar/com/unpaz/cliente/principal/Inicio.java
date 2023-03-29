package ar.com.unpaz.cliente.principal;

import java.util.List;

import ar.com.unpaz.cliente.repositoryImp.LecturaRepositoryImp;
import ar.com.unpaz.cliente.serviceImp.LecturaServiceImp;
import ar.com.unpaz.cliente.serviceImp.buscarServiceImp;

public class Inicio {

	public static void main(String[] args) {

		LecturaRepositoryImp guardarDatos = new LecturaRepositoryImp();

		LecturaServiceImp lectura = new LecturaServiceImp();	
		buscarServiceImp buscar = new buscarServiceImp();
		
		List datos = guardarDatos.leer("C:\\Users\\Aula Multimedia\\Downloads\\cabecera.txt");
		
		buscar.buscarCliente(datos);
		
		//lectura.leer(datos);

	}

}
