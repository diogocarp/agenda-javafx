package agenda.senai.model;

import java.time.LocalDate;

public class Tarefa {

	private long id;
	private LocalDate dataCria��o;
	private LocalDate dataLimite;
	private LocalDate dataFinalizada;
	private String descricao;
	private String comentario;
	private StatusTarefa status;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public LocalDate getDataCria��o() {
		return dataCria��o;
	}
	public void setDataCria��o(LocalDate dataCria��o) {
		this.dataCria��o = dataCria��o;
	}
	public LocalDate getDataLimite() {
		return dataLimite;
	}
	public void setDataLimite(LocalDate dataLimite) {
		this.dataLimite = dataLimite;
	}
	public LocalDate getDataFinalizada() {
		return dataFinalizada;
	}
	public void setDataFinalizada(LocalDate dataFinalizada) {
		this.dataFinalizada = dataFinalizada;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public StatusTarefa getStatus() {
		return status;
	}
	public void setStatus(StatusTarefa status) {
		this.status = status;
	}
	
	
		
}

