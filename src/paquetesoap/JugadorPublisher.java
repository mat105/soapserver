package paquetesoap;
import javax.xml.ws.Endpoint;
import paquetesoap.*;
public class JugadorPublisher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Endpoint.publish("http://localhost:9999/ws/hello", new ImplementacionJugador() );
	}

}
