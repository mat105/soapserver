package com.distribuida;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestImplementacionJugador {
	ImplementacionJugador ijuga = new ImplementacionJugador();
	Jugador juga = new Jugador();
	
	@Before
	public void setUp() throws Exception {
		juga.setNombre("Pepe");
		juga.setClub("real");
		juga.setCosto(500.f);
		juga.setPosicion("defensor");
	}
	
	@Test
	public void testAgregarJugador() {
		ijuga.agregarJugador(juga);
	}

	@Test
	public void testAgregarOjeo() {
		ijuga.agregarOjeo(juga, "Buen juegador");
		assertTrue(juga.estaOjeado());
	}

	@Test
	public void testEliminarJugador() {
		int len = ijuga.listarJugadores().length;
		juga.setNombre("Pique");
		ijuga.agregarJugador(juga);
		assertEquals( ijuga.listarJugadores().length, len+1 );
		ijuga.eliminarJugador(juga);
		assertEquals( ijuga.listarJugadores().length, len );
	}

	@Test
	public void testListarJugadores() {
		assertNotNull(ijuga.listarJugadores());
	}

	@Test
	public void testListarJugadoresOjeados() {
		assertNotNull(ijuga.listarJugadoresOjeados());
	}

}
