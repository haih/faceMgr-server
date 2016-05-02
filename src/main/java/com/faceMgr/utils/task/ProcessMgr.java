/**
 * 
 */
package  com.faceMgr.utils.task;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

import com.faceMgr.utils.tracking.Tracking;

/**
 * @author faceMgr
 *
 */
public class ProcessMgr implements Runnable{

	private Tracking tracking;
	
	private static final Logger logger = LoggerFactory.getLogger(ProcessMgr.class);
	
	public void run() {
		
	}
	
	public static void main(String[] args) {
		MDC.put("TEST", "trackingid test");
		//logger.info("log testing ");
	}
}
