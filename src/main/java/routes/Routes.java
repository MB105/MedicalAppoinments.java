package routes;

import controllers.DoctorMockController;
import io.javalin.Javalin;
import io.javalin.apibuilder.EndpointGroup;

import static io.javalin.apibuilder.ApiBuilder.*;

public class Routes {

    private static DoctorMockController doctorMockController = new DoctorMockController();


    public EndpointGroup getRoutes() {
        return () -> {
            path("api/doctors", () -> {
                get(doctorMockController::readAll);
                post(doctorMockController::create);
                path("{id}", () -> {
                    get(doctorMockController::read);
                    put(doctorMockController::update);
                });
                path("speciality/{speciality}", () -> {
                    get(doctorMockController::doctorBySpeciality);
                });
                path("birthdate/range", () -> {
                    get(doctorMockController::doctorByBirthdateRange);
                });
            });
        };


    }


    public static void setupRoutes(Javalin app) {
        app.get("/api/doctors", doctorMockController::readAll);
        app.post("/api/doctors", doctorMockController::create);
        app.get("/api/doctors/{id}", doctorMockController::read);
        app.put("/api/doctors/{id}", doctorMockController::update);


        app.get("/api/doctor/speciality/{speciality}", doctorMockController::doctorBySpeciality);
        app.get("/api/doctor/birthdate/range", doctorMockController::doctorByBirthdateRange);
    }
}
