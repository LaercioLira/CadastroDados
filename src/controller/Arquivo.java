package controller;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;

import model.Usuario;

public class Arquivo {
	
	public Arquivo() {
		
	}
	
	public void salvar(Usuario usuario) throws IOException {
		OutputStream os = new FileOutputStream("cadastros.txt", true);
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		
		//texto
		String texto = (usuario.getNome()+","+usuario.getIdade()+","+usuario.getSexo()+".");
		bw.append(texto);
		bw.newLine();
		
		bw.close();
		osw.close();
		os.close();
		
		System.out.println("O usuário "+usuario.getNome()+" foi cadastrado com sucesso!");
	}
	
	public void lerDadosdoArquivo() throws IOException {
		InputStream is = new FileInputStream("Cadastros.txt");
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		String linha = br.readLine();
		while(linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
		
		br.close();
		isr.close();
		is.close();
		
		System.out.println("A leitura do arquivo foi concluida com sucesso!");
	}

}
