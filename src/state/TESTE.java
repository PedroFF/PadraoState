/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author ice
 */
public class TESTE {

    public static void main(String[] args) {
        Aluno Pedro = new Aluno();
        System.out.println(Pedro.getEstado().getNomeEstado());
        Pedro.trancar();
        System.out.println(Pedro.getEstado().getNomeEstado());
        Pedro.matricular();
        System.out.println(Pedro.getEstado().getNomeEstado());
        Pedro.formar();
        System.out.println(Pedro.getEstado().getNomeEstado());
    }
}
