
//  Fac¸a um algoritmo utilizando o comando while que mostra uma contagem regressiva na tela, iniciando
// em 10 e terminando em 0. Mostrar uma mensagem “FIM!” apos a contagem.

public class lista3 {
    public static void main(String[] args) {
      int num=10, cont=0;
      while(cont<=10){
        System.out.println(num);
        num--; cont++;
      }
      System.out.println("FIM!");
}
}