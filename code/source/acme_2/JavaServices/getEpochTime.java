package acme_2.JavaServices;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import com.wm.data.IData;
import com.wm.data.IDataCursor;
import com.wm.data.IDataUtil;
import java.util.Date;
// --- <<IS-END-IMPORTS>> ---

public final class getEpochTime

{
	// ---( internal utility methods )---

	final static getEpochTime _instance = new getEpochTime();

	static getEpochTime _newInstance() { return new getEpochTime(); }

	static getEpochTime _cast(Object o) { return (getEpochTime)o; }

	// ---( server methods )---




	public static final void getEpochTime (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(getEpochTime)>> ---
		// @sigtype java 3.5
		IDataCursor cursor = pipeline.getCursor();
		
		try {
		    // Get the current epoch time in milliseconds
		    long currentEpochTime = System.currentTimeMillis();
		
		    // Add the result to the pipeline
		    IDataUtil.put(cursor, "epochTime", currentEpochTime);
		} catch (Exception e) {
		    throw new ServiceException(e);
		} finally {
		    cursor.destroy();
		}
		}
		// --- <<IS-END>> ---

                
	}
}

