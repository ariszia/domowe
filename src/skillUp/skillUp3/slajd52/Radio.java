package skillUp.skillUp3.slajd52;

//Stw�rz klas� Radio. Radio przechowuje cz�stotliwo��, kt�ra  jest liczb� z zakresu 88.0 do 108.5 

//frequencyUp zwi�ksza aktualn� czestotliwo�c o 0.1 frequencyDown zmieniejsza aktualn� czestotliwo�c o 0.1 
//Stw�rz metody 
//getFrequency
//setFrequency
//frequencyUp
//frequencyDown showStatus wypisuje� aktualna czestotliwos� to�

public class Radio {

	public final float minFreq = 88.0f;
	public final float maxFreq = 108.5f;

	float frequency;

	public static void main(String[] args) {

	}

	public float getFrequency() {
		return frequency;
	}

	public void setFrequency(float frequency) {
		if (frequency >= minFreq && frequency <= maxFreq)
			this.frequency = frequency;
		else
			System.out.println("Frequency is out of range");
	}

	public void frequencyUp() {
		if (frequency <= (maxFreq - 0.1f))
			frequency = frequency + 0.1f;
		else
			System.out.println("Frequency is out of range");
	}

	public void frequencyDown() {
		if (frequency >= (minFreq + 0.1f))
			frequency = frequency - 0.1f;
		else
			System.out.println("Frequency is out of range");
	}

	public void showStatus() {
		System.out.println(frequency);
	}
}
