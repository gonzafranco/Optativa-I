package ar.com.unpaz.cliente.serviceImp;

import java.util.List;
import java.util.Scanner;

import ar.com.unpaz.cliente.model.cliente;
import ar.com.unpaz.cliente.service.buscarService;

public class buscarServiceImp implements buscarService {
	
	@Override
	public void buscarCliente(List<cliente> c) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String nom;
		
	
			System.out.println("Ingrese un nombre: ");
			 nom = input.nextLine();
			
		
		
		c.forEach(cliente -> {
				
				if(nom.equals(cliente.getNombreApellido())) {
					System.out.println(cliente.toString());
					
					System.out.println(System.getProperty("user.dir"));

				}
			}	
		);
	}

}
