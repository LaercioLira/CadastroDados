import java.io.IOException;

import controller.Arquivo;
import model.Usuario;

public class Main {

	public static void main(String[] args) throws IOException {
		//usuario (nome, idade, sexo)
		Usuario obj1 = new Usuario("Laercio", 42, 'M');
		Usuario obj2 = new Usuario("Erica", 39, 'F');
		Usuario obj3 = new Usuario("Giovanna", 6, 'F');		
		Usuario obj4 = new Usuario("Rebeca", 13,'F');
		Usuario obj5 = new Usuario("Benjamim", 1,'M');
		
		Arquivo arquivo = new Arquivo();
		arquivo.salvar(obj1);
		arquivo.salvar(obj2);
		arquivo.salvar(obj3);
		arquivo.salvar(obj4);
		arquivo.salvar(obj5);
		
		System.out.println("-------------------");
		
		arquivo.lerDadosdoArquivo();
		
	}

}
