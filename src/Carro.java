// Características POO
// ENCAPSULAMENTO
// POLIMORFISMO
// HERANÇA

// Classe Carro: superclasse
public class Carro {
    // Atributos da classe Carro
    private String cor; // branco
    private int numeroPortas; // 10
    private int kmRodados;
    private int velocidade;

    // JAVABEANS
    // 1) Atributos privados
    // 2) Atributos acessíveis por Getters e Setters
    // 3) Construtor sem parâmetros para inicializar atributos com zero

    // Construtor da classe Carro
    // Definir o estado inicial da classe
    // Inicializar seus atributos
    // Construtor de Inicialização
    public Carro() {
        this.setCor("");
        this.setNumeroPortas(0);
        this.kmRodados=0;
        this.velocidade=0;
    }

    // Sobrecarga do método Construtor (assinatura diferente)
    public Carro(int numeroPortas) {
        this.setCor("");
        this.setNumeroPortas(numeroPortas);
        this.kmRodados=0;
        this.velocidade=0;
    }

    // Sobrecarga do método Construtor (assinatura diferente)
    public Carro(String cor) {
        this.cor = cor;
    }

    // public: visibilidade
    // int/void: retorno do método (resposta)
    // getVelocidade: nome do método

    // Getters e setters dos atributos da classe
    // Get: pegar Set: setar,configurar,gravar
    public String getCor() {
        return cor; // preto
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public int getKmRodados() {
        return kmRodados;
    }

    public void setKmRodados(int kmRodados) {
        this.kmRodados = kmRodados;
    }

    public int getVelocidade() {
        return velocidade;
    }

    // int velocidade: parâmetro (novo valor para o atributo)
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

}
