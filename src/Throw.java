import java.io.IOException;
class Throw {
    void m() throws IOException {
        throw new IOException("device error");
    }
    void n() throws IOException {
        m();
    }
    void p() {
        try {
            n();
        } catch (Exception e) {
            System.out.println("exception handled");
        }
    }
    public static void main(String args[]) {
        Throw obj = new Throw();
        obj.p();
        System.out.println("normal flow...");
    }
}