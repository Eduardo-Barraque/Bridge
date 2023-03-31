package Bridge;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
 public class EmailTest {

    @Test
    public void deveRetornarlimitePDFcomEmail(){
        LimiteCompartilhamento limiteCompartilhamento = new tamanhoPDF();
        CompartilhamentoPorEmail compartilhamentoPorEmail = new CompartilhamentoPorEmail(10);
        compartilhamentoPorEmail.setLimiteCompartilhamento(limiteCompartilhamento);
        assertEquals(10.0,compartilhamentoPorEmail.calcularLimite(),0.01);
    }

     @Test
     public void deveRetornarlimiteTXTcomEmail(){
         LimiteCompartilhamento limiteCompartilhamento = new tamanhoTXT();
         CompartilhamentoPorEmail compartilhamentoPorEmail = new CompartilhamentoPorEmail(10);
         compartilhamentoPorEmail.setLimiteCompartilhamento(limiteCompartilhamento);
         assertEquals(20.0,compartilhamentoPorEmail.calcularLimite(),0.01);
     }


}
