package Lab4;

//An arithmetic expression is given. An arithmetic expression is of the form (A+B) or (A-B) where A and B are
// both other arithmetic expressions or digits from 0-9. You need to evaluate the given expression.
//
//Name of Java class: ArithmeticExpression
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ArithmeticExpression {

    // funkcija za presmetuvanje na izrazot pocnuvajki
    // od indeks l, zavrsuvajki vo indeks r
    static int presmetaj(char c[], int l, int r) {
        if(l==r){
            return Character.getNumericValue(c[l]);
        }

        int parentheses = 0;
        int index = -1;
        for(int i = l; i < r; i++){
            if(c[i] == '('){
                parentheses++;
            }else if (c[i] == ')'){
                parentheses--;
            }
            if((c[i] == '+' || c[i] == '-') && parentheses == 0){
                index = i;
                break;
            }
        }

        if(index == -1){
            return presmetaj(c,l+1,r-1);
        }

        int leftOperand = presmetaj(c,l,index-1);
        int rightOperand = presmetaj(c,index+1,r);

        if(c[index] == '+'){
            return leftOperand + rightOperand;
        }else if(c[index] == '-'){
            return leftOperand - rightOperand;
        }
        return 0;
    }

    public static void main(String[] args) throws Exception {
        int i,j,k;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String expression = br.readLine();
        char exp[] = expression.toCharArray();

        int rez = presmetaj(exp, 0, exp.length-1);
        System.out.println(rez);

        br.close();

    }

}
