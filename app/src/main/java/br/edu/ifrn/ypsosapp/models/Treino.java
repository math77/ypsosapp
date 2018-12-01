package br.edu.ifrn.ypsosapp.models;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Treino implements Serializable{
    
	private int idTreino;
    private String nomeTreino;
    private Aluno loginAluno;
    private Professor loginProfessor;
    private Date dataInicio;
    private Date dataFim;

	public Treino() {
	}

	public int getIdTreino() {
		return idTreino;
	}

	public void setIdTreino(int idTreino) {
		this.idTreino = idTreino;
	}

	public String getNomeTreino() {
		return nomeTreino;
	}

	public void setNomeTreino(String nomeTreino) {
		this.nomeTreino = nomeTreino;
	}

	public Aluno getLoginAluno() {
		return loginAluno;
	}

	public void setLoginAluno(Aluno loginAluno) {
		this.loginAluno = loginAluno;
	}

	public Professor getLoginProfessor() {
		return loginProfessor;
	}

	public void setLoginProfessor(Professor loginProfessor) {
		this.loginProfessor = loginProfessor;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}
}
