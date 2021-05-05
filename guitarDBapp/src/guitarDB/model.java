package guitarDB;

import java.util.List;

public class model {

	private int serial_id;
	private int guitar_id;
	private String brand;
	private List<color> colors;
	
	public model(int serial_id, String brand, List<color> colors) {
		this.setSerial_id(serial_id);
		this.setGuitar_id(guitar_id);
		this.setBrand(brand);
		
		
	}




	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getGuitar_id() {
		return guitar_id;
	}

	public void setGuitar_id(int guitar_id) {
		this.guitar_id = guitar_id;
	}

	public int getSerial_id() {
		return serial_id;
	}

	public void setSerial_id(int serial_id) {
		this.serial_id = serial_id;
	}




	public List<color> getColors() {
		return colors;
	}




	public void setColors(List<color> colors) {
		this.colors = colors;
	}




	}

	
		
	


	

	
	

	
	

	
	

	

