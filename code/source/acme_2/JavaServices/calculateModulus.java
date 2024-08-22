package acme_2.JavaServices;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import com.wm.data.ISPipelineException;
import com.wm.data.IData;
import com.wm.data.IDataCursor;
import com.wm.data.IDataUtil;
// --- <<IS-END-IMPORTS>> ---

public final class calculateModulus

{
	// ---( internal utility methods )---

	final static calculateModulus _instance = new calculateModulus();

	static calculateModulus _newInstance() { return new calculateModulus(); }

	static calculateModulus _cast(Object o) { return (calculateModulus)o; }

	// ---( server methods )---




	public static final void calculateModulus (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(calculateModulus)>> ---
		// @sigtype java 3.5
		// [i] field:0:required dividend
		// [i] field:0:required divisor
		    IDataCursor cursor = pipeline.getCursor();
		
		    try {
		        // Extract inputs from the pipeline
		        int dividend = IDataUtil.getInt(pipelineCursor, "dividend");
		        int divisor = IDataUtil.getInt(pipelineCursor, "divisor");
		
		        // Check for division by zero
		        if (divisor == 0) {
		            throw new ArithmeticException("Division by zero");
		        }
		
		        // Calculate modulus
		        int result = dividend % divisor;
		
		        // Add the result to the pipeline
		        IDataUtil.put(cursor, "result", result);
		    } catch (Exception e) {
		        throw new ServiceException(e);
		    } finally {
		        cursor.destroy();
		    }
		}
			
		// --- <<IS-END>> ---

                
	}
}

