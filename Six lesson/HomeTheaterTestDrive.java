public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheater = 
            new HomeTheaterFacade(amp, 
            tuner, 
            dvd, 
            cd, 
            projector, 
            screen, 
            lights, 
            popper);

        homeTheater.watchMovie("Raiders of the lost");
        homeTheater.endMovie();
    }
}