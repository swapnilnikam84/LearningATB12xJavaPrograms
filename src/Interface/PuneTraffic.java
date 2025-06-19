package Interface;

public class PuneTraffic implements CentralTraffic,StateTraffic {

    public static void main(String[] args) {

        CentralTraffic ct = new PuneTraffic();
        ct.greenGo();
        ct.redStop();
        ct.flashYellow();

        PuneTraffic pt = new PuneTraffic();
        pt.walkTrack();

        StateTraffic st = new PuneTraffic();
        st.TrainSignals();
    }

    @Override
    public void greenGo() {
        System.out.println("Green Go implementation");
    }

    @Override
    public void redStop() {
        System.out.println("Red Stop implementation");
    }

    @Override
    public void flashYellow() {
        System.out.println("Flash Yellow implementation");
    }

    public void walkTrack()
    {
        System.out.println("Pune walkTrack implementation");
    }


    @Override
    public void TrainSignals() {
        System.out.println("Train Signals implementation");
    }
}