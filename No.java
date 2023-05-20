public class No {
    private Integer informacao;
    private No proximo;

    public No(){ // construtor;
        informacao = null;
        proximo = null;
    }

    public void setInfo(Integer informacao){
        this.informacao = informacao;
    }

    public void setProximo(No proximo){
        this.proximo = proximo;
    }

    public No getProximo(){
        return this.proximo;
    }

    public Integer getInformacao(){
        return this.informacao;
    }
}
