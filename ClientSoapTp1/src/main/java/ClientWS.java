import proxy.BankService;
import proxy.BankWS;

public class ClientWS {
    public static void main(String[] args) {
        BankService stub= new BankWS().getBankServicePort();
        System.out.println(stub.convert(2000));
    }
}
