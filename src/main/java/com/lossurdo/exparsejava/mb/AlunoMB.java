package com.lossurdo.exparsejava.mb;

import com.lossurdo.exparsejava.bean.Aluno;
import com.lossurdo.exparsejava.rn.AlunoRN;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author lossurdo
 */
@ManagedBean
@RequestScoped
public class AlunoMB {
    
    private Aluno aluno;
    private AlunoRN alunoRN;

    public AlunoMB() {
        aluno = new Aluno();
        alunoRN = new AlunoRN();
    }

    public String salvar() {
        alunoRN.salvar(aluno);        
        return "index";
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    
}
