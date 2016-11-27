package dk.zeed.json.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import dk.zeed.json.jackson.dao.CiscoStatsResponse;

import java.io.IOException;

import static org.junit.Assert.assertArrayEquals;

public class Test {

    public static String json = "[{\"id\":\"Daler Kampagne 2\",\"operation\":\"UPDATE\",\"VoiceIAQStats\":{\"id\":3,\"esdId\":3,\"esdName\":\"Daler Kampagne 2\",\"nResourcesLoggedIn\":0,\"nTotalContacts\":0,\"nHandledContacts\":0,\"nAbandonedContacts\":0,\"nDequeuedContacts\":0,\"avgTalkDuration\":0,\"longestTalkDuration\":0,\"avgWaitDuration\":0,\"longestWaitDuration\":0,\"longestCurrentlyWaitingDuration\":0,\"nAvailResources\":0,\"nInSessionResources\":0,\"nUnavailResources\":0,\"nWorkResources\":0,\"nSelectedResources\":0,\"nWaitingContacts\":0,\"nAverageHandlingTimeLowThreshold\":0.0,\"nAverageHandlingTimeHighThreshold\":0.0,\"nAverageWaitingTimeLowThreshold\":0.0,\"nAverageWaitingTimeHighThreshold\":0.0,\"nAbandonedCallsLowThreshold\":0,\"nAbandonedCallsHighThreshold\":0,\"nDequeuedCallsLowThreshold\":0,\"nDequeuedCallsHighThreshold\":0,\"nSLAPercentageLowThreshold\":0.0,\"nSLAPercentageHighThreshold\":0.0}},{\"id\":\"Dialer Kampagne 1\",\"operation\":\"UPDATE\",\"VoiceIAQStats\":{\"id\":2,\"esdId\":2,\"esdName\":\"Dialer Kampagne 1\",\"nResourcesLoggedIn\":0,\"nTotalContacts\":0,\"nHandledContacts\":0,\"nAbandonedContacts\":0,\"nDequeuedContacts\":0,\"avgTalkDuration\":0,\"longestTalkDuration\":0,\"avgWaitDuration\":0,\"longestWaitDuration\":0,\"longestCurrentlyWaitingDuration\":0,\"nAvailResources\":0,\"nInSessionResources\":0,\"nUnavailResources\":0,\"nWorkResources\":0,\"nSelectedResources\":0,\"nWaitingContacts\":0,\"nAverageHandlingTimeLowThreshold\":0.0,\"nAverageHandlingTimeHighThreshold\":0.0,\"nAverageWaitingTimeLowThreshold\":0.0,\"nAverageWaitingTimeHighThreshold\":0.0,\"nAbandonedCallsLowThreshold\":0,\"nAbandonedCallsHighThreshold\":0,\"nDequeuedCallsLowThreshold\":0,\"nDequeuedCallsHighThreshold\":0,\"nSLAPercentageLowThreshold\":0.0,\"nSLAPercentageHighThreshold\":0.0}},{\"id\":\"ICD01\",\"operation\":\"UPDATE\",\"VoiceIAQStats\":{\"id\":1,\"esdId\":1,\"esdName\":\"ICD01\",\"nResourcesLoggedIn\":0,\"nTotalContacts\":0,\"nHandledContacts\":0,\"nAbandonedContacts\":0,\"nDequeuedContacts\":0,\"avgTalkDuration\":0,\"longestTalkDuration\":0,\"avgWaitDuration\":0,\"longestWaitDuration\":0,\"longestCurrentlyWaitingDuration\":0,\"nAvailResources\":0,\"nInSessionResources\":0,\"nUnavailResources\":0,\"nWorkResources\":0,\"nSelectedResources\":0,\"nWaitingContacts\":0,\"nAverageHandlingTimeLowThreshold\":0.0,\"nAverageHandlingTimeHighThreshold\":0.0,\"nAverageWaitingTimeLowThreshold\":0.0,\"nAverageWaitingTimeHighThreshold\":0.0,\"nAbandonedCallsLowThreshold\":0,\"nAbandonedCallsHighThreshold\":0,\"nDequeuedCallsLowThreshold\":0,\"nDequeuedCallsHighThreshold\":0,\"nSLAPercentageLowThreshold\":0.0,\"nSLAPercentageHighThreshold\":0.0}}]";

    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        CiscoStatsResponse[] obj = mapper.readValue(json, CiscoStatsResponse[].class);

        // Back to json
        String jsonInString = mapper.writeValueAsString(obj);

        // And back to java for the test...
        CiscoStatsResponse[] obj2 = mapper.readValue(jsonInString, CiscoStatsResponse[].class);

        assertArrayEquals(obj, obj2);
    }
}
