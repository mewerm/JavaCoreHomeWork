package Work14.Work9;

public class MyArrayDataException extends NumberFormatException {
    int arrNum;
    int symbolNum;
    String problemMassage;


    MyArrayDataException(int arrNum, int symbolNum, String problemMassage){
        super(problemMassage);
        this.arrNum = arrNum;
        this.symbolNum = symbolNum;
        this.problemMassage = problemMassage;


    }
}
