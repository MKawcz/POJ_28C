package com.company.lab3;

public class Remote {
    TV tv;

    public Remote(TV tv) {
        this.tv = tv;

    }

    public int change_channel_up() {
        if (tv.on &&  tv.channel >= 1 && tv.channel < 20) {
            tv.channel = tv.channel + 1;
            return tv.channel;
        } else {
            System.out.println("Błąd");
            return tv.channel;
        }
    }

    public int change_channel_down() {
       if (tv.on && tv.channel > 1 && tv.channel <= 20)  {
            tv.channel = tv.channel - 1;
            return tv.channel;
        } else {
            System.out.println("Błąd");
            return tv.channel;
        }
    }

    public int change_volume_up() {
        if (tv.on &&  tv.volume >= 1 && tv.volume < 10) {
            tv.volume = tv.volume + 1;
            return tv.volume;
        } else {
            System.out.println("Błąd");
            return tv.volume;
        }
    }

    public int change_volume_down() {
        if (tv.on && tv.volume > 1 && tv.volume <= 10)  {
            tv.volume = tv.volume - 1;
            return tv.volume;
        } else {
            System.out.println("Błąd");
            return tv.volume;
        }
    }

    public String turn() {
        if (tv.on == false) {
            tv.on = true;
            return "włączyłeś TV";
        } else {
            tv.on = false;
            return "wyłączyłeś TV";
        }
    }

}
