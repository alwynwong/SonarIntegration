package ut.sonar-jira-add-on;

import org.junit.Test;
import sonar-jira-add-on.api.MyPluginComponent;
import sonar-jira-add-on.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}