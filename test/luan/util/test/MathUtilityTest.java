/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luan.util.test;

import java.sql.SQLException;
import static luan.util.MathUtility.*;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PC
 */
public class MathUtilityTest {
    
    @Test // bien ham nay thanh main
    // caach dat ten ham noi len muc tieu test , co nhieu cach khac nhau
    public void getFactorial_Runwell_IfValidAgrument(){
        assertEquals(120,getPactorial(5));
        assertEquals(720,getPactorial(6));
        assertEquals(1,getPactorial(1));
    }
    
    @Test(expected = IllegalArgumentException.class) // kiem tra ngoai le
    // neu nem ve IllegalArgumentException trong tinh huong -5 giai thua
    //ngoai le khong la mot gia tri de lay ra sa sanh
    public void getFactorial_ThrowException_IfValidArgument(){
        getPactorial(-5);
    }
}
