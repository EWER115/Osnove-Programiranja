/*
Avtor: Luka Pu�i�, <luka@pusic.si>
FRI, 2012
*/

import java.io.*;
import java.util.Scanner;

public class Zaporedja{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		int a, b, k;
		System.out.print("Vnesi za�etno �tevilo: ");
		a = in.nextInt();
		System.out.print("Vnesi kon�no mejo: ");
		b = in.nextInt();
		System.out.print("Vnesi korak K: ");
		k = in.nextInt();
		
		//preveri pristnost uporabnikovega vnosa ;)
		if(k == 0){System.out.println("K ne sme biti 0, pobalin!");}
		if(a<b && k<0){System.out.println("K bi v tem primeru moral biti pozitiven... noob...");}
		if(a>b && k>0){System.out.println("K bi v tem primeru moral biti negativen... noob...");}

		for(int i = a; i <= b; i+=k){
			System.out.println(i);
		}
	}
}
