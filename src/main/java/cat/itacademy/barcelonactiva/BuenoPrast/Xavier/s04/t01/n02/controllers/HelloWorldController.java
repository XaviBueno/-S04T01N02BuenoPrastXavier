package cat.itacademy.barcelonactiva.BuenoPrast.Xavier.s04.t01.n02.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloWorldController {
	@GetMapping("/HelloWorld")
	public String saluda(@RequestParam(defaultValue="UNKNOWN") String nom) {
		return "Hola, " + nom + ". Estàs executant un projecte Gradle";
	}
	@GetMapping(value={"/HelloWorld2","/HelloWorld2/{nom}"})
	public String saluda2(@PathVariable (required=false) String nom) {
		String elMeuNom="UNKNOWN";
		
		if(nom!=null) {
			elMeuNom=nom;
			
		}
		return "Hola, " + elMeuNom + ". Estàs executant un projecte Gradle";
	}
	
	

}
