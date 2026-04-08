import java.io.IOException;
public class Main {
    public static void main() throws IOException{
        TaxPayer[] taxPayers = new TaxPayer[]{
          new TaxPayer("...",1660,0,0),
          new TaxPayer("...",1660,0,0),
                new TaxPayer("...",1660,0,0),
                new TaxPayer("...",1660,0,0),
                new TaxPayer("...",1660,0,0),
                new TaxPayer("...",1660,0,0)
        };
        Generator generator = new Generator(taxPayers);
        generator.inputData();
        generator.display();
    }
}
