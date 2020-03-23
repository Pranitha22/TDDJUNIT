package tddjunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class occurenceofA {
/*TODO list for my feature
 * 1.ABCD=>BCD
   2.AACD => CD 
   3.BACD => BCD
   4.BBAA => BBAA       
   5.AABAA => BAA
 * 
 */
	Aoccured a;
	
	@BeforeEach
	void setup() {
	a=new Aoccured();
	}
	@Test
	void test1() {
	assertEquals("BCD", a.getStr("ABCD"));
	}
    @Test
	void test2() {
		assertEquals("CD", a.getStr("AACD"));
		}
	@Test	
	void test3() {
		assertEquals("BCD", a.getStr("BACD"));
		}
	@Test	
	void test4() {
		assertEquals("BBAA",a.getStr("BBAA"));
		}
		@Test
	void test5() {
		assertEquals("BAA", a.getStr("AABAA"));
		}
		
	

}
