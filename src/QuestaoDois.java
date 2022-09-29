import java.util.Scanner;

public class QuestaoDois {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int resultado=0;
        int PontosVitoria=0;
        int PontosEmpate=0;
        int golsFeitos=0;
        int golsS=0;
        int saldoDeGols=0;
        int pontosTotais=0;
        System.out.println("Digite 3 para vitória e 1 para empate dos 3 jogos do Brasil");
        for(int i=0; i<3;i++){
            resultado=scan.nextInt();
            if(resultado==3){
                PontosVitoria=PontosVitoria+3;
            }
            if(resultado==1){
                PontosEmpate=PontosEmpate+1;
            }
        }
            pontosTotais=PontosVitoria+PontosEmpate;
        System.out.println("Digite a quantidade de gols feitos e sofridos em cada partida pelo Brasil");
        for(int i=0; i<3;i++){
            System.out.println("Partida "+i);
            System.out.println("Gols feitos: ");
            int gols=scan.nextInt();
            golsFeitos=golsFeitos+gols;
            System.out.println("Gols sofridos:");
            int golsSofridos=scan.nextInt();
            golsS=golsS+golsSofridos;
        }
        saldoDeGols=golsFeitos-golsS;
        System.out.println("Pontuação do Brasil: "+ pontosTotais);
        System.out.println("Seu saldo de gols: "+saldoDeGols);

    }
}