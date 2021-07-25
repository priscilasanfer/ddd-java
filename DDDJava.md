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


## 03. Eventos

Qual a motivação para termos eventos de domínio em nossa aplicação?  
- Poder programar nossa aplicação para reagir a eventos de forma flexível.  
  Trabalhando com eventos, o mesmo evento pode gerar várias ações, o que nos dá muita flexibilidade.  
  
*Eventos e frameworks*  
É muito comum que os frameworks trabalhem com publicação de eventos.  
Os eventos que os frameworks emitem por padrão não são eventos de domínio, porém nada nos impede de utilizar suas ferramentas a nosso favor para emitir nossos eventos de domínio.  

Resumo:
- Definimos o que é um evento;
- Entendemos o que é um evento de domínio;
- Aprendemos a implementar, emitir e reagir a um evento de domínio.


## 04. Contextos delimitados

Qual a vantagem de separar nossa aplicação em contextos delimitados (Bounded Contexts)?  
- Flexibilidade  
  Com contextos bem delimitados, podemos ter equipes separadas para trabalhar em cada um dos contextos e além disso eles podem até virar projetos separados, evoluindo individualmente.  
  
*Bounded Contexts*  
Bounded Contexts, ou contextos delimitados, são um dos conceitos mais complexos de entender e implementar do estudo do DDD.  
Vale a pena leituras mais aprofundadas para conhecer técnicas que envolvem esse princípio.  
Aqui deixo um breve artigo com uma introdução ao tema: https://martinfowler.com/bliki/BoundedContext.html  

Resumo:
- Conhecemos o conceito de Bounded Contexts ou Contextos Delimitados;
- Vimos que a separação em contextos nos dá mais flexibilidade porém aumenta (e muito) a complexidade;
- Conhecemos o desenho conhecido como Mapa de Contexto.


## 05. Contexto compartilhado  

*Shared Kernel*  
A utilização de um núcleo compartilhado tem suas vantagens e desvantagens.  
É a forma mais fácil de possibilitar a comunicação entre contextos delimitados, mas nos tira boa parte da flexibilidade.  
Aqui nesse artigo há uma revisão sobre Bounded Contexts e uma breve citação sobre [Shared Kernel](http://www.fabriciorissetto.com/blog/ddd-bounded-context/)  

Por que não utilizar diretamente a classe de um evento, fazendo casting quando necessário?
- Flexibilidade
  Sem depender diretamente da classe, continuamos com um baixo acoplamento entre os contextos delimitados, nos permitindo estendê-los de forma independente.
  
Resumo:
- Entendemos que os contextos devem ser independentes, mas precisam se comunicar de alguma forma;
- Conhecemos o conceito de Shared Kernel, e vimos que há vantagens e desvantagens;
- Utilizamos eventos de domínio para realizar parte da comunicação entre contextos;
- Vimos que cada contexto pode fornecer seus Use Cases de forma independente.


## 06. Camada Anticorrupção

Entendemos que contextos delimitados podem acabar evoluindo nosso sistema para se tornar um sistema distribuído.  
O que é um sistema distribuído, na prática?  
- É um sistema que embora pareça ser um para o usuário, é constituído de vários outros sistemas menores.  
  Os famosos microsserviços são um tipo de sistemas distribuídos.  
  Com sistemas distribuídos você ganha muitas vantagens porém também há desvantagens, como foi citado no vídeo.  
  
*Referências*  
DDD é um assunto com muito conteúdo e seria impossível colocar tudo em cursos em vídeo. Há vários livros que são “leituras obrigatórias” para quem quer se aprofundar na área.  

- O livro que originou o termo DDD: https://www.amazon.com.br/Domain-Driven-Design-Eric-Evans/dp/8550800651/
- Uma releitura com uma linguagem um pouco mais palatável: https://www.amazon.com.br/Implementando-Domain-Driven-design-Vernon/dp/8576089521/
- Um livro prático sobre implementação em Java com SpringBoot de conceitos do DDD: https://www.amazon.com.br/Domain-Driven-Design-Spring-Boot-ebook/dp/B07K5W7CTZ

Há ainda diversos canais do YouTube, blogs e sites que falam sobre DDD. Vale a pena a pesquisa.

Resumo:
- Conversamos sobre o que é um sistema distribuído;
- Vimos que através de contextos delimitados podemos distribuir sistemas realmente complexos;
- No caso de sistemas distribuídos, falamos que há a necessidade de uma camada anti-corrupção;
- Vimos algumas referências para nos aprofundar no assunto de DDD.






