package Bridge;

public abstract class CompartilhamentoDeArquivo {
    protected LimiteCompartilhamento limiteCompartilhamento;
    protected float limiteBase;

    public CompartilhamentoDeArquivo(float limiteBase){
        this.limiteBase = limiteBase;
    }

    public void setLimiteCompartilhamento(LimiteCompartilhamento limiteCompartilhamento) {
        this.limiteCompartilhamento = limiteCompartilhamento;
    }

    public void setLimiteBase(float limiteBase) {
        this.limiteBase = limiteBase;
    }

    public abstract Float calcularLimite();
}
