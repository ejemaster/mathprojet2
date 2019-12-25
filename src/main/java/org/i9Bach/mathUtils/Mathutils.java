package org.i9Bach.mathUtils;

import javax.swing.plaf.multi.MultiButtonUI;

public class Mathutils {


	public  int Sum(int x, int y ) {

		return x + y;
	}

	public  int Mul(int x, int y ) {

		return x * y;
	}
	public  int Div(int x, int y ) {

		return x / y;
	}
	public  int Mod(int x, int y ) {

		return x % y;
	}
	public  int Sub(int x, int y ) {

		return x - y;
	}
	public String Name(String name) {
		return name;
	}
	public int Alt(int alt) {
		return alt;
	}

	public boolean farbe() {
		return false;
	}

	public static void main(String[]args) {

		Mathutils test = new Mathutils();
		System.out.println( test.Mod(18, 2));
		System.out.println(test.Name("Ejangue Guillaume"));
		System.out.println( test.Div(125, 5));
		System.out.println(test.Sub(12, 3));

		System.out.println("Alle Teste waren Erfolgreich");		

	}


}
