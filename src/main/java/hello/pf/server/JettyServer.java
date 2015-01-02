package hello.pf.server;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class JettyServer {
	
	public static void main(String[] args) throws Exception {

		Server server = new Server(8088);

		WebAppContext webapp = new WebAppContext();
		
		webapp.setContextPath("/hello-pf");
		webapp.setDescriptor("src/main/webapp/WEB-INF/web.xml");
		webapp.setResourceBase("src/main/webapp/");
		webapp.setParentLoaderPriority(true);
 
        server.setHandler(webapp);
        
		// Start the server
		server.start();
		server.join();

	}

}
