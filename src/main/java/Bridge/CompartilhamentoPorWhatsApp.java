package Bridge;

public class CompartilhamentoPorWhatsApp extends CompartilhamentoDeArquivo {

    public CompartilhamentoPorWhatsApp(float limiteBase ){
        super(limiteBase);
    }

    @Override
    public Float calcularLimite() {
        return this.limiteBase * (2*this.limiteCompartilhamento.tamanhoLimite());
    }
}
