package com.arun;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class Personaltable {

		@Persistent
		String F_Key;
		
		@Persistent
		String firstName;
		
		@Persistent
		String middleName;
		
		@Persistent
		String lastName;
		
		@Persistent
		String day;
		
		@Persistent
		String month;
		
		@Persistent
		String year;
		
		@Persistent
		String age;
		
		@Persistent
		String gender;
		
		@Persistent
		String fatherName;
		
		@Persistent
		String fatherOccupation;
		
		@Persistent
		String motherName;
		
		@Persistent
		String annualIncome;
		
		@Persistent
		String religion;
		
		@Persistent
		String caste;
		
		@Persistent
		String exserviceman;
		
		@Persistent
		String bloogGroup;
		
		@Persistent
		String stp;

		

		public String getF_Key() {
			return F_Key;
		}

		public void setF_Key(String f_Key) {
			F_Key = f_Key;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getMiddleName() {
			return middleName;
		}

		public void setMiddleName(String middleName) {
			this.middleName = middleName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getDay() {
			return day;
		}

		public void setDay(String day) {
			this.day = day;
		}

		public String getMonth() {
			return month;
		}

		public void setMonth(String month) {
			this.month = month;
		}

		public String getYear() {
			return year;
		}

		public void setYear(String year) {
			this.year = year;
		}

		public String getAge() {
			return age;
		}

		public void setAge(String age) {
			this.age = age;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getFatherName() {
			return fatherName;
		}

		public void setFatherName(String fatherName) {
			this.fatherName = fatherName;
		}

		public String getFatherOccupation() {
			return fatherOccupation;
		}

		public void setFatherOccupation(String fatherOccupation) {
			this.fatherOccupation = fatherOccupation;
		}

		public String getMotherName() {
			return motherName;
		}

		public void setMotherName(String motherName) {
			this.motherName = motherName;
		}

		public String getAnnualIncome() {
			return annualIncome;
		}

		public void setAnnualIncome(String annualIncome) {
			this.annualIncome = annualIncome;
		}

		public String getReligion() {
			return religion;
		}

		public void setReligion(String religion) {
			this.religion = religion;
		}

		public String getCaste() {
			return caste;
		}

		public void setCaste(String caste) {
			this.caste = caste;
		}

		public String getExserviceman() {
			return exserviceman;
		}

		public void setExserviceman(String exserviceman) {
			this.exserviceman = exserviceman;
		}

		public String getBloogGroup() {
			return bloogGroup;
		}

		public void setBloogGroup(String bloogGroup) {
			this.bloogGroup = bloogGroup;
		}

		public String getStp() {
			return stp;
		}

		public void setStp(String stp) {
			this.stp = stp;
		}

		
		
		
		
}