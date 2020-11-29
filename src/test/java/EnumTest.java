import org.junit.Test;

public class EnumTest {
    @Test
    public void dateTest(){
        System.out.println(Enum.valueOf(DateEnum.class,"Sunday"));
    }
}
