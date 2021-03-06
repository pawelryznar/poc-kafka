package lin.louis.poc.hrc.factory.reset;

import java.util.Queue;

import lin.louis.poc.models.HeartBeat;
import lin.louis.poc.models.HeartBeatQRS;


/**
 * Checking if the heartbeat has a valid heart activity.
 */
public class QRSResetChecker implements ResetChecker {

	@Override
	public boolean isReset(Queue<HeartBeat> heartBeatList) {
		return heartBeatList.stream()
							.anyMatch(heartBeat -> heartBeat.getQrs() == null || HeartBeatQRS.X == heartBeat.getQrs());
	}
}
