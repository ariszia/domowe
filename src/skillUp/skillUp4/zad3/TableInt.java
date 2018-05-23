package skillUp.skillUp4.zad3;

//Zaimplementuj metod� getMinValue, getMaxValue przyjmuj�c� w argumencie tablic� int��w
//oraz zwracaj�ca najmniejsz�/najwi�ksz� warto�� z tablicy. Wykorzystaj konstrukcj� for oraz foreach

public class TableInt {

	public static void main(String[] args) {

		int[] tableInt = { -50, 10, 20, 25, 30, 45 };

		TableInt tabelka = new TableInt();

		tabelka.getMinValue(tableInt);
		tabelka.getMaxValue(tableInt);
	}

	public void getMinValue(int[] tablicaInt) {

		int min = tablicaInt[0];

		for (int i = 0; i < tablicaInt.length; i++) {
			if (tablicaInt[i] < min)
				min = tablicaInt[i];
		}
		System.out.println(min);
	}

	public void getMaxValue(int[] tablicaInt) {
		int max = tablicaInt[0];

		for (int i = 0; i < tablicaInt.length; i++) {
			if (tablicaInt[i] > max)
				max = tablicaInt[i];
		}
		System.out.println(max);
	}

}
