import org.junit.*;
import static org.junit.Assert.*;

public class TaskTest {

  @Test
  public void task_instantiatesWithDescription_true() {
    Task myTask = new Task("Mow the lawn");
    assertEquals("Mow the lawn", myTask.getDescription());
  }
}
