package main.java.edu.ensa.fly.beans;
public class Client{
  private String id_clt;
  private String nom_clt;
  private String prenom_clt;
  public Client(){
  }
  public Client(String id, String nom, String prenom){
    this.id_clt=id;
    this.nom_clt=nom;
    this.prenom_clt=prenom;
  }
public String getId_clt() {
	return id_clt;
}
public void setId_clt(String id_clt) {
	this.id_clt = id_clt;
}
public String getNom_clt() {
	return nom_clt;
}
public void setNom_clt(String nom_clt) {
	this.nom_clt = nom_clt;
}
public String getPrenom_clt() {
	return prenom_clt;
}
public void setPrenom_clt(String prenom_clt) {
	this.prenom_clt = prenom_clt;
}
}
