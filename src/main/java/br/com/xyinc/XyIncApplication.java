package br.com.xyinc;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.xyinc.service.CoordenadasService;

@SpringBootApplication
public class XyIncApplication {
	
	@Autowired CoordenadasService servico;

	public static void main(String[] args) {
		SpringApplication.run(XyIncApplication.class, args);
	}
	
    @PostConstruct
    private void init() {
    	servico.preecherListaTeste();
    }

}
