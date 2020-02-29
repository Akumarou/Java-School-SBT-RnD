public class Main {
    public static void main(String[] args) {
        Cookie temp = null;
        Cookie prot = new ChocolateCookie();
        CookieMachine cm =new CookieMachine(prot);
        try {
            temp = cm.makeCopy();
            System.out.println(temp.weight);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }

}
