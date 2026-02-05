package project;

	import java.util.*;

	public class EventManager 
	{
	    private Map<Integer, Event> events = new HashMap<>();
	    private int nextId = 1;

	    public void addEvent(String name, String description)
	    {
	        Event event = new Event(nextId++, name, description);
	        events.put(event.getId(), event);
	        System.out.println("Event added: " + event);
	    }

	    public void updateEvent(int id, String newName, String newDescription) 
	    {
	        Event event = events.get(id);
	        if (event != null) 
	        {
	            event.setName(newName);
	            event.setDescription(newDescription);
	            System.out.println("Event updated: " + event);
	        } else 
	        {
	            System.out.println("Event not found.");
	        }
	    }

	    public void deleteEvent(int id)
	    {
	        if (events.remove(id) != null) 
	        {
	            System.out.println("Event deleted.");
	        } else 
	        {
	            System.out.println("Event not found.");
	        }
	    }

	    public void registerParticipant(int eventId, String name, String email)
	    {
	        Event event = events.get(eventId);
	        if (event != null)
	        {
	            Participant p = new Participant(name, email);
	            event.addParticipant(p);
	            System.out.println("Participant registered: " + p);
	        } 
	        else 
	        {
	            System.out.println("Event not found.");
	        }
	    }

	    public void listParticipants(int eventId)
	    {
	        Event event = events.get(eventId);
	        if (event != null)
	        {
	            List<Participant> list = event.getParticipants();
	            if (list.isEmpty()) 
	            {
	                System.out.println("No participants.");
	            } 
	            else
	            {
	                System.out.println("Participants:");
	                for (Participant p : list)
	                {
	                    System.out.println(p);
	                }
	            }
	        } 
	        else
	        {
	            System.out.println("Event not found.");
	        }
	    }

	    public void cancelRegistration(int eventId, String email)
	    {
	        Event event = events.get(eventId);
	        if (event != null) 
	        {
	            event.removeParticipant(email);
	            System.out.println("Registration canceled for: " + email);
	        } 
	        else 
	        {
	            System.out.println("Event not found.");
	        }
	    }

	    public void listEvents()
	    {
	        if (events.isEmpty())
	        {
	            System.out.println("No events available.");
	            return;
	        }
	        System.out.println("Events:");
	        for (Event e : events.values())
            {
	            System.out.println(e);
	        }
	    }
	}

