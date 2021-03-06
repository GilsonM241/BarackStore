package org.gestion.barackstore.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

public class User implements Serializable{
	  private long IdUser;
	  private String Nom;
	  private String Prenom;
	  private String Fonction;
	  private String Login;
	  private String PassWord;
	  private String DateOperation;
	  private boolean Etat= true ;
	  private Long IdRole;
	  private Role Roles;
	  private Collection<Mouvement> Mouvements;
	public long getIdUser() {
		return IdUser;
	}
	public void setIdUser(long idUser) {
		IdUser = idUser;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	public String getFonction() {
		return Fonction;
	}
	public void setFonction(String fonction) {
		Fonction = fonction;
	}
	public String getLogin() {
		return Login;
	}
	public void setLogin(String login) {
		Login = login;
	}
	public String getPassWord() {
		return PassWord;
	}
	public void setPassWord(String passWord) {
		PassWord = passWord;
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
	public Long getIdRole() {
		return IdRole;
	}
	public void setIdRole(Long idRole) {
		IdRole = idRole;
	}
	public Role getRoles() {
		return Roles;
	}
	public void setRoles(Role roles) {
		Roles = roles;
	}
	public Collection<Mouvement> getMouvements() {
		return Mouvements;
	}
	public void setMouvements(Collection<Mouvement> mouvements) {
		Mouvements = mouvements;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String nom, String prenom, String fonction, String login, String passWord, String dateOperation,
			boolean etat) {
		super();
		Nom = nom;
		Prenom = prenom;
		Fonction = fonction;
		Login = login;
		PassWord = passWord;
		DateOperation = dateOperation;
		Etat = etat;
	}
	@Override
	public String toString() {
		return "User [IdUser=" + IdUser + ", Nom=" + Nom + ", Prenom=" + Prenom + ", Fonction=" + Fonction + ", Login="
				+ Login + ", PassWord=" + PassWord + ", DateOperation=" + DateOperation + ", Etat=" + Etat + ", IdRole="
				+ IdRole + ", Roles=" + Roles + ", Mouvements=" + Mouvements + "]";
	}
		  
}
