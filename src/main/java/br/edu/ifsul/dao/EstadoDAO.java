package br.edu.ifsul.dao;

import br.edu.ifsul.converters.ConverterOrdem;
import br.edu.ifsul.modelo.Estado;
import java.io.Serializable;
import javax.ejb.Stateful;

/**
 *
 * @author Prof. Me. Jorge Luis Boeira Bavaresco
 * @email jorgebavaresco@ifsul.edu.br
 * @organization IFSUL - Campus Passo Fundo
 */
@Stateful
public class EstadoDAO<TIPO> extends DAOGenerico<Estado> implements Serializable{
    
    public EstadoDAO(){
        super();
        classePersistente = Estado.class;
        // lista de ordenações do dao
        listaOrdem.add(new Ordem("id", "ID","=")); // elemento 0
        listaOrdem.add(new Ordem("nome", "Nome", "like")); // elemento 1
        //definição da ordem atual
        ordemAtual = listaOrdem.get(1);
        converterOrdem = new ConverterOrdem();
        converterOrdem.setListaOrdem(listaOrdem);
    }

}
