package com.matheusicaro.course.fullstack.dto;

import java.io.Serializable;

public class NewClientDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String email;
	private String cpf_cnpj;
	private Integer type;
	
	private String phone_1;
	private String phone_2;
	private String phone_3;

	private String street;
	private String streetNumber;
	private String complement;
	private String district;
	private String cep;
	
	private Integer cityId;
	
	public NewClientDTO() {

	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf_cnpj() {
		return cpf_cnpj;
	}
	public void setCpf_cnpj(String cpf_cnpj) {
		this.cpf_cnpj = cpf_cnpj;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getPhone_1() {
		return phone_1;
	}
	public void setPhone_1(String phone_1) {
		this.phone_1 = phone_1;
	}
	public String getPhone_2() {
		return phone_2;
	}
	public void setPhone_2(String phone_2) {
		this.phone_2 = phone_2;
	}
	public String getPhone_3() {
		return phone_3;
	}
	public void setPhone_3(String phone_3) {
		this.phone_3 = phone_3;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getStreetNumber() {
		return streetNumber;
	}
	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}
	public String getComplement() {
		return complement;
	}
	public void setComplement(String complement) {
		this.complement = complement;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}

	public Integer getCityId() {
		return cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}
	

}
