public class GestionNotes {

    public static double calculerMoyenne(double[] notes) {
        double somme = 0;
        for (double n : notes) {
            somme += n;
        }
        return somme / notes.length;
    }
    public static void afficherNotes(double[] notes) {
        for (double n : notes) {
            System.out.println("Note : " + n);
        }
    }
    public static double noteMax(double[] notes) {
        double max = notes[0];
        for (double n : notes) {
            if (n > max) max = n;
        }
        return max;
    }
    public static void main(String[] args) {
        double[] notes = {12, 15.5, 9, 18};

        System.out.println("Moyenne : " + calculerMoyenne(notes));
    }
}
    }
