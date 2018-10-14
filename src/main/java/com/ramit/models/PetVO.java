package com.ramit.models;

import org.springframework.util.StringUtils;

public class PetVO {

	private Integer petId;
	private String petName;
	private String ownerName;
	private String petType;
	private int petAge;
	
	public PetVO () {
		
	}
	
	public PetVO (String name) {
		this.petName = name;
	}
	
	public Integer getPetId() {
		return petId;
	}
	public void setPetId(Integer petId) {
		this.petId = petId;
	}
	public String getPetName() {
		return petName;
	}
	public void setPetName(String petName) {
		this.petName = petName;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getPetType() {
		return petType;
	}
	public void setPetType(String petType) {
		this.petType = petType;
	}
	public int getPetAge() {
		return petAge;
	}
	public void setPetAge(int petAge) {
		this.petAge = petAge;
	}
	
	@Override
	public String toString() {
		return "PetVO [petName=" + petName + ", ownerName=" + ownerName + ", petType=" + petType + ", petAge=" + petAge
				+ "]";
	}
	
	@Override
	public boolean equals (Object anotherObject) {
		
		if (anotherObject instanceof PetVO
				&& !StringUtils.isEmpty(this.petName)
				&& !StringUtils.isEmpty(this.petType)) {
			
			PetVO anotherPet = ((PetVO) anotherObject);
			
			return this.petName.equalsIgnoreCase(anotherPet.petName)
					&& this.petType.equalsIgnoreCase(anotherPet.petType);
		}
		return false;
	}
}
