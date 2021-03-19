package sn.isi.traitement;

import sn.isi.entities.Rn;
import sn.isi.entities.Zone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ImpRn implements IRn{
    @Override
    public Rn saisi() {
        String rep= null;
        Rn rn = new Rn();
        Scanner scan = new Scanner(System.in);
        List <Zone> zones = new ArrayList<Zone>();
        System.out.println(" sais l' identifiant de la Rn");
        rn.setId(Integer.parseInt(scan.nextLine()));
        System.out.println(" sais la latitude de la Rn");
        rn.setLatitude(Double.parseDouble(scan.nextLine()));
        System.out.println(" sais la longitude de la Rn");
        rn.setLongitude(Double.parseDouble(scan.nextLine()));


        do {
            Zone zone = new Zone();
            IZone iz = new ImpZone();
            zone = iz.saisi();

          //  rn.getZones().add(new ImpZone().saisi());
            System.out.println(" voulez vous saisir");
            rep=scan.nextLine();
            zones.add(zone);

        }while(rep.equalsIgnoreCase("oui"));
        rn.setZones(zones);

        return rn;
    }

    @Override
    public void affiche(Rn rn) {
        System.out.println(" l'identifiant du zone :"+rn.getId());
        System.out.println(" le nom du zone :"+rn.getNom());
        System.out.println(" la longitude du zone :"+rn.getLatitude());
        System.out.println(" la latitude du zone :"+rn.getLongitude());

        for (Zone z : rn.getZones())
        {
            //IZone iz = new ImpZone();
            //iz.affiche(z);
            new ImpZone().affiche(z);
        }

    }
}
