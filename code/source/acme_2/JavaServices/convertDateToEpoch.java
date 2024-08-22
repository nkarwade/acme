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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
// --- <<IS-END-IMPORTS>> ---

public final class convertDateToEpoch

{
	// ---( internal utility methods )---

	final static convertDateToEpoch _instance = new convertDateToEpoch();

	static convertDateToEpoch _newInstance() { return new convertDateToEpoch(); }

	static convertDateToEpoch _cast(Object o) { return (convertDateToEpoch)o; }

	// ---( server methods )---




	public static final void convertDateToEpoch (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(convertDateToEpoch)>> ---
		// @sigtype java 3.5
		// [i] field:0:required dateString
		// [i] field:0:required format
		// [o] field:0:required epochTime
		IDataCursor cursor = pipeline.getCursor();
		
		try {
		    // Retrieve the input date string and format
		    String dateString = IDataUtil.getString(pipelineCursor, "dateString");
		    String format = IDataUtil.getString(pipelineCursor, "format");
		
		    // Parse the date string
		    SimpleDateFormat sdf = new SimpleDateFormat(format);
		    Date date = sdf.parse(dateString);
		
		    // Convert date to epoch time in milliseconds
		    long epochTime = date.getTime();
		
		    // Add the result to the pipeline
		    IDataCursor pipelineCursor_1 = pipeline.getCursor();
		    IDataUtil.put(pipelineCursor_1, "epochTime", epochTime);
		} catch (ParseException e) {
		    throw new ServiceException("Date parsing error: " + e.getMessage(), e);
		} catch (Exception e) {
		    throw new ServiceException(e);
		} finally {
		    cursor.destroy();
		}
		}
		// --- <<IS-END>> ---

                
	}
}

