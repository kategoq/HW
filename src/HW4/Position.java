package HW4;

public enum Position {
    WORKER (2, 1000),
    DIRECTOR (3, 1000),
    SERVANTS (1, 1000);

    public float coefficient;
    public float basic;


    Position (float koef, float basic) {
        this.coefficient = koef;
        this.basic = basic;
    }


}
