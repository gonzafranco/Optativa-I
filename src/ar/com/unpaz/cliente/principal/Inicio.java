package ar.com.unpaz.cliente.principal;

import java.util.List;
import java.util.Scanner;

import ar.com.unpaz.cliente.repositoryImp.LecturaRepositoryImp;
import ar.com.unpaz.cliente.serviceImp.LecturaServiceImp;
import ar.com.unpaz.cliente.serviceImp.buscarServiceImp;

public class Inicio {

	public static void main(String[] args) {

		LecturaRepositoryImp guardarDatos = new LecturaRepositoryImp();

		LecturaServiceImp lectura = new LecturaServiceImp();	
		buscarServiceImp buscar = new buscarServiceImp();
		List datos = guardarDatos.leer("C:\\Users\\Vanilla\\Downloads\\cabecera.txt");
		int op = 0;
		Scanner input = new Scanner(System.in);
		
		do {
			
			System.out.println("--------------");
			System.out.println("Menu Principal");
			System.out.println("--------------");
			System.out.println("1 - Buscar cliente");
			System.out.println("2 - Cliente");
			System.out.println("0 - Salir");
			op = input.nextInt();
			
			switch(op) {
			 case 1:
				 	buscar.buscarCliente(datos);
	                break;
			 case 2:
				 	System.out.println("Ventas realizadas: " + datos.size());
	                break;
			}
			
		}while (op != 0);
		
		//lectura.leer(datos);

	}

}
