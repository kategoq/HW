package HW3;

public class Post {

    public class Letter {

    }
    public class Parcel {

    }
    private int index;
    private int allCount;
    private int letters;
    private int allMoney;

    public Post (int index){
        this.index=index;
        this.allCount=0;
        this.letters=0;
        this.allMoney=0;
    }

    public String getInfo () {
        String strIndex = " " + this.index + ": " + this.allCount + " - all count, " + this.allMoney + " - all money, " + this.letters + " - letters";
        return strIndex;

    }

    public boolean send (int money) {
        this.allMoney = this.allMoney + money;
        this.allCount = this.allCount + 1;
        return true;
    }
    public boolean send (Letter letter) {
      this.letters = this.letters + 1;
      this.allCount = this.allCount + 1;
      return true;
    }
    public boolean send (Parcel parcel) {
        this.allCount = this.allCount + 1;
        return true;
    }


}
