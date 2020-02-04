package controllers;

import java.util.List;

import models.Cliente;
import play.mvc.Controller;

public class Clientes extends Controller {
	
	//https://localhost:9000/clientes/form
	public static void form () {
		render();
	}
	
	public static void salvar(Cliente clnt) {
		
		clnt.save();
		form();
	}
	
	public static void listar() {
		List<Cliente> lista = Cliente.findAll();
		render(lista);
	}
	
	public static void editar(long id) {
		Cliente clnt = Cliente.findById(id);
		renderTemplate("Clientes/form.html", clnt);
	}
	
	public static void deletar(long id) {
		Cliente clnt = Cliente.findById(id);
		clnt.delete();
		
		listar();
	}

}
