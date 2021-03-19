package sn.isi.traitement;

import sn.isi.entities.Zone;

import java.util.Scanner;

public class ImpZone implements IZone{
    @Override
    public Zone saisi() {
        Scanner scan = new Scanner(System.in);
        Zone Z = new Zone();
        System.out.println("---------------------zone---------------------------");
        System.out.println("Entrer l'identifiant du zone");
        Z.setId(scan.nextInt());
        System.out.println("Entrer le nom  du zone");
        Z.setNom(scan.nextLine());
        System.out.println("Entrer la latitude du zone");
        Z.setLatitude(scan.nextDouble());
        System.out.println("Entrer la longitude du zone");
        Z.setLongitude(scan.nextDouble());

        return Z;
    }

    @Override
    public void affiche(Zone z) {
        System.out.println(" l'identifiant du zone :"+z.getId());
        System.out.println(" le nom du zone :"+z.getNom());
        System.out.println(" la longitude du zone :"+z.getLatitude());
        System.out.println(" la latitude du zone :"+z.getLongitude());
    }
}
