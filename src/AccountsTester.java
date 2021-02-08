public class AccountsTester {
    public static void main(String[] args) {
       Account a1 = new Account("owner1", 45566, 5000);
       Account a2 = new Account("owner1", "owner2", 45567, 10000);
        //System.out.println(a1.toString());
       // System.out.println(a2.toString());
        System.out.println(a1.equals(a2));
    }
}
