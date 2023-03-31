package Bridge;

public class CompartilhamentoPorEmail extends CompartilhamentoDeArquivo {

    public CompartilhamentoPorEmail(float limiteBase ){
        super(limiteBase);
    }

    @Override
    public Float calcularLimite() {
        return this.limiteBase * (1*this.limiteCompartilhamento.tamanhoLimite());
    }
}
