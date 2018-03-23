package test.t02t03t04;

import main.t02t03t04.Price;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Ekaterina Semenova on 05.03.2018.
 */
public class PriceTest {

    @Test
    public void sumShouldReturnSummOfTwoPrices(){
        Price price1 = new Price(10, 10);
        Price price2 = new Price(11, 0);
        assertEquals(new Price(21, 10), price1.sum(price2));
    }

    @Test
    public void constructorPriceDoubleShouldReturnCorrectRubAndKop(){
        Price price1 = new Price(10, 10);
        assertEquals(price1, new Price( 10.10F));
    }

    @Test
    public void getPriceShouldReturnPriceAsFloat(){
        Price price1 = new Price(9, 11);
        System.out.println(price1.getPrice());
        assertEquals(9.11, price1.getPrice(),1);

    }
}
