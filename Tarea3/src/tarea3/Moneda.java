package tarea3;

public abstract class Moneda{
    private final int serie;
    public Moneda(int serie){
        this.serie = serie;
    }
    public int getSerie(){
        return serie;
    }
    public abstract int getValor(); //retorna la cantidad de $que vale la moneda
    public abstract String MonedaDevuelta();
}
class Moneda1000 extends Moneda{
    public Moneda1000(int serie){
        super(serie);
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
public Moneda500(int serie){
        super(serie);
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
public Moneda100(int serie){
        super(serie);
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
