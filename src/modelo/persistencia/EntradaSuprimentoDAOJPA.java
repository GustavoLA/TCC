/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.persistencia;

import java.util.List;
import modelo.negocio.EntradaSuprimento;
import modelo.negocio.Suprimento;
import modelo.persistencia.dao.EntradaSuprimentoDAO;

/**
 *
 * @author GUSTAVO
 */
public class EntradaSuprimentoDAOJPA extends DAOJPA<EntradaSuprimento, Integer> implements EntradaSuprimentoDAO {

    @Override
    public List<EntradaSuprimento> getBySuprimento(Suprimento s) {
        return getEntityManager().createQuery("select x from EntradaSuprimento x where x.suprimento.codigo = " + s.getCodigo()).getResultList();

    }
}
