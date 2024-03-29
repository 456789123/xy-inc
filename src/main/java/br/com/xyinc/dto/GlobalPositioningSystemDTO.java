package br.com.xyinc.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;


@Getter @Setter

public class GlobalPositioningSystemDTO implements Serializable {

	private static final long serialVersionUID = -1151487275379231582L;
	
	
	
	private String nomeLugar;
	private Integer coodX;
	private Integer coodY;
	

	public GlobalPositioningSystemDTO( ) {}
	
	public GlobalPositioningSystemDTO( String nomeLugar, int coodX, int coodY ) {
		this.nomeLugar = nomeLugar;
		this.coodX     = coodX;
		this.coodY     = coodY;
	}

}
