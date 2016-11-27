package edu.ensa.fly.beans;
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
}
