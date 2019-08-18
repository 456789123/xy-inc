# XY Inc Zup

<p>O desafio fora feito com a linguagem Java usando o framewok Spring Boot e testes está usando o Junit com Mockito.</p>
<p>Depois que baixar a plicação no repositório Git com os comando abaixo, usará o comando Maven para baixar as libs de dependência que serão usadas.</p>

git clone https://github.com/456789123/xy-inc.git

<p>Após isso será:</p>

mvn clean install -DskipTests

<p>Para iniciar a aplicação, será com o seguinte comando:</p>

mvn spring-boot:run

<p>A aplicação está usando os seguintes serviços Rest:</p>
<p>Para teste do serviço é:</p>
http://localhost:8080/

<p>Irá aparecer a mensagem “Coordenadas Zup Online!!!”.</p>

<p>Listar os lugares cadastrados:</p>

http://localhost:8080/listar-lugares

<p>Listar os lugares próximos a ponto especifico:</p>

http://localhost:8080/listar-lugares/10/20/10

<p>Aqui está especificando "listar-lugares/{distamcia}/{coordenada x}/{coordenada y}".</p>

<p>E por fim, o cadastro do ponto que é dado via POST pela seguite URL e o objeto Json que será passado:</p>

http://localhost:8080/cadastrar-lugar

{
    "nomeLugar": "Banco",
    "coodX": 18,
    "coodY": 16
}


<p>Para a regra do desafio, fora proposto uma aplicação para auxiliar pessoas na localização de ponto de interesse (POIs) baseada em serviços, de forma a flexibilizar a integração, sendo estes:
Serviço para cadastrar pontos de interesse com 3 atributos: Nome do POI, Coordenada X (inteiro não negativo) Coordenada Y (inteiro não negativo). Os POIs devem ser armazenados em uma base de dados.
Serviço para listar todos os POIs cadastrados.</p>
<p>Serviço para listar POIs por proximidade. Este serviço receberá uma coordenada X e uma coordenada Y, especificando um ponto de referência, em como uma distância máxima (d-max) em metros. O serviço deverá retornar todos os POIs da base de dados que estejam a uma distância menor ou igual a d-max a partir do ponto de referência.</p>
<p>Não foi levada e conta a circunferência da Terra neste desafio fazendo o calculo somente do plano cartesiano dado no plano reto( Calculo vetorial para as distâncias dos pontos ).</p>

<p>Fora usado a seguinte regra:</p>


