package com.distribuida;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//import paquetesoap.*;

public class Jugador {
	private java.util.Date fecha_ojeo;
	private String nombre;
	private String club;
	private float costo;
	private String posicion;
	private String comentarios;
	
	
	
	public Jugador() {
		super();
		
		this.fecha_ojeo = new java.util.Date();
		this.ojeos = new ArrayList<Ojeo>();
		
	}

	private class Ojeo {
		private String comentario;
		private java.util.Date fecha_ojeo;
		public Ojeo(String comentario, Date fecha_ojeo) {
			super();
			this.comentario = comentario;
			this.fecha_ojeo = fecha_ojeo;
		}
	}
	
	private List<Ojeo> ojeos;
	
	
	public int cantidadOjeos(){
		return this.ojeos.size();
	}
	
	public void ojear(String comentario){
		Ojeo ojo = new Ojeo(comentario, new java.util.Date());

		this.ojeos.add(ojo);
	}

	
	public boolean estaOjeado(){
		return !this.ojeos.isEmpty();
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jugador other = (Jugador) obj;
		if (club == null) {
			if (other.club != null)
				return false;
		} else if (!club.equals(other.club))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (posicion == null) {
			if (other.posicion != null)
				return false;
		} else if (!posicion.equals(other.posicion))
			return false;
		return true;
	}

	public Jugador(String nombre, String club, float costo, String posicion,
			String comentarios) {
		//super();
		this();
		
		//this.fecha_ojeo = new java.util.Date();
		this.nombre = nombre;
		this.club = club;
		this.costo = costo;
		this.posicion = posicion;
		this.comentarios = comentarios;

	}
	
	
}
