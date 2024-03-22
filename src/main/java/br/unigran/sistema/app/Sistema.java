
package br.unigran.sistema.app;

import br.unigran.sistema.app.persistencia.Dados;
import br.unigran.sistema.model.Pessoa.Pessoa;


public class Sistema {

    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("Henrique");
        Dados dados = new Dados();
        dados.salvar(p);
    }
}
