import java.util.ArrayList;

public class Agenda {
    ArrayList<Contato> contatos = new ArrayList<>();

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public void listarContatos(){
        for (int i = 0; i < contatos.size(); i++) {
            System.out.println("[" + (i + 1) + "] " + contatos.get(i).getNome() + " - " + contatos.get(i).getTelefone());
        }
    }

    public void alterarNumero(int index, String novoTelefone){
        contatos.get(index - 1).setTelefone(novoTelefone);
    }
    public void alterarNome(int index, String novoNome){
        contatos.get(index - 1).setNome(novoNome);
    }

    public void removerContato(int index){
        contatos.remove(index - 1);
    }


}
