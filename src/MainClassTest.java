import org.junit.Assert;
import org.junit.Test;

    public class MainClassTest extends MainClass {
        @Test
        public void firstTest() {
            int a = this.getLocalNumber();

            if (a == 14) {
                System.out.println("True");
            } else {
                Assert.fail("The returned number in the getLocalNumber method != 14");
            }
        }
    }


