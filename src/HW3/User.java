package HW3;

public class User {
    public class Address {
        private String city;
        private String country;

        public Address (String country, String city) {
            this.city = city;
            this.country = country;
        }
    }

    enum Sex {MALE, FEMALE};
    private String name;
    private String surname;
    private int age;
    private Sex sex;

    public User (String nameOf, String surnameOf, int ageOf, Sex sexOf) {
        this.name = nameOf;
        this.surname = surnameOf;
        this.age = ageOf;
        this.sex = sexOf;
    }

    public String getName () {
        return this.name;
    }
    public String getSurname () {
        return this.surname;
    }

    public int getAge() {
        return this.age;
    }

    public int increaseAge (int count) {
        this.age = this.age+count;
        return this.age;
    }

    public String getInfo () {

        String strAge = ""  + this.age;
        String strSex = "" ;
        if (this.sex == Sex.FEMALE) {
            strSex = "female";
        } else {
            if (this.sex == Sex.MALE) {
                strSex = "male";

            }
        }
        String result = strAge + " " + strSex + " " + this.surname  + " " + this.name;
        return result;

    }



}
