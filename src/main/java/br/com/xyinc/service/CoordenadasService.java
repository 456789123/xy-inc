package br.com.xyinc.service;

import java.util.List;

import br.com.xyinc.dto.GlobalPositioningSystemDTO;

public interface CoordenadasService {


	static final String APRESENTACAO = "Coordenadas Zup Online!!!";
	static final String SUCCES = "Cadastro efetuado com sucesso.";



	String index( );
	String cadastrarLugar( GlobalPositioningSystemDTO poi );
	List<GlobalPositioningSystemDTO> listarLugares( );
	List<GlobalPositioningSystemDTO> listarLugares(int distancia, int x, int y);


	void preecherListaTeste( );
}
