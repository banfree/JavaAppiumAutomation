import org.junit.Assert;
import org.junit.Test;

    public class MainClassTest extends MainClass {
        @Test
        public void testGetClassNumber() {
            int a = this.getClassNumber();

            if (a > 45) {
                System.out.println("True, method GetClassNumber returns a number that is more than 45");
            } else {
                Assert.fail("Method GetClassNumber returns a number that is less than or equal to 45");
            }
        }
    }


