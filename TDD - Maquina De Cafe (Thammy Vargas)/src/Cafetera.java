class Cafetera {
    private int cantidadCafe;

    public Cafetera(int cantidadCafe) {
        this.cantidadCafe = cantidadCafe;
    }

    public boolean tieneCafe(int cantidad) {
        return cantidadCafe >= cantidad;
    }

    public void restarCafe(int cantidad) {
        cantidadCafe -= cantidad;
    }
}