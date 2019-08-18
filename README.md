# XY Inc Zup

<p>O desafio fora feito com a linguagem Java usando o framewok Spring Boot e testes está usando o Junit com Mockito.</p>
<p>Depois que baixar a plicação no repositório Git com os comando abaixo, usará o comando Maven para baixar as libs de dependência que serão usadas.</p>

git clone https://github.com/456789123/xy-inc.git

Após isso será:

mvn clean install -DskipTests

Para iniciar a aplicação, será com o seguinte comando:

mvn spring-boot:run

A aplicação está usando os seguintes serviços Rest:

Para teste do serviço é:

http://localhost:8080/

Irá aparecer a mensagem “Coordenadas Zup Online!!!”.

Listar os lugares cadastrados:

http://localhost:8080/listar-lugares

Listar os lugares próximos a ponto especifico:

http://localhost:8080/listar-lugares/10/20/10

Aqui está especificando "listar-lugares/{distamcia}/{coordenada x}/{coordenada y}".

E por fim, o cadastro do ponto que é dado via POST pela seguite URL e o objeto Json que será passado:

http://localhost:8080/cadastrar-lugar

{
    "nomeLugar": "Banco",
    "coodX": 18,
    "coodY": 16
}


Para a regra do desafio, fora proposto uma aplicação para auxiliar pessoas na localização de ponto de interesse (POIs) baseada em serviços, de forma a flexibilizar a integração, sendo estes:
Serviço para cadastrar pontos de interesse com 3 atributos: Nome do POI, Coordenada X (inteiro não negativo) Coordenada Y (inteiro não negativo). Os POIs devem ser armazenados em uma base de dados.
Serviço para listar todos os POIs cadastrados.
Serviço para listar POIs por proximidade. Este serviço receberá uma coordenada X e uma c
oordenada Y, especificando um ponto de referência, em como uma distância máxima (d-max) em metros. O serviço deverá retornar todos os POIs da base de dados que estejam a uma distância menor ou igual a d-max a partir do ponto de referência.

Não foi levada e conta a circunferência da Terra neste desafio fazendo o calculo somente do plano cartesiano dado no plano reto( Calculo vetorial para as distâncias dos pontos ).

Fora usado a seguinte regra:


