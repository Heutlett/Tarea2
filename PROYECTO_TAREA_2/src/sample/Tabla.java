package sample;

import javafx.beans.property.SimpleStringProperty;

public class Tabla {

    private SimpleStringProperty f1, f2, f3, f4, f5, f6,f7,f8,f9,f10;

    Tabla(){

        this.f1 = new SimpleStringProperty("");
        this.f2 = new SimpleStringProperty("");
        this.f3 = new SimpleStringProperty("");
        this.f4 = new SimpleStringProperty("");
        this.f5 = new SimpleStringProperty("");
        this.f6 = new SimpleStringProperty("");
        this.f7 = new SimpleStringProperty("");
        this.f8 = new SimpleStringProperty("");
        this.f9 = new SimpleStringProperty("");
        this.f10 = new SimpleStringProperty("");

    }

    public void setFNumber(int num, String valor){

        switch (num){

            case 0:
                setF1(valor);
                break;

            case 1:
                setF2(valor);
                break;

            case 2:
                setF3(valor);
                break;

            case 3:
                setF4(valor);
                break;

            case 4:
                setF5(valor);
                break;

            case 5:
                setF6(valor);
                break;

            case 6:
                setF7(valor);
                break;

            case 7:
                setF8(valor);
                break;

            case 8:
                setF9(valor);
                break;

            case 9:
                setF10(valor);
                break;


        }

    }

    public void setF1(String f1) {
        this.f1.set(f1);
    }

    public void setF2(String f2) {
        this.f2.set(f2);
    }

    public void setF3(String f3) {
        this.f3.set(f3);
    }

    public void setF4(String f4) {
        this.f4.set(f4);
    }

    public void setF5(String f5) {
        this.f5.set(f5);
    }

    public void setF6(String f6) {
        this.f6.set(f6);
    }

    public void setF7(String f7) {
        this.f7.set(f7);
    }

    public void setF8(String f8) {
        this.f8.set(f8);
    }

    public void setF9(String f9) {
        this.f9.set(f9);
    }

    public void setF10(String f10) {
        this.f10.set(f10);
    }

    public String getF1() {
        return f1.get();
    }

    public String getF2() {
        return f2.get();
    }

    public String getF3() {
        return f3.get();
    }

    public String getF4() {
        return f4.get();
    }

    public String getF5() {
        return f5.get();
    }

    public String getF6() {
        return f6.get();
    }

    public String getF7() {
        return f7.get();
    }
    public String getF8() {
        return f8.get();
    }
    public String getF9() {
        return f9.get();
    }

    public String getF10() {
        return f10.get();
    }

}