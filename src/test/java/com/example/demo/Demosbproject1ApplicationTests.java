package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.lang.reflect.Method;

import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@RunWith(PowerMockRunner.class)
@PrepareForTest(Test2711.class)
class Demosbproject1ApplicationTests {

 
    @Mock
    Test2711 testMock;
    
    @Spy
    Test2711 testSpy;
    
    
   
	@BeforeAll
	public static void beforeAll() {
			System.out.println("Before All");
	}
	@BeforeEach
	public  void beforeEach() {
			System.out.println("Before Each");
	}
	
	@AfterAll
	public static void afterAll() {
			System.out.println("after All");
	}
	@AfterEach
	public void afterEach() {
			System.out.println("after Each");
	}

	@Test
	public void test1() {
		System.out.println("Test 1");
		when(testMock.add("123", "123")).thenReturn("246");
		String ans = testMock.add("123", "123");
		assertEquals("246", ans);
		
	}

	@Test
	public void test2() {
		System.out.println("Test 2");
		 when(testMock.add("987", "423")).thenReturn("1,410");
		 String ans = testMock.add("987", "423");
		 assertEquals("1,410", ans);
//		 assertThrows(AssertionFailedError.class, ()->verify(testMock).add("987", "423") , "custom message if assertion fails..."); 
	}
	
	
	@Test
	public void test3() {
		System.out.println("Test 3");
		String ans = testSpy.add("1,234,233", "1,234,555");
		assertEquals("2,468,788", ans);
		verify(testSpy).add("1,234,233", "1,234,555");
	}

	@Test
	public void test4() {
		System.out.println("Test test Exception 4");
		assertThrows(AssertionError.class, ()->verify(testSpy).exceptionmethod() , "custom message if assertion fails..."); 
	}
	
//	@Test
//	public void testStaticMetod() {
//		System.out.println("Test static method");
//		try (MockedStatic<Test2711> mockedStatic = mockStatic(Test2711.class)) {
//			when(Test2711.staticMethod()).thenReturn("static method");
//			String result = Test2711.staticMethod();
//			assertEquals("static method", result);
//
//		}
//	}
	
	@Test
	public void testPrivateMetod() throws Exception {
		System.out.println("Test private method");
		Test2711 mock = spy(new Test2711());

        PowerMockito.when(mock, "methodPrivate").thenReturn("private_method");

//        Method privateMethod = Test2711.class.getDeclaredMethod("methodPrivate");
//        privateMethod.setAccessible(true);
        String result = (String) testSpy.publicMethodCallingprivate();
        
        assertEquals(result, "private_method_public_method");
        

	}
	
	@Test
	public void mockStaticMethodTest() {
	  //Mock static methods
	  Mockito.mockStatic(Test2711.class);

	  //Set expectation
	  Mockito.when(Test2711.staticMethod()).thenReturn("New Message from Mock!");

	  //invoke the method
	  String message = Test2711.staticMethod();

	  //Assert the stub response
	   assertEquals(message, "New Message from Mock!");
	}
	
	@Test
	public void mockFinalMethodTest() {
	  //Mock static methods
	  Test2711 spy = spy(new Test2711());

	  //Set expectation
//	  Mockito.when(spy.finalMethod()).thenReturn("finalMethod");

	  //invoke the method
	  String message = spy.finalMethod();

	  //Assert the stub response
	   assertEquals(message, "finalMethod");
	}
}
