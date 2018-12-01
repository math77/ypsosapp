package br.edu.ifrn.ypsosapp.models;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class PlanoExercicio implements Serializable{

	private int repeticoes;
	private int series;
	private int carga;
	private String observacoes;
	private Plano idPlano;
	private Exercicio idExercicio;
	private String nomeExercicio;

	public PlanoExercicio(){  
		repeticoes = 12;
		series = 3;
		observacoes = "Preencher observação";
	}

    public int getRepeticoes() {
        return repeticoes;
    }

    public void setRepeticoes(int repeticoes) {
        this.repeticoes = repeticoes;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Plano getIdPlano() {
        return idPlano;
    }

    public void setIdPlano(Plano idPlano) {
        this.idPlano = idPlano;
    }

    public Exercicio getIdExercicio() {
        return idExercicio;
    }

    public void setIdExercicio(Exercicio idExercicio) {
        this.idExercicio = idExercicio;
    }

    public String getNomeExercicio() {
        return nomeExercicio;
    }

    public void setNomeExercicio(String nomeExercicio) {
        this.nomeExercicio = nomeExercicio;
    }
}
