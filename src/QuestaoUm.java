import java.util.Scanner;

public class QuestaoUm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int candidatoX = 0;
        int candidatoY = 0;
        int candidatoZ = 0;
        int branco=0;
        int nulo = 0;
        for (long i = 0; i < 1500; i++) {
            int voto = scan.nextInt();
            if (voto == 111) {
                candidatoX = candidatoX + 1;
            } else if (voto == 222) {
                candidatoY = candidatoY + 1;
            } else if (voto == 333) {
                candidatoZ = candidatoZ + 1;

            }
            else if(voto==0){
                branco=branco+1;

            }
            else {
                nulo = nulo + 1;
            }

        }
        System.out.println("Quantidade de votos:");
        System.out.println("X= "+candidatoX);
        System.out.println("Y= "+candidatoY);
        System.out.println("Z= "+candidatoZ);
        System.out.println("Brancos= "+branco);
        System.out.println("Nulos= "+nulo);

    }
}
