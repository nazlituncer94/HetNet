package android_network.hetnet.network;

import java.util.Date;

public class NetworkResponseEvent {
  private String eventOriginator;
  private String listOfNetworks;
  private Date timeOfEvent;

  public NetworkResponseEvent(String eventOriginator, String listOfNetworks, Date timeOfEvent) {
    this.eventOriginator = eventOriginator;
    this.listOfNetworks = listOfNetworks;
    this.timeOfEvent = timeOfEvent;
  }

  public String getEventOriginator() {
    return eventOriginator;
  }

  public void setEventOriginator(String eventOriginator) {
    this.eventOriginator = eventOriginator;
  }

  public String getListOfNetworks() {
    return listOfNetworks;
  }

  public void setListOfNetworks(String listOfNetworks) {
    this.listOfNetworks = listOfNetworks;
  }

  public Date getTimeOfEvent() {
    return timeOfEvent;
  }

  public void setTimeOfEvent(Date timeOfEvent) {
    this.timeOfEvent = timeOfEvent;
  }
}