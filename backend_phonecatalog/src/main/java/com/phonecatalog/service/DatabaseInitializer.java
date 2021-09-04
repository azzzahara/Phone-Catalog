package com.phonecatalog.service;

import java.io.IOException;
import java.net.URISyntaxException;
import com.phonecatalog.model.Phone;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DatabaseInitializer {
	
	@Autowired
	private PhoneService phoneService;
	
	@PostConstruct
	public void init() throws IOException, URISyntaxException {
		
		//Sample Phones
		
		Phone phone1 = new Phone("iPhone 7", "Apple", "Smartphone de 5,5 pulgadas. Pantalla LCD IPS Full HD, chip A10 Fusion de 4 núcleos, doble cámara trasera de 12 MP y cámara frontal de 7 MP.", "Black", 798,
				"4,7 inch IPS", "A10 Fusion", 2);
		
		Phone phone2 = new Phone("iPhone 8", "Apple", "El procesador de la cámara trasera de 12 MP tiene una inteligencia incluso mayor que en modelos anteriores, lo cual facilita hacer fotos a un objetivo en movimiento.", "Golden", 988,
				"4,7 inch IPS", "A11 Bionic", 4);
		
		Phone phone3 = new Phone("Samsung s10", "Samsung", "Samsung Galaxy S10: de vuelta al ruedo con tres cámaras y lector de huellas bajo la pantalla", "Green", 566,
				"6,1 inch IPS", "Exynos 9820", 8);
		
		Phone phone4 = new Phone("Redmi Note 7", "Xiaomi", "El candidato a superventas más sólido de 2019 también brilla por su diseño", "Blue", 221,
				"6,3 inch IPS", "Snapdragon 660", 4);
		
		Phone phone5 = new Phone("Huawei p30", "Huawei", "Parece mentira todo lo que ofrece un terminal tan manejable", "Twilight", 268,
				"6,1 inch IPS", "Kirin 980", 6);
		
		phoneService.save(phone1);
		phoneService.save(phone2);
		phoneService.save(phone3);
		phoneService.save(phone4);
		phoneService.save(phone5);
	}
}