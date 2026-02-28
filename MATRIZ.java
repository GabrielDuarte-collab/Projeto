public class MATRIZ {
    public static void main (String[] args){
        //Declaração de variaveis
        double temperaturaMediaAnoAtual = 0;

        double temperaturaMediaAnoAnterior = 0;

       

        String[] meses = {
            "Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"
        };

        double[] tempAnoAtual = {25.0, 26.5, 28.0, 30.0, 32.5, 35.0, 36.0, 35.5, 33.0, 30.0, 28.0, 26.0};
        double[] tempAnoAnterior = {24.0, 25.5, 27.0, 29.0, 31.5, 34.0, 35.0, 34.5, 32.0, 29.0, 27.0, 25.0};

         double maiorTemperatura = tempAnoAtual[0];

         double menorTemperatura = tempAnoAtual[0];

        //Calculando temperatura media anual do ano atual
        double somaAnoAtual = 0;

        double somaAnoAnterior = 0;

        for (int i = 0; i < 12; i++) {
             somaAnoAtual += tempAnoAtual[i];

             somaAnoAnterior += tempAnoAnterior[i];



             temperaturaMediaAnoAnterior += tempAnoAnterior[i] / 12;

             if (tempAnoAtual[i] > maiorTemperatura) {
                
                maiorTemperatura = tempAnoAtual[i];
             }
             if (tempAnoAtual[i] < menorTemperatura) {

                menorTemperatura = tempAnoAtual[i];
             }

        }


        System.out.println("--- ANALISE DE TEMPERATURA MENSAIS ---\n");

        System.out.println("temperatura media anual (ano atual): " + String.format("%.2f", temperaturaMediaAnoAtual) + "C");

        System.out.println("temperatura media anual (ano anterior): " + String.format("%.2f", temperaturaMediaAnoAnterior) + "C\n");

         System.out.println("temperatura media anual (ano atual): " + String.format("%.2f", maiorTemperatura) + "C");

         System.out.println("temperatura media anual (ano Anterior): " + String.format("%.2f", menorTemperatura) + "C");

    }
}