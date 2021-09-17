public class Volvo extends Carro {
    // Atributo específico da classe Volvo
    // Terá atributos da classe pai + futuroDono
    private String futuroDono;

    public Volvo(String cor) {
        super(cor);
    }

    // Getters e Setters específicos
    public String getFuturoDono() {
        return this.futuroDono;
    }

    public void setFuturoDono(String futuroDono) {
        this.futuroDono = futuroDono;
    }

}
