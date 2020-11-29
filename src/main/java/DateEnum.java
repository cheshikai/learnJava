public enum DateEnum {
    Monday("1","星期一"),
    Sunday("7","星期日");
    private final String name;

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    private final String desc;

    DateEnum(String name, String desc){
        this.desc=desc;
        this.name=name;
    }

}
