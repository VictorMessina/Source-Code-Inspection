
import br.calebe.ticketmachine.core.PapelMoeda;
import junit.framework.Assert;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 31449530
 */
public class PapelMoedaTest {
    
    public PapelMoedaTest(){
        
    }
    
    @Test
    public void inicializacaoClassePapelMoedaTest(){
        PapelMoeda p = new PapelMoeda(5, 2);
        
        Assert.assertNotNull(p);
    }
    
    @Test
    public void verificaValorNotaTest(){
        PapelMoeda p = new PapelMoeda(5, 2);
        
        Assert.assertEquals(5,p.getValor(),0);
    }
    
    @Test
    public void verificaQuantidadeTest(){
        PapelMoeda p = new PapelMoeda(5, 2);
        
        Assert.assertTrue(p.getQuantidade()>0);
    }
    
}
