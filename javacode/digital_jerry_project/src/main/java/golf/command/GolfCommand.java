package golf.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface GolfCommand{
	public abstract void execute(HttpServletRequest request, HttpServletResponse response);
	
}

