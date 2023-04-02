package ar.com.unpaz.cliente.serviceImp;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import ar.com.unpaz.cliente.model.cliente;
import ar.com.unpaz.cliente.service.buscarService;

public class buscarServiceImp implements buscarService {
	
	@Override
	public void buscarCliente(List<cliente> c) {
	    Scanner input = new Scanner(System.in);
	    String nom;
	    
	    do {
	        System.out.println("Ingrese un nombre: ");
	        nom = input.nextLine();
	    } while(nom.length() < 4);

	    Pattern pattern = Pattern.compile(nom, Pattern.CASE_INSENSITIVE);

	    c.forEach(cliente -> {
	        Matcher matcher = pattern.matcher(cliente.getNombreApellido());
	        
	        if(matcher.find()) {
	            System.out.println(cliente.toString());
	            System.out.println(System.getProperty("user.dir"));
	        }
	    });

	}
}
