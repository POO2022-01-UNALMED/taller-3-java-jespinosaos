package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	public boolean estado;
	private int volumen = 1;
	private Control control;
	public static int numTV;

	public TV() {

	}

	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;

		conteoTV();

	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getVolumen() {
		return volumen;
	}

	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}

	public Control getControl() {
		return control;
	}

	public void setControl(Control control) {
		this.control = control;
	}

	public static int getNumTV() {
		return numTV;
	}

	public static void setNumTV(int numtv) {
		TV.numTV = numtv;

	}

	public static void conteoTV() {
		TV.numTV++;
	}

	public void turnOn() {
		this.estado = true;
	}

	public void turnOff() {
		this.estado = false;
	}

	public boolean getEstado() {
		return estado;
	}

	public void canalUp() {
		if (this.estado == true && this.canal <= 119) {
			this.canal++;
		}
	}

	public void canalDown() {
		if (this.estado == true && this.canal >= 2) {
			this.canal--;
		}
	}

	public void volumenUp() {
		if (this.estado == true && this.volumen <= 7) {
			this.volumen++;
		}
	}

	public void volumenDown() {
		if (this.estado == true && this.volumen >= 1) {
			this.volumen--;

		}
	}
}
