package com.superheroes.web.jdbc;


//POJO - @Entity
public class Superhero {
	
	private int id;                                              // Unique identifier for each superhero
    private String secretIdentity; 			  // Secret identity of the superhero
    private String alterEgo;						  // Alter ego of the superhero
    private String superPower;				  // Superpower of the superhero
    
    //Constructor to create a new superhero with only secret identity, alter ego and superpower
	public Superhero(String secretIdentity, String alterEgo, String superPower) {
		this.secretIdentity = secretIdentity;
		this.alterEgo = alterEgo;
		this.superPower = superPower;
	}
	
	// Constructor to create a new superhero with id, secret identity, alter ego and superpower
	public Superhero(int id, String secretIdentity, String alterEgo, String superPower) {
		this.id = id;
		this.secretIdentity = secretIdentity;
		this.alterEgo = alterEgo;
		this.superPower = superPower;
	}

	// Getter and setter methods for the id of the superhero
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	// Getter and setter methods for the secret identity of the superhero
	public String getSecretIdentity() {
		return secretIdentity;
	}

	public void setSecretIdentity(String secretIdentity) {
		this.secretIdentity = secretIdentity;
	}
	
	// Getter and setter methods for the alter ego of the superhero
	public String getAlterEgo() {
		return alterEgo;
	}

	public void setAlterEgo(String alterEgo) {
		this.alterEgo = alterEgo;
	}
	
	// Getter and setter methods for the superpower of the superhero
	public String getSuperPower() {
		return superPower;
	}

	public void setSuperPower(String superPower) {
		this.superPower = superPower;
	}

	// Overriding the toString() method for the superhero class
	@Override
	public String toString() {
		return "Superhero [id=" + id + ", secretIdentity=" + secretIdentity + ", alterEgo=" + alterEgo + ", superPower="
				+ superPower + "]";
	}

}

