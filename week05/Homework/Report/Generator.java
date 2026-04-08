import java.io.IOException;

public class Generator {
    private TaxPayer[] taxPayers;

    public Generator(TaxPayer[] taxPayers) {
        this.taxPayers = taxPayers;
    }
    protected void inputData()throws IOException{
        for (int i=0;i<taxPayers.length;i++){
            taxPayers[i].inputAll();
        }
    }

    protected void display(){
        sortByCharge();
        line();
        System.out.println(" 번호   이름   사용량   사용요금         세금       납부금액   기타");
        line();
        for (int i=0;i<taxPayers.length;i++){
            System.out.println(taxPayers[i].toString());
        }
        line();
    }
    private void sortByCharge() {
        TaxPayer temp;
        for (int i = 0; i < taxPayers.length - 1; ++i) {
            for (int j = i + 1; j < taxPayers.length; ++j) {
                if (taxPayers[i].submitTax() < taxPayers[j].submitTax()) {
                    temp = taxPayers[i];
                    taxPayers[i] = taxPayers[j];
                    taxPayers[j] = temp;
                }
            }
        }
    }
    private void line() {
        for (int i = 0; i < 100; i++)
            System.out.print("*");
        System.out.println();
    }
}
