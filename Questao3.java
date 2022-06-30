import java.util.Scanner;
import java.util.ArrayList;

public class Questao3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<Double> faturamento = new ArrayList(); //ArrayList com os valores de faturamento diário
        ArrayList<Integer> diasAcimaFaturamento = new ArrayList(); //ArrayList para saber os dias em que o faturamento diário foi superior ao mensal

        int diasMes = 30; //Dias do mês
        int diasUteis = 0;//para saber quais dias o faturamento foi maior que 0
        double lucroDia[] = new double[diasMes]; //Variável para armazenar o valor do faturamento do dia (para posteriormente add na ArrayList "faturamento")
        double faturamentoMensal = 0; //Variável para armazenar o valor do faturamento mensal (para posteriormente poder fazer a média de faturamento no mês)

        int diaMenorFaturamento = 0; //Para saber o dia em que houve o menor faturamento       
        
        int diaMaiorFaturamento = 0; //Para saber o dia em que houve o maior faturamento
        double maiorFaturamento = 0;

        for (int i = 0; i < diasMes; i++) { //repetição para gradativamente adicionar os valores do faturamento diário

            System.out.println("Digite o faturamento do dia " + (i + 1));
            lucroDia[i] = scan.nextDouble();
            faturamento.add(lucroDia[i]);
            
            if (lucroDia[i] > 0){ //para o cálculo da média dos dias em que teve faturamento (faturamento = 0 não deve ser incluído)
                faturamentoMensal = faturamentoMensal + lucroDia[i];
                diasUteis++;
            }
            
            if (i == 0) { //para o faturamento do dia 1 (onde não há comparação com outro faturamento)
                diaMaiorFaturamento = i;
                maiorFaturamento = lucroDia[i];
            } else if (lucroDia[i] > 0 & lucroDia[i] < maiorFaturamento) { //para comparar o faturamento entre os dias (para saber qual o menor e qual o maior)
                //menorFaturamento = lucroDia[i];
                diaMenorFaturamento = i;
            } else if (lucroDia[i] > 0 & lucroDia[i] > maiorFaturamento) {
                //maiorFaturamento = lucroDia[i];
                diaMaiorFaturamento = i;
                maiorFaturamento = lucroDia[i];
            }
            
        }

        double mediaFaturamento = faturamentoMensal / diasUteis; //cálculo da média de faturamento mensal

        for (int i = 0; i < diasMes; i++) { //repetição para saber os dias em que o faturamento diário foi superior à media de faturamento no mês
            if (lucroDia[i] != 0 & lucroDia[i] > mediaFaturamento) {
                diasAcimaFaturamento.add(i + 1);
            }
        }
        
        System.out.println("\n");
        
        System.out.println("Faturamento Diario: ");
        for (int i = 0; i < faturamento.size(); i++){ //repetição para mostrar o faturamento de cada mês
            System.out.println("Dia " + (i + 1) + ": " + faturamento.get(i));
        }
        
        System.out.println("\n");
        
        System.out.println("O menor faturamento foi o do dia " + (diaMenorFaturamento + 1) + " e foi igual a: " + faturamento.get(diaMenorFaturamento));
        System.out.println("O maior faturamento foi o do dia " + (diaMaiorFaturamento + 1) + " e foi igual a: " + faturamento.get(diaMaiorFaturamento));
        System.out.println("O faturamento mensal foi igual a: " + faturamentoMensal);
        System.out.println(String.format("A media de faturamento do mes foi igual a: %.1f", mediaFaturamento));
        System.out.println("Dia(s) em que o faturamento diario foi maior que o faturamento mensal: " + diasAcimaFaturamento);

    }
}
