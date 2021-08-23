Java  Implementando Collections e Streams
java.util.List (ArrayList / Vector) 
	Implementações que aprenderemos 
	java.util.ArrayList
	java.util.Vector
	Garante ordem de inserção
	Permite adição, atualização, leitura e remoção sem regras adicionais
	Permite ordenação através de comparators
java.util.Queue
	Implementações que aprenderemos 
	java.util.LinkedList
	Garante ordem de inserção
	Permite adição, leitura e remoção considerando a regra básica de uma fila: Primeiro que entra, primeiro que sai. Não permite alteração, não existe o método “set” 
	Não permite mudança de ordenação.
java.util.Set (HashSet / TreeSet / LinkedHashSet)
	Por Padrão, não garante ordem
	Não permite itens repetidos
	Permite adição e remoção normalmente
	Não possui busca por item e atualização. Para leitura, apenas navegação
	Não permite mudança de ordenação
java.util.Map
	Não é uma interface que estende de java.util.Collection
	Implementações que aprenderemos 
	java.util.HashMap
	java.util.TreeMap
	java.util.HashTable
	Armazena chave e valor (2 tipos de objeto)
	Permite valores repetidos, mas não permite repetição de chaves
	Permite adição, busca por chave ou valor, atualização, remoção e navegação
	Pode ser ordenado
HashMap  Para navegar o map fornece 2 métodos, o entrySet() e o keySet()
TreeMap
HashTable
Comparators
	java.util.Comparator – Interface para definir classe com regras de ordenação.
	java.util.Comparable – Interface para definir regras de ordenação em uma classe de domínio.
	Algoritmos de ordenação
	Utilizado primariamente em java.util.List
	Permite ordenação de objetos complexos (criados pelo usuário)
Optional
	Tratamento para valores que podem ser nulos
	Possui 2 estados
	Presente
	Vazio
	Permite que você execute operações em valores que podem ser nulos sem preocupação com as famosas NullPointerExceptions
