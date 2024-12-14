package ex2_QA_2024.ex2_QA_2024;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class ex1tester {
	ex1 tester =new ex1();
	
	@Test
    public void test_1() {
    	int a=5,b=10,c=7;
    	String Expected_result="no roots";
    	String actual_output=ex1.calc_roots(a, b, c);
    	assertEquals(Expected_result,actual_output);
    }
	@Test
    public void test_2() {
    	int a=6,b=20,c=40;
    	String Expected_result="no roots";
    	String actual_output=ex1.calc_roots(a, b, c);
    	assertEquals(Expected_result,actual_output);
    }
	@Test
    public void test_3() {
    	int a=200,b=100,c=50;
    	String Expected_result="no roots";
    	String actual_output=ex1.calc_roots(a, b, c);
    	assertEquals(Expected_result,actual_output);
    }
	@Test
    public void test_4() {
    	int a=199,b=40,c=83;
    	String Expected_result="no roots";
    	String actual_output=ex1.calc_roots(a, b, c);
    	assertEquals(Expected_result,actual_output);
    }
	@Test
	public void test_5() {
	    	int a=7,b=5,c=47;
	    	String Expected_result="no roots";
	    	String actual_output=ex1.calc_roots(a, b, c);
	    	assertEquals(Expected_result,actual_output);
	}
	@Test
    public void test_6() {
    	int a=8,b=6,c=52;
    	String Expected_result="no roots";
    	String actual_output=ex1.calc_roots(a, b, c);
    	assertEquals(Expected_result,actual_output);
    }
	@Test
    public void test_7() {
    	int a=15,b=200,c=7;
    	String Expected_result="two roots";
    	String actual_output=ex1.calc_roots(a, b, c);
    	assertEquals(Expected_result,actual_output);
    }
	@Test
    public void test_8() {
    	int a=20,b=199,c=64;
    	String Expected_result="two roots";
    	String actual_output=ex1.calc_roots(a, b, c);
    	assertEquals(Expected_result,actual_output);
    }
	@Test
    public void test_9() {
    	int a=22,b=8,c=5;
    	String Expected_result="no roots";
    	String actual_output=ex1.calc_roots(a, b, c);
    	assertEquals(Expected_result,actual_output);
    }
	@Test
    public void test_10() {
    	int a=50,b=23,c=6;
    	String Expected_result="no roots";
    	String actual_output=ex1.calc_roots(a, b, c);
    	assertEquals(Expected_result,actual_output);
    }
	@Test
    public void test_11() {
    	int a=60,b=36,c=200;
    	String Expected_result="no roots";
    	String actual_output=ex1.calc_roots(a, b, c);
    	assertEquals(Expected_result,actual_output);
    }
	@Test
    public void test_12() {
    	int a=150,b=81,c=199;
    	String Expected_result="no roots";
    	String actual_output=ex1.calc_roots(a, b, c);
    	assertEquals(Expected_result,actual_output);
    }
	@Test
    public void test_13() {
    	int a=30,b=150,c=100;
    	String Expected_result="two roots";
    	String actual_output=ex1.calc_roots(a, b, c);
    	assertEquals(Expected_result,actual_output);
    }



}
