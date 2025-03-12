public class PaymentQRIS extends Payment {
    private String qrisCode;
    private String merchantId;
    
    public PaymentQRIS(String customerId, String qrisCode, String merchantId) {
        super(customerId);
        this.qrisCode = qrisCode;
        this.merchantId = merchantId;
    }
    
    public void pay(double amount) {
        System.out.println("Scanning QRIS code: " + qrisCode + " to transfer " + amount + " to merchant " + merchantId);
    }
}