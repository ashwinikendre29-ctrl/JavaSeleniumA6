package project;

import java.util.ArrayList;
import java.util.List;

public class Event
{
    private int id;
    private String name;
    private String description;
    private List<Participant> participants;

    public Event(int id, String name, String description)
    {
        this.id = id;
        this.name = name;
        this.description = description;
        this.participants = new ArrayList<>();
    }

    public int getId()
    { 
    	return id;
    	}
    public String getName()
    {
      return name;
      }
    public String getDescription() 
    {
    	return description;
    	}
    public List<Participant> getParticipants()
    {
    	return participants;
    	}

    public void setName(String name) 
    { 
    	this.name = name;
    	}
    public void setDescription(String description) 
    { 
    	this.description = description;
    	}

    public void addParticipant(Participant p)
    {
        participants.add(p);
    }

    public void removeParticipant(String email) 
    {
        participants.removeIf(p -> p.getEmail().equalsIgnoreCase(email));
    }

    @Override
    public String toString()
    {
        return "Event{" + "id=" + id + ", name='" + name + '\'' + ", description='" + description + '\'' + '}';
    }
}

