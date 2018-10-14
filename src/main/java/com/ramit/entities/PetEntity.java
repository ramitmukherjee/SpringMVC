package com.ramit.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.ramit.models.PetVO;

@Entity
@Table(name="PET")
public class PetEntity {


	private Integer petId;
	private String petName;
	private String petType;

	public PetEntity () {

	}

	public PetEntity (PetVO pet) {
		this.petId = pet.getPetId();
		this.petName = pet.getPetName();
		this.petType = pet.getPetType();
	}

	@Id
	@Column(name="PET_ID")
	public Integer getPetId() {
		return petId;
	}
	public void setPetId(Integer petId) {
		this.petId = petId;
	}

	@Column(name="PET_NAME")
	public String getPetName() {
		return petName;
	}
	public void setPetName(String petName) {
		this.petName = petName;
	}

	@Column(name="PET_TYPE")
	public String getPetType() {
		return petType;
	}
	public void setPetType(String petType) {
		this.petType = petType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((petId == null) ? 0 : petId.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PetEntity other = (PetEntity) obj;
		if (petId == null) {
			if (other.petId != null)
				return false;
		} else if (!petId.equals(other.petId))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "PetEntity [petId=" + petId + ", petName=" + petName + ", petType="
				+ petType + "]";
	}


}
