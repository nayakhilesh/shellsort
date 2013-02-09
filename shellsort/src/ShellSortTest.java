import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class ShellSortTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testShell() {
		
		int[] arr = {5,7,3,8,2,6,1,4,9,0};
		arr = ShellSort.shell(4, arr);
		assertTrue("[2, 0, 1, 4, 5, 6, 3, 8, 9, 7]".equals(Arrays.toString(arr)));
		
		arr = ShellSort.shell(2, arr); 
		assertTrue("[1, 0, 2, 4, 3, 6, 5, 7, 9, 8]".equals(Arrays.toString(arr)));
		
		arr = ShellSort.shell(1, arr);
		assertTrue("[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]".equals(Arrays.toString(arr)));
		
	}

	@Test
	public void testShellSort() {
		
		int[] arr = {5,7,3,8,2,6,1,4,9,0};
		arr = ShellSort.shellSort(arr);
		assertTrue("[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]".equals(Arrays.toString(arr)));
	
	}

}
