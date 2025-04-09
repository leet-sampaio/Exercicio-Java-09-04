public class Jogador {
    private String nome;
    private int pontos;
    private int nivel;

    public Jogador(String nome, int pontos, int nivel) {
        this.nome = nome;
        this.pontos = pontos;
        this.nivel = nivel;
    }

    public String getNome() {return nome;}
    public int getPontos() {return pontos;}
    public int getNivel() {return nivel;}

    public void levelUp(int pontos){
        this.pontos += pontos;
        int nivelUp = this.pontos / 1000;

        if(nivelUp > this.nivel){
            this.nivel = nivelUp;
            System.out.println("Parabéns, você subiu de nível!\nAgora seu nível é: " + nivel);
            System.out.println("Total de pontos: " + this.pontos);
        }else{
            System.out.println("Total de pontos: " + this.pontos);
        }
    }
}