package theVaultHunter0.Body;

public class StrBody extends Body{
    private String data;

    public StrBody(String data) {
        this.data = data;
    }

    public String getData() {
        return this.data;
    }

    public String toString() {
        return this.data;
    }
}
