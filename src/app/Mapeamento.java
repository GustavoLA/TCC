package app;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Mapeamento {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjetoTCCPU");
       
    }

}
