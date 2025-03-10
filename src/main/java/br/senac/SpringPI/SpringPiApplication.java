package br.senac.SpringPI;


import br.senac.SpringPI.entities.Aluno;
import br.senac.SpringPI.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Arrays;

@SpringBootApplication
public class SpringPiApplication implements CommandLineRunner {
@Autowired
private AlunoRepository alunoRepository;
	public static void main(String[] args) {
		SpringApplication.run(SpringPiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
				Aluno aluno1 = new Aluno("Victor Sarti",
						LocalDateTime.parse("01/02/2022 08:57", formato));
		alunoRepository.saveAll(Arrays.asList(aluno1));
	}

}

