package com.company;

import sn.isi.entities.Rn;
import sn.isi.traitement.IRn;
import sn.isi.traitement.ImpRn;

public class Main {

    public static void main(String[] args) {
	// write your code here
        IRn ir = new ImpRn();
        Rn rn = ir.saisi();
        ir.affiche(rn);
    }
}
