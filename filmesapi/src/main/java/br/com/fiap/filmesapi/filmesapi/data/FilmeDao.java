package br.com.fiap.filmesapi.filmesapi.data;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.filmesapi.filmesapi.model.Filme;

public class FilmeDao {
	

		List<Filme> lista = new ArrayList<>();
		
		public FilmeDao() {
			lista.addAll(List.of(
					new Filme(1, "Grease", "No verão de 1959, Sandy e Danny se apaixonam na Califórnia, "
							+ "mas quando voltam para a escola, suas diferentes "
							+ "identidades sociais criam desafios em seu relacionamento. "
							+ "Eles devem mudar para ficar juntos.", " Sandy e Danny", true, 10),
					
					new Filme(2, "Até o Último Homem", "Desmond T. Doss, um médico do exército americano que, "
							+ "durante a Segunda Guerra Mundial, se recusa a pegar em armas. Durante a Batalha"
							+ " de Okinawa ele trabalha na ala médica e salva cerca de 75 homens.", 
							" Desmond T. Doss", true, 10),
					
					new Filme(3, "Oppenheimer", "O físico J. Robert Oppenheimer trabalha com uma equipe"
							+ " de cientistas durante o Projeto Manhattan, levando ao desenvolvimento da bomba atômica.",
							"J. Robert Oppenheimer", false, 10),
					
					new Filme(4, "A Família Mitchell e a Revolta das Máquinas", "Uma família embarca em uma viagem para a "
							+ "faculdade da filha quando os dispositivos eletrônicos se rebelam, desencadeando um "
							+ "apocalipse robô. Agora, os Mitchells devem se unir para salvar a humanidade",
							"Katie Mitchell, Rick Mitchell, Linda Mitchell, Aaron Mitchell, PAL", true, 10)
					));
		}
		
		public List<Filme> findAll(){
			return lista;
		}
	}


