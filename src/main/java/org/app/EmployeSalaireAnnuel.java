package org.app;

class EmployeSalaireAnnuel {
    private int idEmploye;
    private String nom;
    private String prenom;
    private double salaireAnnuel;

    public EmployeSalaireAnnuel(int idEmploye, String nom, String prenom, double salaireAnnuel) {
        this.idEmploye = idEmploye;
        this.nom = nom;
        this.prenom = prenom;
        this.salaireAnnuel = salaireAnnuel;
    }

    public int getIdEmploye() {
        return idEmploye;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public double getSalaireAnnuel() {
        return salaireAnnuel;
    }
}
