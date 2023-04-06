package HW3;

public class User {
    enum Sex {MALE, FEMALE};
    private String name;
    private String surname;
    private int age;
    private Sex sex;

    public User (String nameOf, String surnameOf, int ageOf, Sex sexOf) {
        name = nameOf;
        surname = surnameOf;
        age = ageOf;
        sex = sexOf;
    }

    public String getName () {
        return name;
    }
    public String getSurname () {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int increaseAge (int count) {
        age = age+count;
        return age;
    }

    public String getInfo () {

        String strAge = ""  + age;
        String strSex = "" ;
        if (sex == Sex.FEMALE) {
            strSex = "female";
        } else {
            if (sex == Sex.MALE) {
                strSex = "male";

            }
        }
        String result = strAge + " " + strSex + " " + surname  + " "+ name;
        return result;

    }

}
