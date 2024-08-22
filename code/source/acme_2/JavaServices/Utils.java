package acme_2.JavaServices;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class Utils

{
	// ---( internal utility methods )---

	final static Utils _instance = new Utils();

	static Utils _newInstance() { return new Utils(); }

	static Utils _cast(Object o) { return (Utils)o; }

	// ---( server methods )---




	public static final void concatJavaService (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(concatJavaService)>> ---
		// @sigtype java 3.5
		// [i] field:0:required value1
		// [i] field:0:required value2
		// [o] field:0:required result
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
			String	value1 = IDataUtil.getString( pipelineCursor, "value1" );
			String	value2 = IDataUtil.getString( pipelineCursor, "value2" );
		pipelineCursor.destroy();
		
		String res = value1.concat(value2);
		
		// pipeline
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		IDataUtil.put( pipelineCursor_1, "result", res );
		pipelineCursor_1.destroy();
			
		// --- <<IS-END>> ---

                
	}



	public static final void getRemainder (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(getRemainder)>> ---
		// @sigtype java 3.5
		// [i] field:0:required num1
		// [i] field:0:required num2
		// [o] field:0:required remainder
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
			String	num1 = IDataUtil.getString( pipelineCursor, "num1" );
			String	num2 = IDataUtil.getString( pipelineCursor, "num2" );
		pipelineCursor.destroy();
		
		int res = Integer.parseInt(num1) % Integer.parseInt(num2);
		
		// pipeline
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		IDataUtil.put( pipelineCursor_1, "remainder", res+"");
		pipelineCursor.destroy();
		
			
		// --- <<IS-END>> ---

                
	}



	public static final void replaceSpecialCharectorsFromString (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(replaceSpecialCharectorsFromString)>> ---
		// @sigtype java 3.5
		// [i] field:0:required inputString
		// [o] field:0:required resultString
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
			String	inputString = IDataUtil.getString( pipelineCursor, "inputString" );
		pipelineCursor.destroy();
		
		String resultString = inputString.replaceAll("[^a-zA-Z0-9]", "~");
		
		// pipeline
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		IDataUtil.put( pipelineCursor_1, "resultString", resultString );
		pipelineCursor_1.destroy();
			
		// --- <<IS-END>> ---

                
	}



	public static final void toUpper (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(toUpper)>> ---
		// @sigtype java 3.5
		// [i] field:0:required input
		// [o] field:0:required output
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
			String	input = IDataUtil.getString( pipelineCursor, "input" );
		pipelineCursor.destroy();
		
		String output = input.toUpperCase();
		// pipeline
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		IDataUtil.put( pipelineCursor_1, "output", output );
		pipelineCursor_1.destroy();
		// --- <<IS-END>> ---

                
	}
}

