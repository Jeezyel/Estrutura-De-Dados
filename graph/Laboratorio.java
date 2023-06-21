import unitins.Node;

public class Laboratorio {
        public static void main(String [] args){ 




       /* System.out.println("como esta se sentindo neste momento \n 0 = feliz \n 1 = na média \n 2 = triste"); 
        int sentimento = leitor.nextInt();

         System.out.println("qual e o seu estilo de música \n 0 = Rock \n  1 = Funck  \n 2 = Rep"); 
        int estiloMusical = leitor.nextInt();*/



        Graph grafo = new Graph();
        
        Node cidadeA = new Node("Tocantins");
        Node cidadeB = new Node("Brazilian");
        Node cidadeC = new Node("Curitiba");
        Node cidadeD = new Node("Rcife");
        Node cidadeE = new Node("Ceará");
        
        grafo.createVertex(cidadeA, cidadeB, 10);
        grafo.createVertex(cidadeB, cidadeC, 5);
        grafo.createVertex(cidadeA, cidadeC, 15);
        grafo.createVertex(cidadeD, cidadeB, 11);
        grafo.createVertex(cidadeE, cidadeC, 13);
        grafo.createVertex(cidadeD, cidadeE, 9);
        grafo.createVertex(cidadeA, cidadeD, 4);

        
        System.out.println("Rota mais curta: ");
        grafo.printAllPathsFromTo(cidadeD, cidadeA);
        

    }
}
