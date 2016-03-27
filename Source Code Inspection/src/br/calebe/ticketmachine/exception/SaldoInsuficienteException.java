package br.calebe.ticketmachine.exception;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class SaldoInsuficienteException extends Exception {

    public SaldoInsuficienteException() {
        super("Saldo insuficiente, colocar mais dinheiro na maquina para finalizar a compra do bilhete");
    }
    
}
