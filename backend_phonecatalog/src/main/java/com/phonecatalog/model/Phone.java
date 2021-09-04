package com.phonecatalog.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;


@Entity
@Table(name = "Phone")
@DynamicUpdate
public class Phone {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id = null;
	
	private String name;
	private String manufacturer;
	private String description;
	private String color;
	private float price;
	private String screen;
	private String processor;
	private int ram;
	
	public Phone() {}
	
	public Phone(String name, String manufacturer, String description, String color, float price,
			String screen, String processor, int ram) {
		super();
		this.name = name;
		this.manufacturer = manufacturer;
		this.description = description;
		this.color = color;
		this.price = price;
		this.screen = screen;
		this.processor = processor;
		this.ram = ram;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getScreen() {
		return screen;
	}
	public void setScreen(String screen) {
		this.screen = screen;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}

	@Override
	public String toString() {
		return "Phone [id=" + id + ", name=" + name + ", manufacturer=" + manufacturer + ", description=" + description
				+ ", color=" + color + ", price=" + price + ", screen=" + screen + ", processor=" + processor + ", ram="
				+ ram + "]";
	}
}