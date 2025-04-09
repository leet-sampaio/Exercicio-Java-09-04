public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private double velocidadeAtual;

    public Carro(String marca, String modelo, int ano, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.velocidadeAtual = 0;
    }

    public void acelerar(double adicao) {
        if (adicao > 0) {
            velocidadeAtual += adicao;
            System.out.println(modelo + " acelerou para " + velocidadeAtual + " km/h.");
        }
    }

    public void frear(double subtracao) {
        if (subtracao > 0) {
            velocidadeAtual -= subtracao;
            if (velocidadeAtual < 0) {
                velocidadeAtual = 0;
            }
            System.out.println(modelo + " freou, velocidade atual: " + velocidadeAtual + " km/h.");
        }
    }

    public void informacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Placa: " + placa);
        System.out.println("Velocidade Atual: " + velocidadeAtual + " km/h");
    }
}
