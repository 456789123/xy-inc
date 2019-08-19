package br.com.xyinc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.xyinc.dto.GlobalPositioningSystemDTO;
import br.com.xyinc.service.CoordenadasService;


@RestController
public class CoordenadasController {

	@Autowired private CoordenadasService servico;
	
	@RequestMapping( value = "/", method = RequestMethod.GET )
	public ResponseEntity<String> index( ) {
		return new ResponseEntity<String>(servico.index(), HttpStatus.OK);
	}

	@RequestMapping( value = "/listar-lugares", method = RequestMethod.GET )
	public ResponseEntity<List<GlobalPositioningSystemDTO>> listarLugares( ) {
		return new ResponseEntity<List<GlobalPositioningSystemDTO>>(servico.listarLugares( ), HttpStatus.OK);
	}
	
	@RequestMapping( value = "/listar-lugares/{distancia}/{x}/{y}", method = RequestMethod.GET )
	public ResponseEntity<List<GlobalPositioningSystemDTO>> listarLugares( @PathVariable("distancia") int distancia,
                                                                                   @PathVariable("x") int x,
			                                                                       @PathVariable("y") int y ) {
		return new ResponseEntity<List<GlobalPositioningSystemDTO>>(servico.listarLugares(distancia, x, y), HttpStatus.OK);
	}
	
	@RequestMapping( value = "/cadastrar-lugar", method = RequestMethod.POST )
	public ResponseEntity<String> cadastrarlugar( @RequestBody GlobalPositioningSystemDTO poi ) {
		return new ResponseEntity<String>( servico.cadastrarLugar(poi), HttpStatus.OK);
	}

}
