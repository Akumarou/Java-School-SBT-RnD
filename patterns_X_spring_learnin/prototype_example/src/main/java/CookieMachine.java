public class CookieMachine {
    Cookie cookie;
    public CookieMachine(Cookie cookie){
        this.cookie=cookie;
    }
    public Cookie makeCopy() throws CloneNotSupportedException{
        return (Cookie) this.cookie.clone();
    }
}
