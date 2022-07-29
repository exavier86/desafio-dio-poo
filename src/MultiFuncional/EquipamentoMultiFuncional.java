package MultiFuncional;

import Funcoes.AparelhoTelefonico.AparelhoTelefonico;
import Funcoes.NavegadorNaInternet.NavegadorNaInternet;
import Funcoes.ReprodutorMusical.ReprodutorMusical;

public class EquipamentoMultiFuncional implements AparelhoTelefonico, NavegadorNaInternet, ReprodutorMusical {

	public void ligacao() {
		System.out.println("Utilizando o aparelho telefonico!");
	}

	public void navegando() {
		System.out.println("Utilizando o navegador de internet!");		
	}
	
	public void musicas() {
		System.out.println("Utilizando o reprodutor musical!");	
	}
}
