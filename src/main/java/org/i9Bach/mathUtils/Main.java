package org.i9Bach.mathUtils;

public class Main {

	public static void main(String[] args) {
		//Mathutils test = new Mathutils();
		MOD test1 = new MOD();
		NAME test2 = new NAME();
		DIV test3 = new DIV();
		SUB test4 = new SUB();
		System.out.println( test1.Mod(18, 2));
		System.out.println(test2.Name("Ejangue Guillaume"));
		System.out.println( test3.Div(125, 5));
		System.out.println(test4.Sub(12, 3));

		System.out.println("Alle Teste waren Erfolgreich !");		

	}

}
