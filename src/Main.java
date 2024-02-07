public class Main {
    public static void main(String[] args) {
        Figura figura = new Figura(10);
        FiguraCerrada figuraCerrada = new FiguraCerrada(15,4);
        Cuadrado cuadrado = new Cuadrado(20,4,100);
        FiguraAbierta figuraAbierta = new FiguraAbierta(5);
        figuraCerrada.dibujar();
        cuadrado.dibujar();
    }
}