package util;

import java.text.DecimalFormat;

public class Corretores {

    public static String converterParaJava(String data) {

        return data.substring(8, 10) + "/" + data.substring(5, 7) + "/" + data.substring(0, 4);
    }

    public static String converterParaSql(String data) {

        return data.substring(6, 10) + "-" + data.substring(3, 5) + "-" + data.substring(0, 2);
    }

    public static double formatarValor(String valor) {
        try {
            String novoValor = new DecimalFormat("#,##0.00").format(valor);
            return Double.parseDouble(novoValor);
        } catch (NumberFormatException e) {
            throw new RuntimeException("Tá dando erro, pai! kkkk" + e);
        }
    }

    public static double formatarValorLista(String valor) {
        String novoValor = new DecimalFormat("#,##0.00").format(valor);
        return Double.parseDouble(novoValor);
    }
}
