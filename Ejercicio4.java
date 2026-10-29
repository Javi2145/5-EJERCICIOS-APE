class Cuenta {
    String titular;
    double saldo;

    Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    void depositar(double monto) {
        saldo += monto;
    }

    boolean retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            return true;
        }
        return false;
    }

    void transferir(Cuenta destino, double monto) {
        if (retirar(monto)) {
            destino.depositar(monto);
            System.out.println("Transferencia exitosa de $" + monto
                    + " de " + titular + " a " + destino.titular);
        } else {
            System.out.println("Fondos insuficientes. Transferencia fallida de $" + monto);
        }
    }

    void mostrar() {
        System.out.println(titular + " - Saldo: $" + saldo);
    }
}

public class Ejercicio4 {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta("Ana", 500);
        Cuenta c2 = new Cuenta("Luis", 200);

        c1.transferir(c2, 150);   // válida
        c1.mostrar();
        c2.mostrar();

        c1.transferir(c2, 1000);  // falla
        c1.mostrar();
        c2.mostrar();
    }
}