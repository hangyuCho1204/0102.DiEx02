package spring.ex02.hw02;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;


public class House {
	private int price = 1000;
	private String address = "¿ï»ê";
	@Autowired
	private Collection<Furniture> furniture;
	@Autowired
	private Collection<HomeAppliances> HomeAppliances;
	
	House(){};
	
	House(String address){};
	
	void buy(){
		
	}
	void sell(){
		
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Collection<Furniture> getFurniture() {
		return furniture;
	}

	public void setFurniture(Collection<Furniture> furniture) {
		this.furniture = furniture;
	}

	public Collection<HomeAppliances> getHomeAppliances() {
		return HomeAppliances;
	}

	public void setHomeAppliances(Collection<HomeAppliances> homeAppliances) {
		HomeAppliances = homeAppliances;
	}
}
