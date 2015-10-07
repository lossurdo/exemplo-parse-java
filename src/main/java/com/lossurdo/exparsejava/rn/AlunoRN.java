package com.lossurdo.exparsejava.rn;

import com.lossurdo.exparsejava.bd.AlunoBD;
import com.lossurdo.exparsejava.bean.Aluno;

/**
 *
 * @author lossurdo
 */
public class AlunoRN {

    private AlunoBD alunoBD;

    public AlunoRN() {
        alunoBD = new AlunoBD();
    }

    public void salvar(Aluno aluno) {
        alunoBD.salvar(aluno);
    }

}
