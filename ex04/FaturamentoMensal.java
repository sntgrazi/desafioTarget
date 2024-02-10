package ex04;

public class FaturamentoMensal {
    public static void main(String[] args) {
        
        double faturamentoSP = 67836.43;
        double faturamentoRJ = 36678.66;
        double faturamentoMG = 29229.88;
        double faturamentoES = 27165.48;
        double faturamentoOutros = 19849.53;

        double totalMensal = faturamentoSP + faturamentoRJ + faturamentoMG + faturamentoES + faturamentoOutros;

        double percentualSP = (faturamentoSP / totalMensal) * 100;
        double percentualRJ = (faturamentoRJ / totalMensal) * 100;
        double percentualMG = (faturamentoMG / totalMensal) * 100;
        double percentualES = (faturamentoES / totalMensal) * 100;
        double percentualOutros = (faturamentoOutros / totalMensal) * 100;

        System.out.println("Percentual do faturamento mensal por estado:");
        System.out.printf("SP: %.2f%%\n", percentualSP);
        System.out.printf("RJ: %.2f%%\n", percentualRJ);
        System.out.printf("MG: %.2f%%\n", percentualMG);
        System.out.printf("ES: %.2f%%\n", percentualES);
        System.out.printf("Outros: %.2f%%\n", percentualOutros);
    }
}
