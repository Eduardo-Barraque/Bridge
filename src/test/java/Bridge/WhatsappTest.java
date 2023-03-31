package Bridge;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class WhatsappTest {
    @Test
    public void deveRetornarlimitePDFcomWhatsApp(){
        LimiteCompartilhamento limiteCompartilhamento = new tamanhoPDF();
        CompartilhamentoPorWhatsApp compartilhamentoPorWhatsApp = new CompartilhamentoPorWhatsApp(10);
        compartilhamentoPorWhatsApp.setLimiteCompartilhamento(limiteCompartilhamento);
        assertEquals(20.0,compartilhamentoPorWhatsApp.calcularLimite(),0.01);
    }

    @Test
    public void deveRetornarlimiteTXTcomWhatsApp(){
        LimiteCompartilhamento limiteCompartilhamento = new tamanhoTXT();
        CompartilhamentoPorWhatsApp compartilhamentoPorWhatsApp = new CompartilhamentoPorWhatsApp(10);
        compartilhamentoPorWhatsApp.setLimiteCompartilhamento(limiteCompartilhamento);
        assertEquals(40.0,compartilhamentoPorWhatsApp.calcularLimite(),0.01);
    }
}
