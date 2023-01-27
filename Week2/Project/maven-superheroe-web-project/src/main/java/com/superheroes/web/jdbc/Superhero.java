package com.superheroes.web.jdbc;

//POJO - @Entity
public class Superhero {
	
	private int id;                                              // Unique identifier for each superhero
    private String secretIdentity; 			  // Secret identity of the superhero
    private String alterEgo;						  // Alter ego of the superhero
    private String superpower;				  // Superpower of the superhero
    
    
    //Constructor to create a new superhero with only secret identity, alter ego and superpower
	public Superhero(String secretIdentity, String alterEgo, String superpower) {
		this.secretIdentity = secretIdentity;
		this.alterEgo = alterEgo;
		this.superpower = superpower;
	}
	

	// Constructor to create a new superhero with id, secret identity, alter ego and superpower
	public Superhero(int id, String secretIdentity, String alterEgo, String superpower) {
		this.id = id;
		this.secretIdentity = secretIdentity;
		this.alterEgo = alterEgo;
		this.superpower = superpower;
	}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**
	 * @return the secretIdentity
	 */
	public String getSecretIdentity() {
		return secretIdentity;
	}


	/**
	 * @param secretIdentity the secretIdentity to set
	 */
	public void setSecretIdentity(String secretIdentity) {
		this.secretIdentity = secretIdentity;
	}


	/**
	 * @return the alterEgo
	 */
	public String getAlterEgo() {
		return alterEgo;
	}


	/**
	 * @param alterEgo the alterEgo to set
	 */
	public void setAlterEgo(String alterEgo) {
		this.alterEgo = alterEgo;
	}


	/**
	 * @return the superpower
	 */
	public String getSuperpower() {
		return superpower;
	}


	/**
	 * @param superpower the superpower to set
	 */
	public void setSuperpower(String superpower) {
		this.superpower = superpower;
	}


	@Override
	public String toString() {
		return "Superhero [id=" + id + ", secretIdentity=" + secretIdentity + ", alterEgo=" + alterEgo + ", superpower="
				+ superpower + "]";
	}


}

