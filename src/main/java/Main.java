import io.javalin.Javalin;
import routes.Routes;

import static io.javalin.apibuilder.ApiBuilder.*;

public class Main {
    public static void main(String[] args) {
        Javalin app = Javalin.create().start(7070);

        Routes routes = new Routes();

        routes.setupRoutes(app);
    }
}



