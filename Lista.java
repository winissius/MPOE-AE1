public class Lista {
    private No primeiro;

    public Lista(){ // cosntrutor
        primeiro = null;
    }

    public boolean vazia(){ // se o primeiro for null a lista esta vazia
        return primeiro == null;
    }
    public void inserePrimeiro(int info){
        No auxiliar = new No(); // noh auxiliar para posicionamento
        auxiliar.setInfo(info);
        auxiliar.setProximo(primeiro);
        primeiro = auxiliar;
    }

    public void insereUltimo(int info){
        if(vazia()){ // vazia() == true;
            inserePrimeiro(info);
        } else{
            No auxiliar = primeiro;

            while(auxiliar != null && auxiliar.getProximo() != null){
                auxiliar = auxiliar.getProximo();
            }

            if(auxiliar.getProximo() == null){ // eh o ultimo
                No novo = new No();
                novo.setInfo(info);
                auxiliar.setProximo(novo); // como o auxiliar era o antigo ultimo nao sera mais o ultimo, se atribui o novo proximo como sendo o novo no criado
            }
        }
    }
    public void removePrimeiro(){
        No novo = new No();
        novo = primeiro.getProximo();
        primeiro.setInfo(null);
        primeiro.setProximo(null);
        primeiro = novo;

    }
    public void removeUltimo(){
        No auxiliar = primeiro; // no auxiliar para percorrer a lista
        No anterior = primeiro; // noa nterior para salvar o anterior visando realizar operacaoes
        while(auxiliar != null && auxiliar.getProximo() != null){
            anterior = auxiliar;
            auxiliar = auxiliar.getProximo();
        }
        if(auxiliar.getProximo() == null){
            anterior.setProximo(null); // o anterior se torna o ultimo entao o proximo dele se torna null
            auxiliar.setInfo(null); // remove as informacoes do ultimo
            auxiliar.setProximo(null); // remove as informacoes do ultimo
        }
    }

    public No noPosicao(int info){
        No auxiliar = primeiro;
        while(auxiliar.getInformacao() != info){
            auxiliar = auxiliar.getProximo();
        }
        No noBusca = auxiliar;
        return noBusca;
    }

    public void insereDepois(No noBusca, int info){
        No auxiliar = primeiro;
        No anterior = new No();
        No novo = new No();
        if(auxiliar == noBusca){
            anterior.setProximo(noBusca);
            novo.setInfo(info);
            novo.setProximo(auxiliar);
        }else{
            while(auxiliar != noBusca){
                anterior = auxiliar;
                auxiliar = auxiliar.getProximo();
            }
        }
    }
    public void mostrar(){
        if(primeiro == null){ // evita que mostre null quanto a lista esta vazia
            System.out.println("Lista vazia");
        } else{
            No auxiliar = primeiro;
            while(auxiliar != null && primeiro.getInformacao() != null){
                System.out.print(auxiliar.getInformacao() + ", ");
                auxiliar = auxiliar.getProximo();
            }
        }
    }
}
