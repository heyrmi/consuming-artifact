package org.heyrmi;


import org.testng.annotations.Test;
import org.rahul.App;


import static org.assertj.core.api.Assertions.assertThat;



public class AppTest
{

    @Test
    public void shouldAnswerWithTrue()
    {
        String nameOfPerson = "Rahul";
        App app = new App();
        String name = app.printMyName(nameOfPerson);
        System.out.println(name);

        assertThat(name).contains("Rahul");
    }
}
