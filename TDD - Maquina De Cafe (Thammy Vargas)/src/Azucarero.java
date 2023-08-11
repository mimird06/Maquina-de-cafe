class Azucarero {
    private int cantidadAzucar;

    public Azucarero(int cantidadAzucar) {
        this.cantidadAzucar = cantidadAzucar;
    }

    public boolean tieneAzucar(int cantidad) {
        return cantidadAzucar >= cantidad;
    }

    public void restarAzucar(int cantidad) {
        cantidadAzucar -= cantidad;
    }
}
