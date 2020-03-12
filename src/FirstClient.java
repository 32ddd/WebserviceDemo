public class FirstClient {
    public static void main(String[] args) {
        MobileCodeWS ws = new MobileCodeWS();
        MobileCodeWSSoap soap = ws.getMobileCodeWSSoap();
        String str = soap.getMobileCodeInfo("155555555", "");
        System.out.println(str);
    }
}
