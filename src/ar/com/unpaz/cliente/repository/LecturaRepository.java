package ar.com.unpaz.cliente.repository;

import java.util.List;

import ar.com.unpaz.cliente.model.cliente;


public interface LecturaRepository {
	
	List<cliente> leer(String s);

}
