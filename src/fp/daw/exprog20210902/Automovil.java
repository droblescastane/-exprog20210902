package fp.daw.exprog20210902;

public class Automovil implements Comparable<Automovil>{

	String marca;
	String modelo;
	String matricula;
	int anoFab;
	String tipoMotor;
	int potencia;
	
	
	public Automovil (String marca, String modelo, String matricula, int anoFab, String tipoMotor, int potencia) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
		this.anoFab = anoFab;
		this.tipoMotor = tipoMotor;
		this.potencia = potencia;
		
	}
	
	//
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public void setanoFab(int anoFab) {
		this.anoFab = anoFab;
	}
	
	public void settipoMotor(String tipoMotor) {
		this.tipoMotor = tipoMotor;
	}
	
	public void setpotencia(int potencia) {
		this.potencia = potencia;
	}
	
	//
	
	public String getMarca() {
		return marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public int getanoFab() {
		return anoFab;
	}
	
	public String gettipoMotor() {
		return tipoMotor;
	}
	
	public int getpotencia() {
		return potencia;
	}
	
	///
	
	public int compareTo(Automovil a) {
		
		return marca.compareTo(a.marca);
	}
	
	public String toString() {
		
		return "Marca: " + marca + ". Modelo: " + modelo + ". Matricula: " + matricula + ". Anyo de fabricacion: " +
		 anoFab + ". Tipo de motor:" + tipoMotor + ". Potencia: " + potencia + "\n";
	}
	///
	
	
}
