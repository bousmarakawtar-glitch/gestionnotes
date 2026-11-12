public class GestionNotes {

    public static double calculerMoyenne(double[] notes) {
        double somme = 0;
        for (double n : notes) {
            somme += n;
        }
        return somme / notes.length;
    }

    public static void main(String[] args) {
        double[] notes = {12, 15.5, 9, 18};

        System.out.println("Moyenne : " + calculerMoyenne(notes));
    }
}
