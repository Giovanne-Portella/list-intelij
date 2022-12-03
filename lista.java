public class lista {

    node inicio;
    node fim;
    int tamanho;

    public void inserirInicio(int info) {
        node no = new node();
        no.info = info;
        no.anterior = null;
        no.proximo = inicio;

        if (inicio != null) {
            inicio.anterior = no;
        }
        inicio = no;
        if (tamanho == 0) {
            fim = inicio;
        }
        tamanho++;
    }

    public String toString() {
        String str = "(" + tamanho + ") ";
        node local = inicio;
        while (local != null){
            str += local.info + " ";
            local = local.proximo;
        }
        return str;
    }
}
