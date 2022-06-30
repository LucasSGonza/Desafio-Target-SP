
public class Questao4 {

    public static void main(String[] args) {

        double faturamentoSP = 67836.43;
        double faturamentoRJ = 36678.66;
        double faturamentoMG = 29229.88;
        double faturamentoES = 27165.48;
        double faturamentoOutros = 19849.53;

        double somaTotal = faturamentoES + faturamentoSP + faturamentoMG + faturamentoRJ + faturamentoOutros;
        System.out.println(String.format("O valor total mensal da distribuidora foi igual a: R$ %.2f", somaTotal));

        double percentualSP = (faturamentoSP * 100) / somaTotal;
        double percentualRJ = (faturamentoRJ * 100) / somaTotal;
        double percentualMG = (faturamentoMG * 100) / somaTotal;
        double percentualES = (faturamentoES * 100) / somaTotal;
        double percentualOutros = (faturamentoOutros * 100) / somaTotal;

        System.out.println(String.format("Percentual de faturamento de cada distribuidora:\n"
                + "SP: %.2f%%\n"
                + "RJ: %.2f%%\n"
                + "MG: %.2f%%\n"
                + "ES: %.2f%%\n"
                + "Outros: %.2f%%\n", percentualSP, percentualRJ, percentualMG, percentualES, percentualOutros));

    }
}
