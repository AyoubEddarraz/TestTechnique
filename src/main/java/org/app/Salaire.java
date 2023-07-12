package org.app;

class Salaire {
    private int idEmploye;
    private int annee;
    private int mois;
    private double salaireMensuel;

    public Salaire(int idEmploye, int annee, int mois, double salaireMensuel) {
        this.idEmploye = idEmploye;
        this.annee = annee;
        this.mois = mois;
        this.salaireMensuel = salaireMensuel;
    }

    public int getIdEmploye() {
        return idEmploye;
    }

    public int getAnnee() {
        return annee;
    }

    public int getMois() {
        return mois;
    }

    public double getSalaireMensuel() {
        return salaireMensuel;
    }
}