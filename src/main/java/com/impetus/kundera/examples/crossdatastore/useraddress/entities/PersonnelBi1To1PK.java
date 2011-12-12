package com.impetus.kundera.examples.crossdatastore.useraddress.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="PERSON", schema="hibernatepoc")
public class PersonnelBi1To1PK
{
    @Id   
    @Column(name="PERSON_ID")    
    private String personId;
    
    @Column(name="PERSON_NAME")
    private String personName;
    
    @Embedded
    PersonalData personalData;
    
    @OneToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY, optional=false) 
    @PrimaryKeyJoinColumn
    private HabitatBi1To1PK address;

    public String getPersonId()
    {
        return personId;
    }   
    

    public String getPersonName()
    {
        return personName;
    }

    public void setPersonName(String personName)
    {
        this.personName = personName;
    }  


	public void setPersonId(String personId)
    {
        this.personId = personId;
    }

	public PersonalData getPersonalData() {
		return personalData;
	}


	public void setPersonalData(PersonalData personalData) {
		this.personalData = personalData;
	}


	public HabitatBi1To1PK getAddress() {
		return address;
	}


	public void setAddress(HabitatBi1To1PK address) {
		this.address = address;
	}	
}
