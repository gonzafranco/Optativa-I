package ar.com.unpaz.cliente.repositoryImp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import ar.com.unpaz.cliente.model.cliente;
import ar.com.unpaz.cliente.repository.LecturaRepository;

public class LecturaRepositoryImp implements LecturaRepository {

	@Override
	public List<cliente> leer(String s) {
		
		List<cliente> lista = new ArrayList<cliente>();
		
		File archivoCsvVial = new File(s);
		FileReader sReader;
		try {
			
			sReader = new FileReader(archivoCsvVial);
			BufferedReader sBuffer = new BufferedReader(sReader);
			String linea = "";
			try {
				while((linea = sBuffer.readLine()) != null) {
					
					//System.out.println(linea);
					String[] separar = linea.split(";"); 
					
					String id = separar[0];
		            String nombreApellido = separar[1];
		            String tipoConsumidor =  separar[2];
		            String fecha = separar[3];
		            
		            lista.add(new cliente(id,nombreApellido,tipoConsumidor,fecha));
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
				
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}	
		return lista;		
		
		
	}

}
