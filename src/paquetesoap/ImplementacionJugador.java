package paquetesoap;
import java.util.ArrayList;
import java.util.List;

//import paquetesoap.InterfazJugador;

import javax.jws.WebMethod;

import javax.jws.WebService;

@WebService(endpointInterface = "paquetesoap.InterfazJugador")
public class ImplementacionJugador implements InterfazJugador {
	private java.util.ArrayList<Jugador> lista = new java.util.ArrayList<Jugador>();
	
	@Override
	public void agregarJugador(Jugador juga) {
		// TODO Auto-generated method stub
		lista.add( juga );
	}

	@Override
	public void agregarOjeo(Jugador juga, String comentario) {
		// TODO Auto-generated method stub
		juga.ojear(comentario);
	}

	@Override
	public void eliminarJugador(Jugador juga) {
		// TODO Auto-generated method stub
		lista.remove(juga);
	}

	@Override
	public ArrayList<Jugador> listarJugadores() {
		// TODO Auto-generated method stub
		return lista;
	}

	public ImplementacionJugador() {
		super();
	}
	
	

}
