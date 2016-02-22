public class Vevent
{
	/*
		----TEMPLATE----
		https://en.wikipedia.org/wiki/ICalendar

		BEGIN:VEVENT
		UID:uid1@example.com
		DTSTAMP:19970714T170000Z
		ORGANIZER;CN=John Doe:MAILTO:john.doe@example.com
		DTSTART:19970714T170000Z
		DTEND:19970715T035959Z
		SUMMARY:Bastille Day Party
	*/

	private String UID;
	private String DTSTAMP;
	private String ORGANIZER;
	private String DTSTART;
	private String DTEND;
	private String SUMMARY;

	//default constructor
	public Vevent()
	{
					
	}

	//overloaded constructor
	public Vevent(String inputUID, String inputDTSTAMP, String inputORGANIZER, String inputDTSTART, String inputDTEND, String inputSUMMARY)
	{
		UID = inputUID;
		DTSTAMP = inputDTSTAMP;
		ORGANIZER = inputORGANIZER;
		DTSTART = inputDTSTART;
		DTEND = inputDTEND;
		SUMMARY = inputSUMMARY;						
	}

	public String getUID()
	{
		return UID;
	}

	public void setUID(String input)
	{
		UID = input;
	}

	public String getDTSTAMP()
	{
		return DTSTAMP;
	}

	public void setDTSTAMP(String input)
	{
		DTSTAMP = input;
	}

	public String getORGANIZER()
	{
		return ORGANIZER;
	}

	public void setORGANIZER(String input)
	{
		ORGANIZER = input;
	}

	public String getDTSTART()
	{
		return DTSTART;
	}

	public void setDTSTART(String input)
	{
		DTSTART = input;
	}

	public String getDTEND()
	{
		return DTEND;
	}

	public void setDTEND(String input)
	{
		DTEND = input;
	}

	public String getSUMMARY()
	{
		return SUMMARY;
	}

	public void setSUMMARY(String input)
	{
		SUMMARY = input;
	}

	public boolean validUID(String input)
	{
		//TODO
		//MAKE SURE IT IS VALID
		//https://en.wikipedia.org/wiki/ICalendar
		return true;
	}

	public boolean validDTSTAMP(String input)
	{
		//TODO
		//MAKE SURE IT IS VALID
		//https://en.wikipedia.org/wiki/ICalendar
		return true;
	}

	public boolean validORGANIZER(String input)
	{
		//TODO
		//MAKE SURE IT IS VALID
		//https://en.wikipedia.org/wiki/ICalendar
		return true;
	}

	public boolean validDTSTART(String input)
	{
		//TODO
		//MAKE SURE IT IS VALID
		//https://en.wikipedia.org/wiki/ICalendar
		return true;
	}

	public boolean validDTEND(String input)
	{
		//TODO
		//MAKE SURE IT IS VALID
		//https://en.wikipedia.org/wiki/ICalendar
		return true;
	}

	public boolean validSUMMARY(String input)
	{
		//TODO
		//not sure how to validate this, maybe limit to x characters?
		return true;
	}

	/*
		ensures that all fields of vevent are valid according to protocol
		https://en.wikipedia.org/wiki/ICalendar
	*/
	public boolean isValid()
	{
		boolean myReturn;

		if (validUID(UID) && validDTSTAMP(DTSTAMP) && validORGANIZER(ORGANIZER) && validDTSTART(DTSTART) && validDTEND(DTEND) && validSUMMARY(SUMMARY))
		{
			myReturn = true;
		}
		else
		{
			myReturn = false;
		}

		return myReturn;
	}
	
	/*
		adds all non null or empty fields to a result string
	*/
	public String toString()
	{
		String result = "";
		result += "BEGIN:VEVENT\n";

		if (UID != null && !UID.equals(""))
		{
			result += "UID:";
			result += UID;
			result += "\n";
		}

		if (DTSTAMP != null && !DTSTAMP.equals(""))
		{
			result += "DTSTAMP:";
			result += DTSTAMP;
			result += "\n";
		}

		if (ORGANIZER != null && !ORGANIZER.equals(""))
		{
			result += "ORGANIZER:";
			result += ORGANIZER;
			result += "\n";
		}

		if (DTSTART != null && !DTSTART.equals(""))
		{
			result += "DTSTART:";
			result += DTSTART;
			result += "\n";
		}

		if (DTEND != null && !DTEND.equals(""))
		{
			result += "DTEND:";
			result += DTEND;
			result += "\n";
		}

		if (SUMMARY != null && !SUMMARY.equals(""))
		{
			result += "SUMMARY:";
			result += SUMMARY;
			result += "\n";
		}

		result += "END:VEVENT\n";

		return result;
	}
}