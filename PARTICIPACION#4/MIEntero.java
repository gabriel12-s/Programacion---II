public class MIEntero {
    private int valor;
    public MIEntero(int valor) {
        this.valor = valor;
    }
    public int get() {
        return valor;
    }

    
    public boolean esPar() {
        return valor % 2 == 0;
    }
    public boolean esImpar() {
        return !esPar();
    }
    public boolean esPrimo() {
        if (valor <= 1) return false;
        for (int i = 2; i <= Math.sqrt(valor); i++) {
            if (valor % i == 0) return false;
        }
        return true;
    }
    public boolean equals(int valorComparar) {
        return this.valor == valorComparar;
    }
    public boolean equals(MIEntero otro) {
        if (otro == null) return false;
        return this.valor == otro.valor;
    }
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        MIEntero otro = (MIEntero) obj;
        return this.valor == otro.valor;
    }
    public static boolean esPar(int val) {
        return val % 2 == 0;
    }
    public static boolean esImpar(int val) {
        return !esPar(val);
    }
    public static boolean esPrimo(int val) {
        if (val <= 1) return false;
        for (int i = 2; i <= Math.sqrt(val); i++) {
            if (val % i == 0) return false;
        }
        return true;
    }
    public static boolean esPar(MIEntero obj) {
        if (obj == null) return false;
        return obj.esPar();
    }
    public static boolean esImpar(MIEntero obj) {
        if (obj == null) return false;
        return obj.esImpar();
    }

    public static boolean esPrimo(MIEntero obj) {
        if (obj == null) return false;
        return obj.esPrimo();
    }
    public static int parseInt(char[] digs) {
        int resultado = 0;
        for (char c : digs) {
            if (c >= '0' && c <= '9') {
                resultado = resultado * 10 + (c - '0');
            }
        }
        return resultado;
    }
    public static int parseInt(String str) {
        int resultado = 0;
        for (char c : str.toCharArray()) {
            if (c >= '0' && c <= '9') {
                resultado = resultado * 10 + (c - '0');
            }
        }
        return resultado;
    }
    public String toString() {
        return "MIEntero{" + "valor=" + valor + "}";
    }
}

