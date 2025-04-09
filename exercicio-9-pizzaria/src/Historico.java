import java.util.ArrayList;
import java.util.List;

public class Historico {
    List<Pedido> pedidos = new ArrayList<>();

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void mostrarHistorico(){
        for(Pedido pedido : pedidos){
            System.out.println(pedido);;
            System.out.println("============");
        }
    }
}
