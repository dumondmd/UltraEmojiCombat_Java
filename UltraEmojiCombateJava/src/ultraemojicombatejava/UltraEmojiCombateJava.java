/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultraemojicombatejava;

/**
 *
 * @author dumon
 */
public class UltraEmojiCombateJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("Alex", "Brasilia", 34, (float) 1.70, (float) 60.9, 1, 1, 1);
        l[1] = new Lutador("Teste", "Brasilia", 18, (float) 1.70, (float) 68.9, 1, 1, 1);
        l[2] = new Lutador("eleno", "Brasilia", 40, (float) 1.70, (float) 70.9, 1, 1, 1);
        l[3] = new Lutador("Digo", "Brasilia", 35, (float) 1.70, (float) 80.9, 1, 1, 1);
        l[4] = new Lutador("joe", "Brasilia", 55, (float) 1.70, (float) 98.9, 1, 1, 1);
        l[5] = new Lutador("Roi", "Brasilia", 26, (float) 1.70, (float) 58.9, 1, 1, 1);

        for (int i = 0; i < l.length; i++) {
            l[i].apresentar();

        }

    }

}
