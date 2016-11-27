package dk.zeed.json.jackson.dao;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CiscoStatsResponse {

    private String id;
    private String operation;

    @JsonProperty("VoiceIAQStats")
    private VoiceIAQStats VoiceIAQStats;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public dk.zeed.json.jackson.dao.VoiceIAQStats getVoiceIAQStats() {
        return VoiceIAQStats;
    }

    public void setVoiceIAQStats(dk.zeed.json.jackson.dao.VoiceIAQStats voiceIAQStats) {
        VoiceIAQStats = voiceIAQStats;
    }

    @Override
    public String toString() {
        return "CiscoStatsResponse{" +
                "id='" + id + '\'' +
                ", operation='" + operation + '\'' +
                ", VoiceIAQStats=" + VoiceIAQStats +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CiscoStatsResponse that = (CiscoStatsResponse) o;

        if (!id.equals(that.id)) return false;
        if (!operation.equals(that.operation)) return false;
        return VoiceIAQStats.equals(that.VoiceIAQStats);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + operation.hashCode();
        result = 31 * result + VoiceIAQStats.hashCode();
        return result;
    }
}
