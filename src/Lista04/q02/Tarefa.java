package Lista04.q02;

import java.util.GregorianCalendar;

public class Tarefa {
	
	private String descricao;
	private GregorianCalendar data;
	private boolean status;
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	public GregorianCalendar getData() {
		return data;
	}
	public void setData(GregorianCalendar data) {
		this.data = data;
	}
	

	
	
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	public Tarefa(String descricao, GregorianCalendar data, boolean status) {
		this.descricao = descricao;
		this.data = data;
		this.status = status;
	}
	
	public Tarefa(String descricao, GregorianCalendar data) {
		this.descricao = descricao;
		this.data = data;
		this.status = false;
	}
}
