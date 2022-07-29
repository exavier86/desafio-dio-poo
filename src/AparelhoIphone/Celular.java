package AparelhoIphone;

import Funcoes.AparelhoTelefonico.AparelhoTelefonico;
import Funcoes.AparelhoTelefonico.Ligar;
import Funcoes.NavegadorNaInternet.NavegadorNaInternet;
import Funcoes.ReprodutorMusical.ReprodutorMusical;
import Funcoes.ReprodutorMusical.TocarMusica;
import MultiFuncional.EquipamentoMultiFuncional;

public class Celular {

	public static void main(String[] args) {
		
		NavegadorNaInternet nav = new EquipamentoMultiFuncional();
		nav.navegando();

		ReprodutorMusical rm = new TocarMusica();
		rm.musicas();
		
		AparelhoTelefonico at = new Ligar();
		at.ligacao();
	}
}
