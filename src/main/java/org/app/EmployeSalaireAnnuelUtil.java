package org.app;

import java.util.ArrayList;
import java.util.List;

public class EmployeSalaireAnnuelUtil {

    static List<EmployeSalaireAnnuel> constructEmployeSalaireAnnuelList(List<Employe> employes, List<Salaire> salaires) {
        List<EmployeSalaireAnnuel> employeSalaireAnnuelList = new ArrayList<>();

        for (Employe employe : employes) {
            int employeId = employe.getIdEmploye();
            String nom = employe.getNom();
            String prenom = employe.getPrenom();

            List<Salaire> employeSalaires = new ArrayList<>();

            for (Salaire salaire : salaires) {
                if (salaire.getIdEmploye() == employeId) {
                    employeSalaires.add(salaire);
                }
            }

            double salaireAnnuel = calculateSalaireAnnuel(employeSalaires);

            EmployeSalaireAnnuel employeSalaireAnnuel = new EmployeSalaireAnnuel(employeId, nom, prenom, salaireAnnuel);
            employeSalaireAnnuelList.add(employeSalaireAnnuel);
        }

        return employeSalaireAnnuelList;
    }


    private static double calculateSalaireAnnuel(List<Salaire> salaires) {
        double totalSalaireMensuel = 0;

        for (Salaire salaire : salaires) {
            totalSalaireMensuel += salaire.getSalaireMensuel();
        }

        return totalSalaireMensuel * 12;
    }

    static void displayEmployeSalaireAnnuelList(List<EmployeSalaireAnnuel> employeSalaireAnnuelList) {
        for (EmployeSalaireAnnuel employeSalaireAnnuel : employeSalaireAnnuelList) {
            System.out.println("ID: " + employeSalaireAnnuel.getIdEmploye());
            System.out.println("Nom: " + employeSalaireAnnuel.getNom());
            System.out.println("Prénom: " + employeSalaireAnnuel.getPrenom());
            System.out.println("Salaire Annuel: " + employeSalaireAnnuel.getSalaireAnnuel());
            System.out.println("------------------------");
        }
    }

}
