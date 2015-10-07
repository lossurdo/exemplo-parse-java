# exemplo-parse-java
Exemplo de uso da Parse API via Java, utilizando MVC e JSF. Demonstrado na disciplina de Programação para Internet 2 da [Faculdade de Tecnologia Senac](http://www.senacrs.com.br/), curso de Análise e Desenvolvimento de Sistemas.

## Detalhes ##

* Projeto utilizando a estrutura do Maven para pacotes
* API utilizada para interação com JSON: [Jersey API](https://jersey.java.net/)
* Demonstração do MVC separando as camadas da seguinte forma:
  * 1ª camada: XHTML JSF + Managed Bean
  * 2ª camada: Classe RN (que poderá ser exposta como serviço posteriormente)
  * 3ª camada: Classe BD (responsável pela persistência; neste caso, no Parse)

Será necessário o seu cadastro no [Parse API](https://www.parse.com/), a criação de um aplicativo e a adaptação deste projeto adicionando-se o APPLICATION_ID e o REST_KEY na configuração da classe *ParseUtil* para que seja possível a autenticação no serviço.