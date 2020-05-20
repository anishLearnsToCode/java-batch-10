package day8;

public abstract class GenericBank {
    public abstract double getInterest();

    public String getBankName() {
        return "";
    }

    public void complexTask() {
        step1();
        step2();
        step3();
    }

    public void step2() {

    }

    public abstract void step1();
    public abstract void step3();
}

class Hdfc extends GenericBank {

    @Override
    public double getInterest() {
        return 0.07;
    }

    @Override
    public String getBankName() {
        return "HDFC";
    }

    @Override
    public void step1() {

    }

    @Override
    public void step3() {

    }
}
