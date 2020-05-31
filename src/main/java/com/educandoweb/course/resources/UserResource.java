package com.educandoweb.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;

@RestController
@RequestMapping(value = "/users")//nome do recurso
public class UserResource {
	
	@GetMapping //indica que o metodo responde a requisicao do tipo GET
	public ResponseEntity<User> findAll(){
		User u = new User(1,"Maria","maria@gmai.com","99998888","12345");
		return ResponseEntity.ok().body(u); //.ok resposta com sucesso e .body corpo da resposta
		
	}
}
