package controllers;

import java.util.Scanner;
import java.util.UUID;

import entities.Pessoa;
import repositories.PessoaRepository;

public class PessoaController {

	public void cadastrarPessoa() {

		Scanner scanner = new Scanner(System.in);

		try {
			System.out.println("\n Cadastro de Pessoa \n");

			Pessoa pessoa = new Pessoa();
			pessoa.setId(UUID.randomUUID());

			System.out.println("\n Nome da Pessoa \n");
			pessoa.setNome(scanner.nextLine());

			System.out.println("\n CPF da Pessoa\n");
			pessoa.setCpf(scanner.nextLine());

			PessoaRepository pessoaRepository = new PessoaRepository();
			pessoaRepository.creat(pessoa);

			System.out.println("\n Pessoa cadastrada com sucesso!");

		}

		catch (Exception e) {

			System.out.println("\n Falha ao cadastrar" + e.getMessage());

		}

		finally {
			scanner.close();

		}
	}

}
