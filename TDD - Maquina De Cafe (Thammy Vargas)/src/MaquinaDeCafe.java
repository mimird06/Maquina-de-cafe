class MaquinaDeCafe {
    private Cafetera cafetera;
    private Azucarero azucarero;

    public MaquinaDeCafe(Cafetera cafetera, Azucarero azucarero) {
        this.cafetera = cafetera;
        this.azucarero = azucarero;
    }

    public String prepararCafe(Vaso vaso, int cucharadasAzucar) {
        if (!cafetera.tieneCafe(vaso.getCapacidad())) {
            return "No hay cafe";
        }

        if (!azucarero.tieneAzucar(cucharadasAzucar)) {
            return "No hay azucar suficiente";
        }

        cafetera.restarCafe(vaso.getCapacidad());
        azucarero.restarAzucar(cucharadasAzucar);

        return "Disfruta tu cafe";
    }
}