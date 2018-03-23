package test.t02t03t04.stationary;

import main.t02t03t04.Price;
import main.t02t03t04.stationery.WritingTool;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.assertEquals;

/**
 * Created by Ekaterina Semenova on 08.03.2018.
 */
public class WritingToolTest {
    @Test
    public void getNameShouldReturnString(){
        WritingTool pen = new WritingTool("pen", Color.black, new Price(10));
        assertEquals("PEN", pen.getName());
    }
}
