public class Main {
    public static void main(String[] args) {

        // Criando um objeto do tipo Carro
        // Declarando e instanciando um objeto da classe Carro
        // Nome do objeto: audi
        Audi audi = new Audi(2);
        Nissan nissan = new Nissan(4);
        Volvo volvo = new Volvo("branco");

        // Acessando os atributos do objeto audi
        String audiCor = audi.getCor();
        int audiNumeroPortas = audi.getNumeroPortas();
        int audiKmRodados = audi.getKmRodados();
        int audiVelocidade = audi.getVelocidade();

        // Acessando atributo específico da classe Volvo
        volvo.setFuturoDono("Eric");

        // Imprimir os atributos do carro Audi
        System.out.println("Carro: Audi");
        imprimirCarro(audi);

        // Imprimir os atributos do carro Nissan
        System.out.println("Carro Nissan");
        imprimirCarro(nissan);
        // System.out.println("Futuro dono: " + nissan.getFuturoDono());

        // Imprimir os atributos do carro Volvo
        System.out.println("Carro Volvo");
        imprimirCarro(volvo);
        System.out.println("Futuro dono: " + volvo.getFuturoDono());
    }

    private static void imprimirCarro(Carro carro) {
        System.out.println("Cor: " + carro.getCor());
        System.out.println("Portas: " + carro.getNumeroPortas());
        System.out.println("Km rodados: " + carro.getKmRodados());
        System.out.println("Velocidade: " + carro.getVelocidade());
    }
}
