import org.junit.Assert;
import org.junit.Test;

    public class MainClassTest extends MainClass {
        @Test
        public void testGetClassString() {
            String a = this.getClassString();

            if (a.contains("Hello") || a.contains("hello") ) {
                System.out.println("True, the getClassString method returns a string that contains “hello” or “Hello”");
            } else {
                Assert.fail("The getClassString method doesn't return a string that contains “hello” or “Hello”");
            }
        }
    }



    