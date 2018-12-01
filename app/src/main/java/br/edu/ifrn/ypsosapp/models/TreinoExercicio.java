package br.edu.ifrn.ypsosapp.models;


import java.util.Date;


public class TreinoExercicio {
    
  	private int repeticoes;
  	private int series;
  	private int carga;
  	private String observacoes;
  	private Treino idTreino;
  	private Exercicio exercicio;
  	private Date dataTreino;


	public TreinoExercicio() {
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

	public Treino getIdTreino() {
		return idTreino;
	}

	public void setIdTreino(Treino idTreino) {
		this.idTreino = idTreino;
	}

	public Exercicio getExercicio() {
		return exercicio;
	}

	public void setExercicio(Exercicio exercicio) {
		this.exercicio = exercicio;
	}

	public Date getDataTreino() {
		return dataTreino;
	}

	public void setDataTreino(Date dataTreino) {
		this.dataTreino = dataTreino;
	}
}
