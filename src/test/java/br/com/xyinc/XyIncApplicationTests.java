package br.com.xyinc;

import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jayway.restassured.RestAssured;

import br.com.xyinc.dto.GlobalPositioningSystemDTO;
import br.com.xyinc.service.CoordenadasService;

@SpringBootTest
@RunWith(SpringRunner.class)
public class XyIncApplicationTests {

	
	@Mock private CoordenadasService servico;
	
	
	@Before
	public void init( ) {
		servico.preecherListaTeste();
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 8080;
	}

	
	@Test
	public void getCadastraLugar( ) throws Exception {
		GlobalPositioningSystemDTO obj = new GlobalPositioningSystemDTO( "Banco", 12, 32 );
		when(servico.cadastrarLugar(obj)).thenReturn( new String( ));
		RestAssured.get("/cadastrar-lugar").then();

	}

	
	@Test
	public void getListarLugares( ) throws Exception {
		when(servico.listarLugares()).thenReturn( new ArrayList<GlobalPositioningSystemDTO>( ));
		RestAssured.get("/listar-lugares").then();
	}

	@Test
	public void getLugaresProximos( ) throws Exception {
		when(servico.listarLugares(10, 20, 10)).thenReturn( new ArrayList<GlobalPositioningSystemDTO>( ));
		RestAssured.get("/listar-lugares/10/20/10").then();

	}
	
	
	
	
}
