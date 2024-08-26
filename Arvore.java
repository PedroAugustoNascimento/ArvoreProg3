public class Arvore {
    No raiz;

    public Arvore() {
        raiz = null;
    }

    /*
     * public boolean vazia() {
     * if (raiz == null) {
     * return true;
     * } else {
     * return false;
     * }
     * }
     */

    private No inserirNova(No novo, No atual) {
        if (atual == null) {
            return novo;
        } else {
            if (atual.valor > novo.valor) {
                atual.direita = inserirNova(novo, atual.direita);
            }
            if (atual.valor < novo.valor) {
                atual.esquerda = inserirNova(novo, atual.esquerda);
            }
            return atual;
        }
    }

    public void inserir(No novo) {
        raiz = inserirNova(novo, raiz);
    }

    private void preOrdem(No atual) { // raiz esquerda direita
        if (atual != null) {
            System.out.println("Elemento: " + atual.valor);
            preOrdem(atual.esquerda);
            preOrdem(atual.direita);
        }
    }

    private void posOrdem(No atual) { // esquerda direita raiz
        if (atual != null) {
            preOrdem(atual.esquerda);
            preOrdem(atual.direita);
            System.out.println("Elemento: " + atual.valor);
        }
    }

    private void emOrdem(No atual) { // esquerda raiz direita
        if (atual != null) {
            emOrdem(atual.esquerda);
            System.out.println("Elemento: " + atual.valor);
            emOrdem(atual.direita);
        }
    }

    public void emordem() {
        emOrdem(raiz);
    }

    public void posordem() {
        posOrdem(raiz);
    }

    public void preordem() {
        preOrdem(raiz);
    }

    private No encontrarElemento(No atual, int valor) {
        if (atual == null) {
            return null;
        }
        if (valor > atual.valor) {
            if (atual.direita != null) {
                if (atual.direita.valor == valor) {
                    return atual;
                }
            } else {
                if (atual.esquerda != null){
                    if (atual.esquerda.valor == valor) {
                        return atual;
                    }
                } 
            }
            if (atual.valor < valor) {
                return encontrarElemento(atual.direita, valor);
            }
            if (atual.valor > valor) {
                return encontrarElemento(atual.esquerda, valor);
            }

        }
        return atual;
    }

    private boolean removerElemento(int valor){
        if (raiz == null){
            return false;
        } else {
            No pai;
            No filho;
            if (raiz.valor == valor){
                pai = raiz;
                filho = raiz;
                
            } else {
                pai = encontrarElemento(raiz, valor);
                if (filho.direita == null && filho.esquerda == null){
                    if (pai.valor > valor){
                        pai.direita = null;
                        return true;
                    }
                    if (pai.valor < valor){
                        pai.esquerda = null;
                        return true;
                    }
                }
            }
        }
        return false;
    }

}
