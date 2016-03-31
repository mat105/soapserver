package com.distribuida;
//import java.util.ArrayList;

//import paquetesoap.InterfazJugador;

import javax.jws.WebMethod;

import javax.jws.WebService;

@WebService(endpointInterface = "com.distribuida.InterfazJugador")
public class ImplementacionJugador implements InterfazJugador {
	private java.util.ArrayList<Jugador> lista = new java.util.ArrayList<Jugador>();
	
	//@Override
	public void agregarJugador(Jugador juga) {
		// TODO Auto-generated method stub
		lista.add( juga );
	}

	//@Override
	public void agregarOjeo(Jugador juga, String comentario) {
		// TODO Auto-generated method stub
		int id = lista.indexOf(juga);
		
		if(id >= 0)
			lista.get(id).ojear(comentario);
	}

	//@Override
	public void eliminarJugador(Jugador juga) {
		// TODO Auto-generated method stub
		lista.remove(juga);
	}

	//@Override
	public Object[] listarJugadores() {
		// TODO Auto-generated method stub
		return lista.toArray();
	}
	
	public Object[] listarJugadoresOjeados() {
		java.util.ArrayList<Jugador> jugas = new java.util.ArrayList<Jugador>();
		
		for(Jugador cosa : lista){
			if(cosa.estaOjeado()){
				jugas.add(cosa);
			}
		}
		
		return jugas.toArray();
	}

	public ImplementacionJugador() {
		super();
	}
	
	

}
