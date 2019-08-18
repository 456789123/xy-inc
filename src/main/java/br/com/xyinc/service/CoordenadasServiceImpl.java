package br.com.xyinc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.xyinc.dto.GlobalPositioningSystemDTO;

@Service
public class CoordenadasServiceImpl implements CoordenadasService {
	
	
	List<GlobalPositioningSystemDTO> lista = new ArrayList<>();

	@Override
	public String index() {
		return APRESENTACAO;
	}


	@Override
	public String cadastrarLugar( GlobalPositioningSystemDTO poi ) {
		lista.add(poi);
		return SUCCES;
	}

	@Override
	public List<GlobalPositioningSystemDTO> listarLugares() {
		return lista;
	}
	
	
	@Override
	public List<GlobalPositioningSystemDTO> listarLugares( int distancia, int x, int y ) {
		List<GlobalPositioningSystemDTO> listarLocaisProximos = new ArrayList<>( );
		int lugarProximo = 0;

		for( GlobalPositioningSystemDTO obj: lista ) {
			GlobalPositioningSystemDTO poiResult = new GlobalPositioningSystemDTO( );
			poiResult.setCoodX( obj.getCoodX() - x);
			poiResult.setCoodY( obj.getCoodY() - y);

			lugarProximo = (int) Math.sqrt( Math.pow(poiResult.getCoodX(), 2) + Math.pow(poiResult.getCoodY(), 2) );
			if( distancia >= lugarProximo ) {
				listarLocaisProximos.add(obj);
			}
		}

		return listarLocaisProximos;
	}
	
	
	private void preencherListaTeste( ) {
		
		GlobalPositioningSystemDTO poi1 = new GlobalPositioningSystemDTO();
		poi1.setNomeLugar("Lanchonete");
		poi1.setCoodX(27);
		poi1.setCoodY(12);
		
		GlobalPositioningSystemDTO poi2 = new GlobalPositioningSystemDTO();
		poi2.setNomeLugar("Posto");
		poi2.setCoodX(31);
		poi2.setCoodY(18);
		
		GlobalPositioningSystemDTO poi3 = new GlobalPositioningSystemDTO();
		poi3.setNomeLugar("Joalheria");
		poi3.setCoodX(15);
		poi3.setCoodY(12);

		GlobalPositioningSystemDTO poi4 = new GlobalPositioningSystemDTO();
		poi4.setNomeLugar("Floricultura");
		poi4.setCoodX(19);
		poi4.setCoodY(21);

		GlobalPositioningSystemDTO poi5 = new GlobalPositioningSystemDTO();
		poi5.setNomeLugar("Pub");
		poi5.setCoodX(12);
		poi5.setCoodY(8);
		
		GlobalPositioningSystemDTO poi6 = new GlobalPositioningSystemDTO();
		poi6.setNomeLugar("Supermercado");
		poi6.setCoodX(23);
		poi6.setCoodY(6);
		
		GlobalPositioningSystemDTO poi7 = new GlobalPositioningSystemDTO();
		poi7.setNomeLugar("Churascaria");
		poi7.setCoodX(28);
		poi7.setCoodY(2);
		
		
		lista.add(poi1);
		lista.add(poi2);
		lista.add(poi3);
		lista.add(poi4);
		lista.add(poi5);
		lista.add(poi6);
		lista.add(poi7);
		
	}


	@Override
	public void preecherListaTeste() {
		preencherListaTeste();
	}

}
