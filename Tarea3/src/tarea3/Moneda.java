
package tarea3;

public abstract class Moneda{
    public String getSerie(){ //significa que retorna su dirección en RAM como número de serie
        return this.toString();
    }
    public abstract int getValor(); //retorna la cantidad de $que vale la moneda
    public abstract String MonedaDevuelta();
}
class Moneda1000 extends Moneda{
    public Moneda1000(){
        super();
    }
    @Override
    public int getValor(){
        return 1000;
    }
    @Override
    public String MonedaDevuelta(){
        return " 1000";
    }
}
class Moneda500 extends Moneda{
public Moneda500(){
        super();
    }
@Override
    public int getValor(){
        return 500;
    }
@Override
    public String MonedaDevuelta(){
        return " 500";
    }
}
class Moneda100 extends Moneda{
public Moneda100(){
        super();
    }
@Override
    public int getValor(){
        return 100;
    }
@Override
    public String MonedaDevuelta(){
        return " 100";
    }
}
