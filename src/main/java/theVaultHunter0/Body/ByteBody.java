package theVaultHunter0.Body;

public class ByteBody extends Body {
    private byte[] data;

    public ByteBody(byte[] data) {
        this.data = data;
    }

    public byte[] getData() {
        return data;
    }

    public String toString(){
        return data.toString();
    }
}
