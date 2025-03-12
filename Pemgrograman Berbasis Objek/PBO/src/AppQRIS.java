public class AppQRIS {
    public static void main(String[] args) {
        PaymentQRIS payQRIS = new PaymentQRIS("987654321", "ID10012022123456", "MID123456789");
        payQRIS.pay(750000);
    }
}
