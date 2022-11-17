<<<<<<< HEAD

=======
>>>>>>> bc3f0cc2c20fa47f39a1a16463e3b769bdd0ac87
package tarea3;

import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JLabel;

public class Deposito extends JLabel{
    private final ArrayList<Bebida> ListBebidas;

    public Deposito() {
        ListBebidas = new ArrayList<>();
    }

    public void addBebida(Bebida b) {
        ListBebidas.add(b);
    }

    public Bebida getBebida() {
        if (ListBebidas.size() <= 0) return null;
        else {
            System.out.println("paso a sacar su bebida");
            Bebida b = ListBebidas.remove(0);
            System.out.println("la saco");
            return b;
        }
    }
    public int arrayLong(){
        return ListBebidas.size();
    }
    public void paint(Graphics g){
        if(ListBebidas.size()> 0){
            for(int i=0; i<ListBebidas.size(); i++){
                ListBebidas.get(i).paint(g,i);
            }
        }
    }
}