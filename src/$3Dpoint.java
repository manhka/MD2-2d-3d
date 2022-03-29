public class $3Dpoint extends $2Dpoint {
float z;

    public $3Dpoint() {
    }

    public $3Dpoint(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y ,float z){
        super.setX(x);
        super.setY(y);
        this.z=z;
    }
    public float[] getXYZ(){
        float[] arr2= new float[3];
                arr2[0]=super.getX();
                arr2[1]=super.getY();
                arr2[2]=z;
                return arr2;

    }

    @Override
    public String toString() {
        return "$3Dpoint{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    public static void main(String[] args) {
        $2Dpoint $2Dpoint= new $2Dpoint(2.2f,2.3f);
        System.out.println($2Dpoint);
    }

}
