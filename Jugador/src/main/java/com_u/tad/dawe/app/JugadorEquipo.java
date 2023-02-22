package com_u.tad.dawe.app;

import java.util.ArrayList;
import java.util.Scanner;

import com_utad.dawe.model.JugarBalonmano;

public class JugadorEquipo {
	
	public static void main (String[] args) {
		
		
		ArrayList <JugarBalonmano>  Jugadores = new ArrayList <JugarBalonmano>();
		
		for (int i = 1; i < 3; i++) {
			Scanner sc = new Scanner  (System.in);
			System.out.println("Como se llama el jugador " + i + "?");
			//sc.nextLine();
			String nombre = sc.nextLine();
		
			Scanner sc2 = new Scanner  (System.in);
			System.out.println("Cual es la dorsal del jugador " + i + "?");
			int dorsal = sc2.nextInt();
			
			int anotacion = (int)(Math.random()*20);
			System.out.println("Anotaciones = " + anotacion);

			int bloqueo = (int)(Math.random()*30);
			System.out.println("Bloqueos = " + bloqueo);
			
			int TiempoJugado = (int) System.currentTimeMillis();
			System.out.println("Tiempo jugado = " + TiempoJugado + " Segs");
			
			JugarBalonmano datos = new JugarBalonmano (nombre , dorsal);
			datos.setAnotacion(anotacion);
			datos.setBloqueo(bloqueo);
			datos.setTiempoJugado(TiempoJugado);
			Jugadores.add(datos);
			System.out.println(datos.toString());
		}
		
		
		
		
	}

}
