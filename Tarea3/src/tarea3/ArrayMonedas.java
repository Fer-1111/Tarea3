package tarea3;

import java.util.ArrayList;

public class ArrayMonedas{
    private final ArrayList<Moneda> monedasVuelto;

    public ArrayMonedas() {
        monedasVuelto = new ArrayList<>();
    }   
    
    public void addMoneda(Moneda m){
        monedasVuelto.add(m);
    }

    public int arrayLong(){
        return monedasVuelto.size();
    }
    public String Monedas(int i){
        return monedasVuelto.get(i).MonedaDevuelta();
    }

}
