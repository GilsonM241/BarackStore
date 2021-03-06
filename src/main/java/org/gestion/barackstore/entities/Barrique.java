package org.gestion.barackstore.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

public class Barrique implements Serializable{
	   private long IdBarique;
	   private String CodeBarre;
	   private int XLigne; 
	   private int YColone;
	   private String  ZEtiquette;
	   private String DateFabricaVin ; 
	   private String DateMaturaVin;
	   private String DateOperation;
	   private boolean Etat= true;
	   private Long IdEtiquette;
	   private Long IdRack;
	   private Rack Racks;
	   private Etiquette Etiquettes;
	   private Collection<Mouvement>Mouvements;
	public long getIdBarique() {
		return IdBarique;
	}
	public void setIdBarique(long idBarique) {
		IdBarique = idBarique;
	}
	public String getCodeBarre() {
		return CodeBarre;
	}
	public void setCodeBarre(String codeBarre) {
		CodeBarre = codeBarre;
	}
	public int getXLigne() {
		return XLigne;
	}
	public void setXLigne(int xLigne) {
		XLigne = xLigne;
	}
	public int getYColone() {
		return YColone;
	}
	public void setYColone(int yColone) {
		YColone = yColone;
	}
	public String getZEtiquette() {
		return ZEtiquette;
	}
	public void setZEtiquette(String zEtiquette) {
		ZEtiquette = zEtiquette;
	}
	public String getDateFabricaVin() {
		return DateFabricaVin;
	}
	public void setDateFabricaVin(String dateFabricaVin) {
		DateFabricaVin = dateFabricaVin;
	}
	public String getDateMaturaVin() {
		return DateMaturaVin;
	}
	public void setDateMaturaVin(String dateMaturaVin) {
		DateMaturaVin = dateMaturaVin;
	}
	public String getDateOperation() {
		return DateOperation;
	}
	public void setDateOperation(String dateOperation) {
		DateOperation = dateOperation;
	}
	public boolean isEtat() {
		return Etat;
	}
	public void setEtat(boolean etat) {
		Etat = etat;
	}
	public Long getIdEtiquette() {
		return IdEtiquette;
	}
	public void setIdEtiquette(Long idEtiquette) {
		IdEtiquette = idEtiquette;
	}
	public Long getIdRack() {
		return IdRack;
	}
	public void setIdRack(Long idRack) {
		IdRack = idRack;
	}
	public Rack getRacks() {
		return Racks;
	}
	public void setRacks(Rack racks) {
		Racks = racks;
	}
	public Etiquette getEtiquettes() {
		return Etiquettes;
	}
	public void setEtiquettes(Etiquette etiquettes) {
		Etiquettes = etiquettes;
	}
	public Collection<Mouvement> getMouvements() {
		return Mouvements;
	}
	public void setMouvements(Collection<Mouvement> mouvements) {
		Mouvements = mouvements;
	}
	public Barrique() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Barrique(String codeBarre, int xLigne, int yColone, String zEtiquette, String dateFabricaVin,
			String dateMaturaVin, String dateOperation, boolean etat) {
		super();
		CodeBarre = codeBarre;
		XLigne = xLigne;
		YColone = yColone;
		ZEtiquette = zEtiquette;
		DateFabricaVin = dateFabricaVin;
		DateMaturaVin = dateMaturaVin;
		DateOperation = dateOperation;
		Etat = etat;
	}
	@Override
	public String toString() {
		return "Barrique [IdBarique=" + IdBarique + ", CodeBarre=" + CodeBarre + ", XLigne=" + XLigne + ", YColone="
				+ YColone + ", ZEtiquette=" + ZEtiquette + ", DateFabricaVin=" + DateFabricaVin + ", DateMaturaVin="
				+ DateMaturaVin + ", DateOperation=" + DateOperation + ", Etat=" + Etat + ", IdEtiquette=" + IdEtiquette
				+ ", IdRack=" + IdRack + ", Racks=" + Racks + ", Etiquettes=" + Etiquettes + ", Mouvements="
				+ Mouvements + "]";
	}
	
	
}
