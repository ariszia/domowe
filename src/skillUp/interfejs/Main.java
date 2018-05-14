package skillUp.interfejs;

import java.util.ArrayList;
import java.util.List;

import skillUp.enums.RodzajTrojkata;
import skillUp.enums.TypFigury;
import skillUp.exception.TrojkatException;

public class Main {
	
	private static ArrayList<Figura>	listaFigurPole	= new ArrayList<Figura>();
	private static ArrayList<Figura>	listaFigurObwod	= new ArrayList<Figura>();
	private static ArrayList<Trojkat>	listaTrojkatow	= new ArrayList<Trojkat>();
	
	public static void main(String[] args) {
		System.out.println("Ile boków ma trójkat");
		utworzNowaFigure(TypFigury.TROJKAT);
		
		System.out.println("Ile boków ma prostokat");
		;
		utworzNowaFigure(TypFigury.PROSTOKAT);
		
		Prostokat p = new Prostokat(5, 5);
		listaFigurPole.add(p);
		Prostokat p1 = new Prostokat(2, 2);
		listaFigurPole.add(p1);
		Trojkat t = new Trojkat(2, 5);
		listaFigurPole.add(t);
		
		System.out.println("Oblicz sume pol figur");
		System.out.println(obliczSumePol(listaFigurPole));
		
		System.out.println("Znajdz pierwsze pole wieksze niz");
		znajdzPierwszePoleWiekszeOdMax2(listaFigurPole, 24);
		
		Trojkat t1, tt, tt1, tt2, tt3;
		try {
			t1 = new Trojkat(3, 4, 5);
			listaFigurObwod.add(t1);
			tt = new Trojkat(3, 4, 5);
			listaTrojkatow.add(tt);
			System.out.println(tt.najdluzszyBok());
			tt1 = new Trojkat(3, 4, 5);
			listaTrojkatow.add(tt1);
			tt2 = new Trojkat(3, 4, 5);
			listaTrojkatow.add(tt2);
			tt3 = new Trojkat(3, 4, 5);
			listaTrojkatow.add(tt3);
			
		} catch (TrojkatException e) {
			System.out.println("Czy mozna stworzyc trojkat?");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		Prostokat p3 = new Prostokat(5, 5);
		listaFigurObwod.add(p3);
		Prostokat p4 = new Prostokat(5, 5);
		listaFigurObwod.add(p4);
		
		System.out.println("Suma Obwodow");
		System.out.println(obliczSumeObwodow(listaFigurObwod));
		
		System.out.println("najdluzszyBokTrojkatow");
		
		System.out.println(znajdzNajdluzszyBokWTrojkatach(listaTrojkatow));
		System.out.println(RodzajTrojkata.PROSTOKATNY.getPriorytet());
	}
	
	public void createNewTrojkat(int a, int b, int c) throws TrojkatException {
		
		Trojkat trojkat = new Trojkat(a, b, c);
		listaTrojkatow.add(trojkat);
	}
	
	// kolekcja pol jako argument
	private static float obliczSumePol(List<Figura> lista) {
		float sumaPol = 0;
		for (Figura f : lista) {
			sumaPol += f.pole();
		}
		return sumaPol;
		
	}
	
	private static float obliczSumeObwodow(List<Figura> lista) {
		float sumaObwodow = 0;
		for (Figura f : lista) {
			sumaObwodow += f.obwod();
		}
		return sumaObwodow;
		
	}
	
	private static Figura utworzNowaFigure(TypFigury typ) {
		Figura f = null;
		switch (typ) {
			case TROJKAT:
				f = new Trojkat();
				typ.getIleBokow();
				System.out.println(typ.getIleBokow());
				break;
			
			case PROSTOKAT:
				f = new Prostokat();
				typ.getIleBokow();
				System.out.println(typ.getIleBokow());
				break;
			
			default:
				System.out.println("Nie ma takiej figury");
		}
		
		return f;
	}
	
	private static Figura znajdzPierwszePoleWiekszeOdMax(List<Figura> lista, float max) {
		int i = 0;
		Figura f = lista.get(i);
		
		while (f.pole() <= max && i < lista.size() - 1) {
			i++;
			f = lista.get(i);
		}
		return f;
	}
	
	private static Figura znajdzPierwszePoleWiekszeOdMax2(List<Figura> lista, float max) {
		int i = 0;
		Figura f;
		
		do {
			if (i >= lista.size()) {
				return null;
			}
			f = lista.get(i);
			i++;
		} while (f.pole() <= max);
		System.out.println("Znaleziono pole : " + f.pole());
		
		return f;
	}
	
	private static float znajdzNajdluzszyBokWTrojkatach(List<Trojkat> trojkaty) {
		int i = 0;
		float najdluzszyBok = 0;
		while (i < trojkaty.size() - 1) {
			Trojkat tt = trojkaty.get(i);
			float najdluzszyBokT1 = tt.najdluzszyBok();
			Trojkat t2 = trojkaty.get(i + 1);
			float najdluzszyBokT2 = t2.najdluzszyBok();
			najdluzszyBok = najdluzszyBokT1 > najdluzszyBokT2 ? najdluzszyBokT1 : najdluzszyBokT2;
			i++;
		}
		
		return najdluzszyBok;
	}
}
