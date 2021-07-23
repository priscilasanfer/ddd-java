## 01. Linguagem Ubíqua

*Building blocks*
Os conceitos já aprendidos no curso de [clean architecture](https://github.com/priscilasanfer/clean-architecture-alura) são diretamente relacionados com o estudo de Domain Driven Design.
Muito do que aprendemos no curso anterior é o que chamamos de Building blocks ou Blocos de construção.

- Entity
- Value Object
- Repository
- Factory
- Service

Todos esses padrões são descritos no estudo sobre DDD e com isso já temos um belo ponto de partida.
Vale ressaltar que o termo Domain Driven Design significa literalmente modelar nosso software nos orientando pelo domínio do negócio

Resumo:
- Aprendemos que os estudos de Clean Architecture e DDD geralmente se complementam;
- Entendemos o que é DDD;
- Vimos que diversos conceitos de DDD já foram aprendidos no curso de Clean Architecture;
- Conhecemos o termo Linguagem Ubíqua que consiste em ter uma linguagem onipresente entre a equipe de desenvolvimento e a equipe de negócios.


## 02. Aggregates

O que é uma invariante?
- É uma regra de negócio que deve sempre ser verdadeira para os objetos serem válidos.
  Se um aluno tiver mais do que 2 telefones em nosso sistema, essa regra foi violada, logo, o Aluno estará em um estado inválido. 
  Invariantes nada mais são do que regras de negócio que precisam ser verificadas para garantir sua consistência.
  
*Aggregates*
O termo Aggregate já foi citado em treinamentos anteriores, mas como recordar é viver, deixo aqui um breve artigo do Martin Fowler sobre o assunto: https://martinfowler.com/bliki/DDD_Aggregate.html

Resumo:
- Conhecemos o conceito de Aggregates;
- Entendemos o que é uma invariante;
- Vimos que persistência de Aggregates é um assunto complexo, pois envolve infraestrutura.
