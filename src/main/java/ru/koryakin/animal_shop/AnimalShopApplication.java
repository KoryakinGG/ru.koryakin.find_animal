package ru.koryakin.animal_shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication (scanBasePackages={"ru.koryakin.animal_shop"})
public class AnimalShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnimalShopApplication.class, args);
	}

}