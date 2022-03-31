package com.bramli;

import com.bramli.entity.Produit;
import com.bramli.repository.ProduitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDhpsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDhpsApplication.class, args);
	}
    @Bean
	CommandLineRunner start(ProduitRepository repo){
		return args -> {
			repo.save(new Produit(null,"HP",6000,3));
			repo.save(new Produit(null,"DELL",3000,4));
			repo.save(new Produit(null,"ThinkPad",2000,3));
			repo.findAll().forEach(produit -> System.out.println(produit.toString()));
		};
}
}

