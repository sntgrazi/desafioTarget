import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.text.DecimalFormat;

public class FaturamentoDiario {

    public static void main(String[] args) {

        JSONArray faturamentoDiario = lerJSON("ex03/dados.json");

        if (faturamentoDiario != null) {
            calcularEExibirResultados(faturamentoDiario);
        }
    }

    private static JSONArray lerJSON(String caminhoArquivo) {
        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(new FileReader(caminhoArquivo));
            return (JSONArray) obj;
        } catch (ParseException pe) {
            pe.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    private static void calcularEExibirResultados(JSONArray faturamentoMensal) {
        double somaFaturamento = 0;
        double mediaMensal = 0;
        double menorValor = Double.MAX_VALUE;
        double maiorValor = Double.MIN_VALUE;
        int diasComFaturamento = 0;

        for (Object obj : faturamentoMensal) {
            JSONObject diaFaturamento = (JSONObject) obj;

            double valor = (double) diaFaturamento.get("valor");

            if (valor > 0) {
                somaFaturamento += valor;
                diasComFaturamento++;

                if (valor > maiorValor) {
                    maiorValor = valor;
                }

                if (valor < menorValor) {
                    menorValor = valor;
                }
            }
        }

   
        if (diasComFaturamento > 0) {
            mediaMensal = somaFaturamento / diasComFaturamento;
        }

   
        DecimalFormat df = new DecimalFormat("#,##0.00");
        String menorValorFormatado = df.format(menorValor);
        String maiorValorFormatado = df.format(maiorValor);
        String mediaMensalFormatada = df.format(mediaMensal);


        System.out.println("Menor valor de faturamento: " + menorValorFormatado);
        System.out.println("Maior valor de faturamento: " + maiorValorFormatado);
        System.out.println("Número de dias com faturamento acima da média: " + diasComFaturamento);
        System.out.println("Média mensal de faturamento: " + mediaMensalFormatada);
    }
}
