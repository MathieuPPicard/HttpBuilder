package theVaultHunter0.StartLine;

public class StartLineRequest extends StartLine{

    private String target;
    private Emethod method;

    public StartLineRequest(String version, String target, Emethod method) {
        super(version);
        this.target = target;
        this.method = method;
    }

    public String toString(){
        StringBuilder result = new StringBuilder();
        result.append(this.method.toString()).append(" /").append(this.target)
                .append(" ").append(this.getVersion()).append("\r\n");
        return result.toString();
    }

    public String getTarget() {
        return target;
    }

    public Emethod getMethod() {
        return method;
    }
}
