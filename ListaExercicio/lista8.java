// A importancia de R$ 780.000, 00 sera dividida entre tres ganhadores de um concurso. Sendo que da
// quantia total: O primeiro ganhador recebera 46%; O segundo receber  a 32%; O terceiro receber a o ´
// restante; Calcule e imprima a quantia ganha por cada um dos ganhadores.

package listaExercicio;
public class lista8 {
    public static void main(String[] args) {
        float primeiroGanhador, segundoGanhador, terceiroGanhador;
        int montante = 780000;
        primeiroGanhador = montante * 46 / 100;
        segundoGanhador = montante  * 32 / 100;
        terceiroGanhador = montante *  22 / 100;
        System.out.println("O primeiro ganhador receberá: " + primeiroGanhador);
        System.out.println("O segundo ganhador receberá: " + segundoGanhador );
        System.out.println("E o terceiro ganhador receberá " + terceiroGanhador);
    }
}

// 46 % == 780.000 * 46 / 100 = 358 800
// 32 % == 780.000 * 32 / 100 = 249600  
// 22 % == 780.000 * 22 / 100 = 171 600