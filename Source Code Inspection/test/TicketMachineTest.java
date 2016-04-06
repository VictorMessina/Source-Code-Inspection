/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.calebe.ticketmachine.core.TicketMachine;
import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import br.calebe.ticketmachine.exception.SaldoInsuficienteException;
import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 31449530
 */
public class TicketMachineTest {

    public TicketMachineTest() {
    }

    @Test
    public void SaldoInicialTest() {
        TicketMachine t = new TicketMachine(3);

        Assert.assertEquals(0, t.getSaldo(), 0);
    }

    @Test
    public void ValorTicketInicialTest() {
        TicketMachine t = new TicketMachine(3);

       // Assert.assertEquals(3,t.getValor(),0);
    }

    @Test
    public void InsercaoPapeloMoedaTest() throws PapelMoedaInvalidaException {
        TicketMachine t = new TicketMachine(3);

        t.inserir(100);

        Assert.assertEquals(100, t.getSaldo(), 0);
    }

    @Test
    public void ImpressaoSaldoTest() throws PapelMoedaInvalidaException, SaldoInsuficienteException {
        TicketMachine t = new TicketMachine(3);

        t.inserir(100);

        System.out.println(t.imprimir());

    }
    
    
}
