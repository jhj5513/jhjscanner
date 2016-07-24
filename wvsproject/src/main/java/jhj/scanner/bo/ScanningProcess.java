package jhj.scanner.bo;
import java.io.IOException;
import java.io.StringWriter;

import org.python.util.PythonInterpreter;

public class ScanningProcess {
	
	public void Scan(String url) throws IOException, InterruptedException {
		
    	
    	String[] arguments = {"iotest.py", url};
    	PythonInterpreter.initialize(System.getProperties(), System.getProperties(), arguments);
    	org.python.util.PythonInterpreter python = new org.python.util.PythonInterpreter();
    	StringWriter out = new StringWriter();
    	python.setOut(out);
    	python.execfile("iotest.py");
    	String outputStr = out.toString();
    	System.out.println(outputStr);
	}
	
	
	

	public static void main(String[] args) throws IOException, InterruptedException {
		ScanningProcess sp = new ScanningProcess();
		sp.Scan("aaabc");
	}
}