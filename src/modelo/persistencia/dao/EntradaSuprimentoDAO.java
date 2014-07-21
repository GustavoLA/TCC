/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.persistencia.dao;

import java.util.List;
import modelo.negocio.EntradaSuprimento;
import modelo.negocio.Suprimento;

/**
 *
 * @author GUSTAVO
 */
public interface EntradaSuprimentoDAO extends DAO<EntradaSuprimento, Integer> {

        List<EntradaSuprimento> getBySuprimento(Suprimento c);

}
