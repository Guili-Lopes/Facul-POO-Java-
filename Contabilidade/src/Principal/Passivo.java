package principal;

public interface Passivo {
    public static  final double SALARIO = 1412.0;
    public static final double VALOR_HORA = 65.0;

    public abstract double getValorAPagar(int dia, int mes);
}