public class Counter {
    private int startValue;

    public Counter(int startValue){
        this.startValue = startValue;
    }
    public Counter(){
        this.startValue = 0;
    }
    public int value(){
        return startValue;
    }
    public void increase(int incrVal){
        this.startValue += 1;
    }
    public void decrease(int decrVal){
        this.startValue -= 1;
    }
    public void increaseBy(int increase) {
        if(startValue < 0){
            this.startValue += 0;;
        }
        else {
            this.startValue += increase;
        }
    }
    public void decreaseBy(int decrease) {
        if (startValue < 0){
            this.startValue -= 0;
        }
        else {
            this.startValue -= decrease;
        }
    }

    public int getNumber() {
        return startValue;
    }
    public String toString() {
        return "The number is: " + getNumber();
    }
}