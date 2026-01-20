package designpatternpack.adapterpattern;

//adapter 
public class BankCustomer implements CreditCard {
    private BankDetails bankDetails;//uses aggregation,has-a 

    public BankCustomer(BankDetails bankDetails) {
        this.bankDetails = bankDetails;
    }

    @Override
    public String getCreditCard() {
    return "Credit Card Eligibility Approved.\n" +
           "Account Holder : " + bankDetails.getAccHolderName() + "\n" +
           "Account Number : " + maskAccountNumber(bankDetails.getAccNumber()) + "\n" +
           "Issuing Bank   : " + bankDetails.getBankName() + "\n" +
           "Status         : Eligible for credit card issuance.";
}
private String maskAccountNumber(long accNumber) {
    String acc = String.valueOf(accNumber);
    return "XXXX-XXXX-" + acc.substring(acc.length() - 4);
}

}

//What happened?,Uses BankDetails data
//Returns it in CreditCard language,Client never knows BankDetails exists.