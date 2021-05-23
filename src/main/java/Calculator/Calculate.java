package main.java.Calculator;

public class Calculate extends Calculator implements iCalc{
    int iSecondNum,result=0;
    double iFirstNum,resultdbl = 0;
    char cOperator;
    int checkPerform = -1;
    Calculate(){
        iFirstNum = 0;
        iSecondNum = 0;
    }
    public Calculate(Double dblNum, char cOperator){
        this.iFirstNum = dblNum;
        this.cOperator = cOperator;
    }
    public Calculate(int iFirstNum, char cOperator, int iSecondNum){
        this.iFirstNum = iFirstNum;
        this.cOperator = cOperator;
        this.iSecondNum = iSecondNum;
    }
    public void doCalculation(){
        checkInt();
        checkDouble();
        int firstValue = (int)this.iFirstNum;
        switch (this.cOperator){
            case '+':
                result = addition(firstValue,this.iSecondNum);
                break;
            case '-':
                result = subtraction(firstValue,this.iSecondNum);
                break;
            case '*':
                result = multiplication(firstValue,this.iSecondNum);
                break;
            case '/':
                if(checkSecondNum()) {
                    resultdbl = division(firstValue, this.iSecondNum);
                }else{
                    System.out.println("can't perform division");
                }
                break;
            case 's':
                resultdbl = sine(this.iFirstNum);
                break;
            case 'c':
                resultdbl = cos(this.iFirstNum);
                break;
            case 't':
                resultdbl = tangent(this.iFirstNum);
                break;
            case 'l':
                resultdbl = log(this.iFirstNum);
                break;
        }
    }
    public void getResult(){
        if(checkPerform == 1) {
            System.out.println("Result = " + result);
        }
        if(checkPerform == 2){
            System.out.println("Result = " + resultdbl);
        }
    }
    private boolean checkSecondNum(){
        if(this.iSecondNum == 0){
            return false;
        }
        return true;
    }
    private void checkInt(){
        if(cOperator == '+' || cOperator == '-' || cOperator == '*'){
            checkPerform = 1;
        }
    }
    private void checkDouble(){
        if(cOperator == 's' || cOperator == 'c' || cOperator == 't' || cOperator == 'l' || cOperator == '/'){
            checkPerform = 2;
        }
    }
}
