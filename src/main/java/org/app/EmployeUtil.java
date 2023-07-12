package org.app;

import java.util.ArrayList;
import java.util.List;

public class EmployeUtil {

    List<Employe> generateEmployeesList() {

        List<Employe> employes = new ArrayList<>();

        employes.add(new Employe(1, "Ayoub", "Eddarraz"));
        employes.add(new Employe(2, "Imad", "Eddarraz"));
        employes.add(new Employe(3, "HAMID", "Ess"));
        employes.add(new Employe(4, "Yassine", "ESS"));

        return employes;

    }


}
