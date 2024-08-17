package Principal;

/*
 *  Autor Guilherme Lourenço Lopes
 */

public class main {

    public static void main(String[] args) {

       double LADO_QUADRADO = 4; 
       double RAIO_CIRCULO = 3; 
       double ALTURA_TRIANGULO = 5;
       double BASE_TRIANGULO = 3;
       double ARESTA_CUBO = 9;
       double ARESTA_TETRAEDRO = 12;
       double RAIO_ARESTA = 13;
       
       String COR_QUADRADO = "Vermelho";
       String COR_CIRCULO = "Laranja";
       String COR_TRIANGULO = "Amarelo";
       String COR_CUBO = "Verde";
       String COR_TETRAEDRO = "Azul";
       String COR_ESFERA = "Roxo";
               
       Forma quadrado = new Quadrado(COR_QUADRADO, LADO_QUADRADO);
       Forma circulo = new Circulo(COR_CIRCULO, RAIO_CIRCULO);
       Forma triangulo = new Triangulo(COR_TRIANGULO, BASE_TRIANGULO, ALTURA_TRIANGULO);
       Forma cubo = new Cubo(COR_CUBO, ARESTA_CUBO);
       Forma tetraedro = new Tetraedro(COR_TETRAEDRO, ARESTA_TETRAEDRO);
       Forma esfera = new Esfera(COR_ESFERA, RAIO_ARESTA);

       AmbienteVirtual espaco = new AmbienteVirtual();

       espaco.adicionarForma(quadrado);
       espaco.adicionarForma(circulo);
       espaco.adicionarForma(triangulo);
       espaco.adicionarForma(cubo);
       espaco.adicionarForma(tetraedro);
       espaco.adicionarForma(esfera);
       
       //Informações do Quadrado
       System.out.println("QUADRADO");
       System.out.println("Cor: " + quadrado.getCor());
       System.out.printf("Area: %.2f\n\n", quadrado.calcularArea());
       
       //Informações do Circulo
       System.out.println("CIRCULO");
       System.out.println("Cor: " + circulo.getCor());
       System.out.printf("Area: %.2f\n\n", circulo.calcularArea());
       
       //Informações do Triangulo
       System.out.println("TRIANGULO");
       System.out.println("Cor: " + triangulo.getCor());
       System.out.printf("Area: %.2f\n\n", triangulo.calcularArea());
       
       //Informações do Esfera
       System.out.println("ESFERA");
       System.out.println("Cor: " + esfera.getCor());
       System.out.printf("Area: %.2f\n",  esfera.calcularArea());
       System.out.printf("Volume: %.2f\n\n", ((FormaTridimensional)esfera).calcularVolume());
       
       //Informações do Cubo
       System.out.println("CUBO");
       System.out.println("Cor: " + cubo.getCor());
       System.out.printf("Area: %.2f\n", cubo.calcularArea());
       System.out.printf("Volume: %.2f\n\n", ((FormaTridimensional)cubo).calcularVolume());
       
       //Informações do Tetraedro
       System.out.println("TETRAEDRO");
       System.out.println("Cor: " + cubo.getCor());
       System.out.printf("Area: %.2f\n", cubo.calcularArea());
       System.out.printf("Volume: %.2f", ((FormaTridimensional)tetraedro).calcularVolume());
    }
    
}
