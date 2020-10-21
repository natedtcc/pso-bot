import com.sun.jna.Memory;
import com.wgtools.jna.JnaUtils;
import com.wgtools.mem.WGTools;

public class MemTest {
	
	private final static long WARP_ADDRESS = 0x6FCAB0;
	private final static long LOCATION_ADDRESS = 0x78F5A4;

	public static void main(String[] args) {
		
		
		WGTools tools = new WGTools(); // create an instance of the tools
		// JnaUtils.getWinHwnd() returns an array or Hwnds with the first value(0)
		// always being the foremost
		tools.open(JnaUtils.getWinHwnd("PSO for PC").get(0)); // open the process of the given window
		boolean i = tools.writeInt(LOCATION_ADDRESS, 15);
		boolean j = tools.writeInt(WARP_ADDRESS, 1); // read an int from the given window/proccess
		System.out.println(i + " " + j);
		tools.close(); // close process used and dispose of tools
	}
}
