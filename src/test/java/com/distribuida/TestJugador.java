package com.distribuida;

import static org.junit.Assert.*;
import org.junit.Test;


public class TestJugador {

	@Test
	public void testOjear() {
		Jugador j = new Jugador();
		j.ojear("hola");
		assertEquals( j.cantidadOjeos(), 1 );
	}

	@Test
	public void testEstaOjeado() {
		Jugador j = new Jugador();
		assertFalse(j.estaOjeado());
		j.ojear("hola");
		assertTrue(j.estaOjeado());
	}

}
