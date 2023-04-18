package com.onpe.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Total {

	@Id
	private int Kambio;
	private String Votok;
	private int FP;
	private String Votop;
	private int total;
	private String Participacion;
	private int Ausentes;
	private String TotalAusencia;
	private int ElectoresHabiles;
	private int TotalActas;
	private int Procesadas;
	private int Contabilizadas;
	
	public int getKambio() {
		return Kambio;
	}
	public void setKambio(int kambio) {
		Kambio = kambio;
	}
	public String getVotok() {
		return Votok;
	}
	public void setVotok(String votok) {
		Votok = votok;
	}
	public int getFP() {
		return FP;
	}
	public void setFP(int fP) {
		FP = fP;
	}
	public String getVotop() {
		return Votop;
	}
	public void setVotop(String votop) {
		Votop = votop;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getParticipacion() {
		return Participacion;
	}
	public void setParticipacion(String participacion) {
		Participacion = participacion;
	}
	public int getAusentes() {
		return Ausentes;
	}
	public void setAusentes(int ausentes) {
		Ausentes = ausentes;
	}
	public String getTotalAusencia() {
		return TotalAusencia;
	}
	public void setTotalAusencia(String totalAusencia) {
		TotalAusencia = totalAusencia;
	}
	public int getElectoresHabiles() {
		return ElectoresHabiles;
	}
	public void setElectoresHabiles(int electoresHabiles) {
		ElectoresHabiles = electoresHabiles;
	}
	public int getTotalActas() {
		return TotalActas;
	}
	public void setTotalActas(int totalActas) {
		TotalActas = totalActas;
	}
	public int getProcesadas() {
		return Procesadas;
	}
	public void setProcesadas(int procesadas) {
		Procesadas = procesadas;
	}
	public int getContabilizadas() {
		return Contabilizadas;
	}
	public void setContabilizadas(int contabilizadas) {
		Contabilizadas = contabilizadas;
	}
	
	
	
}
