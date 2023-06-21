package unitins;



public class Laboratorio {

	public static void main(String[] args) {
		
		System.out.print(Laboratorio.calculoDePotencia(2, 4));
		
	}
	// RECURSIVIDADE 
	public static Integer calculoDePotencia (Integer numero, Integer potenciaDoNumero) {
		
		if(potenciaDoNumero == 1) {
			return numero;
		}
		
		// PROBLEMAS ESTAVA DANDO PUCA MEMORIA N SEI PQ AI LENBREI QUE N TINHA DIMINUIDO O potenciaDoNumero 
		return (numero * Laboratorio.calculoDePotencia(numero, --potenciaDoNumero));
		
		//potenciaDoNumero--;
		//--potenciaDoNumero;
	}
}

class No {
    int valor;
    No esquerda;
    No direita;

    No(int item) {
        valor = item;
        esquerda = direita = null;
    }
}

class ArvoreBalanceada {
    No raiz;

    // Construtor
    ArvoreBalanceada() {
        raiz = null;
    }

    // Função para inserir um novo nó na árvore
    void inserir(int valor) {
        raiz = inserirNo(raiz, valor);
    }

    // Função auxiliar para inserir um nó na árvore de forma recursiva
    No inserirNo(No no, int valor) {
        // Caso base: a árvore está vazia ou chegou a uma folha
        if (no == null) {
            return new No(valor);
        }

        // Caso contrário, percorre a árvore de forma recursiva
        if (valor < no.valor) {
            no.esquerda = inserirNo(no.esquerda, valor);
        } else if (valor > no.valor) {
            no.direita = inserirNo(no.direita, valor);
        }

        // Retorna o nó atualizado
        return no;
    }

    // Função para percorrer a árvore em ordem (in-order traversal)
    void percorrerEmOrdem(No no) {
        if (no != null) {
            percorrerEmOrdem(no.esquerda);
            System.out.print(no.valor + " ");
            percorrerEmOrdem(no.direita);
        }
    }

    public static void main(String[] args) {
        ArvoreBalanceada arvore = new ArvoreBalanceada();

        // Insere os elementos na árvore
        arvore.inserir(10);
        arvore.inserir(5);
        arvore.inserir(15);
        arvore.inserir(3);
        arvore.inserir(7);
        arvore.inserir(12);
        arvore.inserir(18);

        // Percorre a árvore em ordem e imprime os valores
        arvore.percorrerEmOrdem(arvore.raiz);
    }
}

