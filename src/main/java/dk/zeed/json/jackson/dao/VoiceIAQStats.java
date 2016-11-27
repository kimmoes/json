package dk.zeed.json.jackson.dao;

import java.util.Objects;

public class VoiceIAQStats {

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Integer getEsdId() {
        return esdId;
    }
    public void setEsdId(Integer esdId) {
        this.esdId = esdId;
    }
    public String getEsdName() {
        return esdName;
    }
    public void setEsdName(String esdName) {
        this.esdName = esdName;
    }
    public Integer getnResourcesLoggedIn() {
        return nResourcesLoggedIn;
    }
    public void setnResourcesLoggedIn(Integer nResourcesLoggedIn) {
        this.nResourcesLoggedIn = nResourcesLoggedIn;
    }
    public Integer getnTotalContacts() {
        return nTotalContacts;
    }
    public void setnTotalContacts(Integer nTotalContacts) {
        this.nTotalContacts = nTotalContacts;
    }
    public Integer getnHandledContacts() {
        return nHandledContacts;
    }
    public void setnHandledContacts(Integer nHandledContacts) {
        this.nHandledContacts = nHandledContacts;
    }
    public Integer getnAbandonedContacts() {
        return nAbandonedContacts;
    }
    public void setnAbandonedContacts(Integer nAbandonedContacts) {
        this.nAbandonedContacts = nAbandonedContacts;
    }
    public Integer getnDequeuedContacts() {
        return nDequeuedContacts;
    }
    public void setnDequeuedContacts(Integer nDequeuedContacts) {
        this.nDequeuedContacts = nDequeuedContacts;
    }
    public Integer getAvgTalkDuration() {
        return avgTalkDuration;
    }
    public void setAvgTalkDuration(Integer avgTalkDuration) {
        this.avgTalkDuration = avgTalkDuration;
    }
    public Integer getLongestTalkDuration() {
        return longestTalkDuration;
    }
    public void setLongestTalkDuration(Integer longestTalkDuration) {
        this.longestTalkDuration = longestTalkDuration;
    }
    public Integer getAvgWaitDuration() {
        return avgWaitDuration;
    }
    public void setAvgWaitDuration(Integer avgWaitDuration) {
        this.avgWaitDuration = avgWaitDuration;
    }
    public Integer getLongestWaitDuration() {
        return longestWaitDuration;
    }
    public void setLongestWaitDuration(Integer longestWaitDuration) {
        this.longestWaitDuration = longestWaitDuration;
    }
    public Integer getLongestCurrentlyWaitingDuration() {
        return longestCurrentlyWaitingDuration;
    }
    public void setLongestCurrentlyWaitingDuration(
            Integer longestCurrentlyWaitingDuration) {
        this.longestCurrentlyWaitingDuration = longestCurrentlyWaitingDuration;
    }
    public Integer getnAvailResources() {
        return nAvailResources;
    }
    public void setnAvailResources(Integer nAvailResources) {
        this.nAvailResources = nAvailResources;
    }
    public Integer getnInSessionResources() {
        return nInSessionResources;
    }
    public void setnInSessionResources(Integer nInSessionResources) {
        this.nInSessionResources = nInSessionResources;
    }
    public Integer getnUnavailResources() {
        return nUnavailResources;
    }
    public void setnUnavailResources(Integer nUnavailResources) {
        this.nUnavailResources = nUnavailResources;
    }
    public Integer getnWorkResources() {
        return nWorkResources;
    }
    public void setnWorkResources(Integer nWorkResources) {
        this.nWorkResources = nWorkResources;
    }
    public Integer getnSelectedResources() {
        return nSelectedResources;
    }
    public void setnSelectedResources(Integer nSelectedResources) {
        this.nSelectedResources = nSelectedResources;
    }
    public Integer getnWaitingContacts() {
        return nWaitingContacts;
    }
    public void setnWaitingContacts(Integer nWaitingContacts) {
        this.nWaitingContacts = nWaitingContacts;
    }
    public Integer getnAverageHandlingTimeLowThreshold() {
        return nAverageHandlingTimeLowThreshold;
    }
    public void setnAverageHandlingTimeLowThreshold(
            Integer nAverageHandlingTimeLowThreshold) {
        this.nAverageHandlingTimeLowThreshold = nAverageHandlingTimeLowThreshold;
    }
    public Integer getnAverageHandlingTimeHighThreshold() {
        return nAverageHandlingTimeHighThreshold;
    }
    public void setnAverageHandlingTimeHighThreshold(
            Integer nAverageHandlingTimeHighThreshold) {
        this.nAverageHandlingTimeHighThreshold = nAverageHandlingTimeHighThreshold;
    }
    public Integer getnAverageWaitingTimeLowThreshold() {
        return nAverageWaitingTimeLowThreshold;
    }
    public void setnAverageWaitingTimeLowThreshold(
            Integer nAverageWaitingTimeLowThreshold) {
        this.nAverageWaitingTimeLowThreshold = nAverageWaitingTimeLowThreshold;
    }
    public Integer getnAverageWaitingTimeHighThreshold() {
        return nAverageWaitingTimeHighThreshold;
    }
    public void setnAverageWaitingTimeHighThreshold(
            Integer nAverageWaitingTimeHighThreshold) {
        this.nAverageWaitingTimeHighThreshold = nAverageWaitingTimeHighThreshold;
    }
    public Integer getnAbandonedCallsLowThreshold() {
        return nAbandonedCallsLowThreshold;
    }
    public void setnAbandonedCallsLowThreshold(Integer nAbandonedCallsLowThreshold) {
        this.nAbandonedCallsLowThreshold = nAbandonedCallsLowThreshold;
    }
    public Integer getnAbandonedCallsHighThreshold() {
        return nAbandonedCallsHighThreshold;
    }
    public void setnAbandonedCallsHighThreshold(Integer nAbandonedCallsHighThreshold) {
        this.nAbandonedCallsHighThreshold = nAbandonedCallsHighThreshold;
    }
    public Integer getnDequeuedCallsLowThreshold() {
        return nDequeuedCallsLowThreshold;
    }
    public void setnDequeuedCallsLowThreshold(Integer nDequeuedCallsLowThreshold) {
        this.nDequeuedCallsLowThreshold = nDequeuedCallsLowThreshold;
    }
    public Integer getnDequeuedCallsHighThreshold() {
        return nDequeuedCallsHighThreshold;
    }
    public void setnDequeuedCallsHighThreshold(Integer nDequeuedCallsHighThreshold) {
        this.nDequeuedCallsHighThreshold = nDequeuedCallsHighThreshold;
    }
    public Integer getnSLAPercentageLowThreshold() {
        return nSLAPercentageLowThreshold;
    }
    public void setnSLAPercentageLowThreshold(Integer nSLAPercentageLowThreshold) {
        this.nSLAPercentageLowThreshold = nSLAPercentageLowThreshold;
    }
    public Integer getnSLAPercentageHighThreshold() {
        return nSLAPercentageHighThreshold;
    }
    public void setnSLAPercentageHighThreshold(Integer nSLAPercentageHighThreshold) {
        this.nSLAPercentageHighThreshold = nSLAPercentageHighThreshold;
    }
    String id;
    Integer esdId;
    String esdName;
    Integer nResourcesLoggedIn;
    Integer nTotalContacts;
    Integer nHandledContacts;
    Integer nAbandonedContacts;
    Integer nDequeuedContacts;
    Integer avgTalkDuration;
    Integer longestTalkDuration;
    Integer avgWaitDuration;
    Integer longestWaitDuration;
    Integer longestCurrentlyWaitingDuration;
    Integer nAvailResources;
    Integer nInSessionResources;
    Integer nUnavailResources;
    Integer nWorkResources;
    Integer nSelectedResources;
    Integer nWaitingContacts;
    Integer nAverageHandlingTimeLowThreshold;
    Integer nAverageHandlingTimeHighThreshold;
    Integer nAverageWaitingTimeLowThreshold;
    Integer nAverageWaitingTimeHighThreshold;
    Integer nAbandonedCallsLowThreshold;
    Integer nAbandonedCallsHighThreshold;
    Integer nDequeuedCallsLowThreshold;
    Integer nDequeuedCallsHighThreshold;
    Integer nSLAPercentageLowThreshold;
    Integer nSLAPercentageHighThreshold;

    @Override
    public String toString() {
        return "VoiceIAQStats{" +
                "id='" + id + '\'' +
                ", esdId=" + esdId +
                ", esdName='" + esdName + '\'' +
                ", nResourcesLoggedIn=" + nResourcesLoggedIn +
                ", nTotalContacts=" + nTotalContacts +
                ", nHandledContacts=" + nHandledContacts +
                ", nAbandonedContacts=" + nAbandonedContacts +
                ", nDequeuedContacts=" + nDequeuedContacts +
                ", avgTalkDuration=" + avgTalkDuration +
                ", longestTalkDuration=" + longestTalkDuration +
                ", avgWaitDuration=" + avgWaitDuration +
                ", longestWaitDuration=" + longestWaitDuration +
                ", longestCurrentlyWaitingDuration=" + longestCurrentlyWaitingDuration +
                ", nAvailResources=" + nAvailResources +
                ", nInSessionResources=" + nInSessionResources +
                ", nUnavailResources=" + nUnavailResources +
                ", nWorkResources=" + nWorkResources +
                ", nSelectedResources=" + nSelectedResources +
                ", nWaitingContacts=" + nWaitingContacts +
                ", nAverageHandlingTimeLowThreshold=" + nAverageHandlingTimeLowThreshold +
                ", nAverageHandlingTimeHighThreshold=" + nAverageHandlingTimeHighThreshold +
                ", nAverageWaitingTimeLowThreshold=" + nAverageWaitingTimeLowThreshold +
                ", nAverageWaitingTimeHighThreshold=" + nAverageWaitingTimeHighThreshold +
                ", nAbandonedCallsLowThreshold=" + nAbandonedCallsLowThreshold +
                ", nAbandonedCallsHighThreshold=" + nAbandonedCallsHighThreshold +
                ", nDequeuedCallsLowThreshold=" + nDequeuedCallsLowThreshold +
                ", nDequeuedCallsHighThreshold=" + nDequeuedCallsHighThreshold +
                ", nSLAPercentageLowThreshold=" + nSLAPercentageLowThreshold +
                ", nSLAPercentageHighThreshold=" + nSLAPercentageHighThreshold +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VoiceIAQStats that = (VoiceIAQStats) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(esdId, that.esdId) &&
                Objects.equals(esdName, that.esdName) &&
                Objects.equals(nResourcesLoggedIn, that.nResourcesLoggedIn) &&
                Objects.equals(nTotalContacts, that.nTotalContacts) &&
                Objects.equals(nHandledContacts, that.nHandledContacts) &&
                Objects.equals(nAbandonedContacts, that.nAbandonedContacts) &&
                Objects.equals(nDequeuedContacts, that.nDequeuedContacts) &&
                Objects.equals(avgTalkDuration, that.avgTalkDuration) &&
                Objects.equals(longestTalkDuration, that.longestTalkDuration) &&
                Objects.equals(avgWaitDuration, that.avgWaitDuration) &&
                Objects.equals(longestWaitDuration, that.longestWaitDuration) &&
                Objects.equals(longestCurrentlyWaitingDuration, that.longestCurrentlyWaitingDuration) &&
                Objects.equals(nAvailResources, that.nAvailResources) &&
                Objects.equals(nInSessionResources, that.nInSessionResources) &&
                Objects.equals(nUnavailResources, that.nUnavailResources) &&
                Objects.equals(nWorkResources, that.nWorkResources) &&
                Objects.equals(nSelectedResources, that.nSelectedResources) &&
                Objects.equals(nWaitingContacts, that.nWaitingContacts) &&
                Objects.equals(nAverageHandlingTimeLowThreshold, that.nAverageHandlingTimeLowThreshold) &&
                Objects.equals(nAverageHandlingTimeHighThreshold, that.nAverageHandlingTimeHighThreshold) &&
                Objects.equals(nAverageWaitingTimeLowThreshold, that.nAverageWaitingTimeLowThreshold) &&
                Objects.equals(nAverageWaitingTimeHighThreshold, that.nAverageWaitingTimeHighThreshold) &&
                Objects.equals(nAbandonedCallsLowThreshold, that.nAbandonedCallsLowThreshold) &&
                Objects.equals(nAbandonedCallsHighThreshold, that.nAbandonedCallsHighThreshold) &&
                Objects.equals(nDequeuedCallsLowThreshold, that.nDequeuedCallsLowThreshold) &&
                Objects.equals(nDequeuedCallsHighThreshold, that.nDequeuedCallsHighThreshold) &&
                Objects.equals(nSLAPercentageLowThreshold, that.nSLAPercentageLowThreshold) &&
                Objects.equals(nSLAPercentageHighThreshold, that.nSLAPercentageHighThreshold);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, esdId, esdName, nResourcesLoggedIn, nTotalContacts, nHandledContacts, nAbandonedContacts, nDequeuedContacts, avgTalkDuration, longestTalkDuration, avgWaitDuration, longestWaitDuration, longestCurrentlyWaitingDuration, nAvailResources, nInSessionResources, nUnavailResources, nWorkResources, nSelectedResources, nWaitingContacts, nAverageHandlingTimeLowThreshold, nAverageHandlingTimeHighThreshold, nAverageWaitingTimeLowThreshold, nAverageWaitingTimeHighThreshold, nAbandonedCallsLowThreshold, nAbandonedCallsHighThreshold, nDequeuedCallsLowThreshold, nDequeuedCallsHighThreshold, nSLAPercentageLowThreshold, nSLAPercentageHighThreshold);
    }
}
