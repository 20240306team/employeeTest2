package leehojun.run;

public class SalGrade {

    private String salLevel;
    private int minSal;
    private int maxSal;

    public SalGrade(){}

    public SalGrade(String salLevel, int minSal, int maxSal) {
        this.salLevel = salLevel;
        this.minSal = minSal;
        this.maxSal = maxSal;
    }

    public String getSalLevel() {
        return salLevel;
    }

    public void setSalLevel(String salLevel) {
        this.salLevel = salLevel;
    }

    public int getMinSal() {
        return minSal;
    }

    public void setMinSal(int minSal) {
        this.minSal = minSal;
    }

    public int getMaxSal() {
        return maxSal;
    }

    public void setMaxSal(int maxSal) {
        this.maxSal = maxSal;
    }

    @Override
    public String toString() {
        return "SalGrade{" +
                "SalLevel='" + salLevel + '\'' +
                ", minSal=" + minSal +
                ", maxSal=" + maxSal +
                '}';
    }
}
