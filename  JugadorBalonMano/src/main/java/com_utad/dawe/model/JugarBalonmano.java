package com_utad.dawe.model;

public class JugarBalonmano {

		private String Nombre;
		private int Dorsal;
		private int anotacion;
		private int bloqueo;
		private int TiempoJugado;
		private int estadistica;
		
		
		 public JugarBalonmano(String nombre, int dorsal) {
			
			Nombre = nombre;
			Dorsal = dorsal;
		}


		public void setAnotacion(int anotacion) {
			this.anotacion = anotacion;
		}


		public void setBloqueo(int bloqueo) {
			this.bloqueo = bloqueo;
		}


		public void setTiempoJugado(int tiempoJugado) {
			TiempoJugado = tiempoJugado;
		}


		@Override
		public String toString() {
			return "JugarBalonmano [Nombre=" + Nombre + ", Dorsal=" + Dorsal + ", anotacion=" + anotacion + ", bloqueo="
					+ bloqueo + ", TiempoJugado=" + TiempoJugado + "]";
		}


		public int getEstadistica(int anotacion) {
			
		int sumatorio =0;
		
		
			
			return estadistica;
		}


		
		
		
		 
		 
		
		
		

	

}
