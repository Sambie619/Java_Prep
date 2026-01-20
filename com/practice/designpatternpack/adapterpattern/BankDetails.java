package designpatternpack.adapterpattern;

public class BankDetails {
	private String bankName;
    private String accHolderName;
    private long accNumber;

    public String getBankName() { return bankName; }
    public void setBankName(String bankName) { this.bankName = bankName; }

    public String getAccHolderName() { return accHolderName; }
    public void setAccHolderName(String accHolderName) { this.accHolderName = accHolderName; }

    public long getAccNumber() { return accNumber; }
    public void setAccNumber(long accNumber) { this.accNumber = accNumber; }

}
//“BankDetails is the adaptee that needs to be adapted to the CreditCard interface.”