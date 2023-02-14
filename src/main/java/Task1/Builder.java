package Task1;

public class Builder {

    private String firstName;
    private String lastName;
    private String middleName;
    private String country;
    private String adress;
    private String phone;
    private int age;
    private String gender;

   public Builder(){
   }
   public Builder setPersonFirstName(String firstName){

      this.firstName = firstName;
       return this;
   }
    public Builder setPersonLastName(String lastName){

        this.lastName = lastName;
        return this;
    }
    public Builder setPersonMiddleName(String middleName){

        this.middleName = middleName;
        return this;
    }
    public Builder setPersonCountry(String country){

        this.country = country;
        return this;
    }
    public Builder setPersonAddress(String adress){

        this.adress = adress;
        return this;
    }
    public Builder setPersonPhone(String phone){

        this.phone = phone;
        return this;
    }
    public Builder setPersonAge(int age){

        this.age = age;
        return this;
    }
    public Builder setPersonGender(String gender){

        this.gender = gender;
        return this;
    }
    public Person buildPerson(){
       Person person = new Person(firstName, lastName, middleName, country, adress, phone, age, gender);
        return person;
    }
}

