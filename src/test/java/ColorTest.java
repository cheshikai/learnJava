import org.junit.Test;

public class ColorTest {
    @Test
    public void color1Test(){
        System.out.println(Enum.valueOf(ColorEnum.class,"Green"));
        System.out.println(ColorEnum.Red);
        System.out.println(ColorEnum.Red.getType());
    }
    @Test
    public void color1Test1(){
        String wwwas="1456121";
        System.out.println(wwwas.substring(wwwas.length()-1).matches("[123]"));
         wwwas="1456122";
        System.out.println(wwwas.substring(wwwas.length()-1).matches("[123]"));
         wwwas="1456123";
        System.out.println(wwwas.substring(wwwas.length()-1).matches("[123]"));
         wwwas="1456124";
        System.out.println(wwwas.substring(wwwas.length()-1).matches("[123]"));
         wwwas="1456129";
        System.out.println(wwwas.substring(wwwas.length()-1).matches("[123]"));
    }
}
