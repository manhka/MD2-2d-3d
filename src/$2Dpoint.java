public class $2Dpoint {
    float x=0.0f;
    float y=0.0f;

    public $2Dpoint() {
    }

    public $2Dpoint(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x,float y){
        this.x=x;
        this.y=y;
    }
    public float[] getXY(){ float[] arr= new float[2];
       float x=arr[1];
       float y=arr[2];

       return arr;
    }

    @Override
    public String toString() {
        return "$2Dpoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
