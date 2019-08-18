package br.com.xyinc.service;

import java.util.List;

import br.com.xyinc.dto.GlobalPositioningSystemDTO;

public interface CoordenadasService {


	static final String APRESENTACAO = "Coodenadas Zup Online!!!";
	static final String SUCCES = "Cadastro de lugar efetuado com sucesso.";



	String index( );
	String cadastrarLugar( GlobalPositioningSystemDTO poi );
	List<GlobalPositioningSystemDTO> listarLugares( );
	List<GlobalPositioningSystemDTO> listarLugares(int distancia, int x, int y);


	void preecherListaTeste( );
}
