package Arithmetic;

public class Arithmetic<N extends Number, M extends Number> {
//    private /*final*/ N n1;
//    private /*final*/ M n2;
    private Number nn1;
    private Number nn2;

    public Arithmetic(N n1, M n2) {
        nn1 = n1;
        nn2 = n2;
    }

//    public Arithmetic(N n1, M n2) {
//        this.n1 = n1;
//        this.n2 = n2;
//    }

    public Number add(){
        return nn1.doubleValue() + nn2.doubleValue();
    }

    public Number subtract(){
        return nn1.doubleValue()-nn2.doubleValue();
    }
    public Number multiply(){
        return nn1.doubleValue()*nn2.doubleValue();
    }

    public Number divide(){
        if(nn2.doubleValue() == 0){
            throw new ArithmeticException("Divisor must be non-zero.");
        }
        return nn1.doubleValue()/nn2.doubleValue();
    }

    public Number getMin(){
//        return (Double)(nn1.doubleValue() < nn2.doubleValue() ? nn1 : nn2);
        if(nn1.doubleValue() < nn2.doubleValue())
            return nn1.doubleValue();

        return nn2.doubleValue();
    }

    public Number getMax(){
//        return (Double)(nn1.doubleValue() > nn2.doubleValue() ? nn1 : nn2);
        if(nn1.doubleValue() > nn2.doubleValue())
            return nn1.doubleValue();

        return nn2.doubleValue();
    }
}
