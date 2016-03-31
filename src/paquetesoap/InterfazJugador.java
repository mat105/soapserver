package paquetesoap;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
//import paquetesoap.*;

@WebService
@SOAPBinding(style=Style.RPC)
public interface InterfazJugador {
	@WebMethod void agregarJugador(Jugador juga);
	
	@WebMethod void agregarOjeo(Jugador juga, String comentario);
	
	@WebMethod void eliminarJugador(Jugador juga);
	
	@WebMethod Jugador[] listarJugadores();
	
	@WebMethod Jugador[] listarJugadoresOjeados();
}
