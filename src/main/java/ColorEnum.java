public enum ColorEnum {
    Red("1"),
    Green("2");

    public String getType() {
        return type;
    }

    private final String type;

    ColorEnum(String name){
        this.type=name;
    }
}
