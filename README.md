# Identificação

* Nome: Ewerthon Tavares
* Email (@ccc): ewerthon.tavares@ccc.ufcg.edu.br
* Matrícula: 121210726

# Roteiro: Ordenação $n^2$

## Material Teórico

[Selection Sort](https://joaoarthurbm.github.io/eda/posts/selection-sort/)

[Insertion Sort](https://joaoarthurbm.github.io/eda/posts/insertion-sort/)

## O template

> O código java estará (ou você terá que colocar) no diretório **/src/main/java/**

> Os testes estarão (ou você terá que incluir) no diretório **/src/main/java/** no formato de asserts.

> Seu código é tão bom quanto seus testes.

> Eu vou executar meus testes quando você submeter.

> Não mude nenhuma assinatura de método, nome de classe ou localização dos arquivos. Mas você pode/deve criar outros métodos e classes, desde que passem nos testes.

> Compilando: `javac *.java` em **/src/main/java/**

> Executando os testes: `java -ea InsertionSortAsserts` em **/src/main/java/**

## Introdução

Este roteiro envolve implementação e teoria dos principais algoritmos de ordenação $O(n^2)$.

Você vai ver que o design do código do template envolve a interface SortingStrategy e que ambos, InsertionSort e SelectionSort implementam essa interface. Isso vai facilitar a minha vida no futuro.

## A tarefa.

### Implementação e testes

**InsertionSort.** Comece pelo insertion. Mais precisamente, pelos dois métodos de inserção ordenada. Depois passe para o método de ordenação clássico (que pode ou não usar os métodos que você fez anteriormente) e a sua implementação recursiva. Seu objetivo é passar nos testes que disponibilizei.

**SelectionSort.** Nem sempre os testes serão entregues. Você deve ser capaz de fazer seus próprios testes. Para o selection, além de implementar os dois métodos que foram pedidos, você deverá criar também uma classe de teste no diretório `src/main/java/`. Inspire-se nos testes que criei para o insertion.

Ah...confira (sempre!) se você passa nos testes: `java -ea InsertionSortAsserts`. Execute de forma semelhante para os testes do selection sort que você criar.

### Teoria

Perguntas importantes:

* Qual o pior caso do insertion sort?

> Quando o array está na ordem reversa.

* Qual o pior caso do selection sort?

> Quando o array está na ordem reversa.

* Em termos de trocas, como você compararia o insertion sort e o selection sort?

> O insertion faz mais trocas, por que faz parte do seu algoritmo ir trocando com o vizinho da esquerda até chegar ao seu lugar. Enquanto que o selection troca menos, apenas quando encontra o seu lugar.

* Em termos de comparaçõeas, como você compararia o insertion sort e o selection sort?

> Agora, o selection faz mais comparações do que o insertion. Porque o seu método é ir comparando até encontrar o lugar para o elemento.

* Mostre com um exemplo concreto que o selection não é estável.

> No suposto array [1, 3, 2, 4, 2] o algoritmo seguiriia a ordenação colocando o elemento que está na posição 2 do array na posição 1, o que estaria correto, mas ao encontrar o elemento repetido da última posição do array, este seria colocado na posição 2 do array, o que configura uma ordenação não-estável.

* O insertion é estável? Argumente com um exemplo concreto.

> Sim. No array hipotético [1, 3, 2, 4, 2]. O algoritmo só troca elementos quando encontra algum maior, não um igual.

## Mais estudo

Implemente as seguintes questões no tst-eda:

* Insere Último
* Insere Primeiro
* InsertionSort Recursivo
* Selection sort passo a passo
* SelectionSort Recursivo
* Mariana e os livros

