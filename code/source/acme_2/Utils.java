package acme_2;

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




	public static final void demoConcat (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(demoConcat)>> ---
		// @sigtype java 3.5
		// [i] field:0:required input1
		// [i] field:0:required input2
		// [o] field:0:required result
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
			String	input1 = IDataUtil.getString( pipelineCursor, "input1" );
			String	input2 = IDataUtil.getString( pipelineCursor, "input2" );
		pipelineCursor.destroy();
		
		String result = input1.concat(input2);
		
		// pipeline
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		IDataUtil.put( pipelineCursor_1, "result", result );
		pipelineCursor_1.destroy();
			
		// --- <<IS-END>> ---

                
	}
}

