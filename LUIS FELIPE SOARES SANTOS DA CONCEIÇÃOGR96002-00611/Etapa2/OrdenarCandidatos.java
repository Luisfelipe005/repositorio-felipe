package Etapa2;
public class OrdenarCandidatos {

    public static void ordenaCandidatosPorVotos(Candidato[] candidatos){
    for (int i = 1; i < candidatos.length; i++){
        int j = i;
        int b = candidatos[i].getIntencoesVotos();
        while ((j < 0) && (candidatos[j-1].getIntencoesVotos() > b)){
            candidatos[j] = candidatos[j-1];
            j--;
        }
        int c = candidatos[j].getIntencoesVotos();
        c = b;
    }
    }
    public static void ordenaCandidatosPorNome(Candidato[] candidatos){
    int i = candidatos.length - 1;
    while (i > 0){
        int lastFlipped = 0;
        for (int j = 0; j < i; j++){
            if (candidatos[j].getNome().compareTo(candidatos[j+1].getNome()) > 0){
                Candidato t = candidatos[j];
                candidatos[j] = candidatos[j +1];
                candidatos[j+1] = t;
                lastFlipped = j;
            }

        }
        i = lastFlipped;

    }
    }
    public static void ordenaCandidatosPorPartido(Candidato[] candidatos){
    int min = 0;
    for (int i = 0; i < candidatos.length -1; i++){
        min = i;
        for (int j = i +1; j < candidatos.length; j++){
            if (candidatos[j].getPartido().compareTo(candidatos[min].getPartido()) > 0){
                min = j;
                Candidato t = candidatos[j];
                candidatos[i] = candidatos[min];
                candidatos[min] = t;
            }
        }
    }
    }
    public static int pesquisaBinariaCandidatos(Candidato[] candidatos, String nome){
        int inf = 0;
        int sup = candidatos.length;
        while (inf <= sup){
            int med = (inf + sup) / 2;
            if (nome.compareTo(candidatos[med].getNome()) == 0) {
                System.out.println("Posição: " + med + " | " +  candidatos[med]);
                return med;
            }
            else if (nome.compareTo(candidatos[med].getNome()) >= 1)
                inf = med +1;
            else
                sup = med -1;
        }
        return -1;
    }
}
