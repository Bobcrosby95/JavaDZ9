public class Radio {
    public int currentRadiostation;

    public void setToRadiostation() {
        currentRadiostation = 9;
    }

    public void nextRadiostation(int next) {
        if (next < 9) {
            next = next + 1;
        } else if (next == 9) {
            next = 9;
        } else if (next > 9)
            next = 0;
        currentRadiostation = next;
    }

    public void prevRadiostation(int prev) {
        if (prev >= 9) {
            prev = prev - 1;
        } else if (prev <= 0)
            prev = 0;
        currentRadiostation = prev;
    }

    public int currentVolume;

    public void increaseVolume(int volumePluse) {
        if (volumePluse < 100) {
            volumePluse = volumePluse + 1;
        } else if (volumePluse == 100) {
            volumePluse = 100;
        } else if (volumePluse > 100) {
            volumePluse = 100;
        }
        currentVolume = volumePluse;
    }

    public void decreaseVolume(int volumeMinus) {
        if (volumeMinus >= 100) {
            volumeMinus = volumeMinus - 1;
        } else if (volumeMinus <= 0) {
            volumeMinus = 0;
        }
        currentVolume = volumeMinus;
    }
}

