package com.midicap.midicap;

import java.io.Serializable;

/**
 * Java Bean representing the Global Setup configuration.
 * This class maps to the GlobalSetup.txt file format where each option is defined as:
 * OPTION_NAME = [value] # documentation
 */
public class GlobalSetup implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    /**
     * Current preset number (Do not change)
     */
    private int currentPreset = 7;
    
    /**
     * Preset name with length 5 characters
     */
    private String presetName = "ALLCC";
    
    /**
     * ON: the main screen font is dark color type. OFF: light color type
     */
    private boolean darkFonts = true; // ON = true, OFF = false
    
    /**
     * 1-100 Background brightness
     */
    private int screenLight = 80;
    
    /**
     * 0-100 Recommend <= 10 to save battery
     */
    private int ledLight = 25;
    
    /**
     * Turn off when connecting to mobile Host device which has less current output
     */
    private boolean batteryCharge = false; // OFF = false, ON = true
    
    /**
     * Turn off to save battery when not using MIDI MATE wireless receiver
     */
    private boolean wireless24G = false; // OFF = false, ON = true
    
    /**
     * 1-100 This ID should be the receiver's. Need restart to be activated
     */
    private int wirelessId = 8;
    
    /**
     * 1-16 Match the MIDI CHANNEL between the controller and the host device
     */
    private int midiChannel = 1;
    
    /**
     * 0 or 1 The program change number start from 0 or 1
     */
    private int pcNumStart = 0;
    
    /**
     * Turn on to forward MIDI message from MIDI IN to MIDI OUT
     */
    private boolean midiThrough = true; // ON = true, OFF = false
    
    /**
     * 1-3 Choose the different power-on pictures which can be customized
     */
    private int powerOnPic = 2;
    
    /**
     * <= 12 Chars can only be changed here in usb disk mode
     */
    private String powerOnText = "MIDI CAPTAIN";
    
    /**
     * 1, 2, 3, 4, 5, 8 The number of programs change over each BANK +/-
     */
    private int bankStep = 1;
    
    /**
     * OFF means when PC bank group change No PC send until A B C D pressed
     */
    private boolean bankSend = true; // ON = true, OFF = false
    
    /**
     * 0-127 The CC# of EXP1 pedal channel
     */
    private int exp1Cc = 1;
    
    /**
     * 0-127 The CC# of EXP2 pedal channel
     */
    private int exp2Cc = 11;
    
    /**
     * Turn off to avoid miss-tuning of PC number by foot touch
     */
    private boolean wheelManual = true; // ON = true, OFF = false
    
    /**
     * Turn ON/OFF action sequence recording
     */
    private boolean timeEngine = false; // OFF = false, ON = true
    
    /**
     * 1-10 Select the time recording track to be recorded in or played
     */
    private int timeTrack = 1;
    
    /**
     * SINGLE or REPEAT when playing the recorded actions
     */
    private boolean loopRepeat = false; // OFF = false, ON = true
    
    /**
     * 1 when dark_font is off; 2 when dark_font is on
     */
    private int wallpaper = 2;
    
    /**
     * Wireless power levels:
     * 0:12dBm 1:10dBm 2:9dBm 3:8dBm 4:6dBm 5:3dBm 6:0dBm 7:-2dBm 8:-5dBm
     * 9:-10dBm 10:-15dBm 11:-20dBm 12:-25dBm 13:-30dBm 14:-25dBm
     */
    private int wirelessDb = 6;
    
    // Default constructor
    public GlobalSetup() {
    }
    
    // Getters and Setters
    
    public int getCurrentPreset() {
        return currentPreset;
    }
    
    public void setCurrentPreset(int currentPreset) {
        this.currentPreset = currentPreset;
    }
    
    public String getPresetName() {
        return presetName;
    }
    
    public void setPresetName(String presetName) {
        this.presetName = presetName;
    }
    
    public boolean isDarkFonts() {
        return darkFonts;
    }
    
    public void setDarkFonts(boolean darkFonts) {
        this.darkFonts = darkFonts;
    }
    
    public int getScreenLight() {
        return screenLight;
    }
    
    public void setScreenLight(int screenLight) {
        this.screenLight = screenLight;
    }
    
    public int getLedLight() {
        return ledLight;
    }
    
    public void setLedLight(int ledLight) {
        this.ledLight = ledLight;
    }
    
    public boolean isBatteryCharge() {
        return batteryCharge;
    }
    
    public void setBatteryCharge(boolean batteryCharge) {
        this.batteryCharge = batteryCharge;
    }
    
    public boolean isWireless24G() {
        return wireless24G;
    }
    
    public void setWireless24G(boolean wireless24G) {
        this.wireless24G = wireless24G;
    }
    
    public int getWirelessId() {
        return wirelessId;
    }
    
    public void setWirelessId(int wirelessId) {
        this.wirelessId = wirelessId;
    }
    
    public int getMidiChannel() {
        return midiChannel;
    }
    
    public void setMidiChannel(int midiChannel) {
        this.midiChannel = midiChannel;
    }
    
    public int getPcNumStart() {
        return pcNumStart;
    }
    
    public void setPcNumStart(int pcNumStart) {
        this.pcNumStart = pcNumStart;
    }
    
    public boolean isMidiThrough() {
        return midiThrough;
    }
    
    public void setMidiThrough(boolean midiThrough) {
        this.midiThrough = midiThrough;
    }
    
    public int getPowerOnPic() {
        return powerOnPic;
    }
    
    public void setPowerOnPic(int powerOnPic) {
        this.powerOnPic = powerOnPic;
    }
    
    public String getPowerOnText() {
        return powerOnText;
    }
    
    public void setPowerOnText(String powerOnText) {
        this.powerOnText = powerOnText;
    }
    
    public int getBankStep() {
        return bankStep;
    }
    
    public void setBankStep(int bankStep) {
        this.bankStep = bankStep;
    }
    
    public boolean isBankSend() {
        return bankSend;
    }
    
    public void setBankSend(boolean bankSend) {
        this.bankSend = bankSend;
    }
    
    public int getExp1Cc() {
        return exp1Cc;
    }
    
    public void setExp1Cc(int exp1Cc) {
        this.exp1Cc = exp1Cc;
    }
    
    public int getExp2Cc() {
        return exp2Cc;
    }
    
    public void setExp2Cc(int exp2Cc) {
        this.exp2Cc = exp2Cc;
    }
    
    public boolean isWheelManual() {
        return wheelManual;
    }
    
    public void setWheelManual(boolean wheelManual) {
        this.wheelManual = wheelManual;
    }
    
    public boolean isTimeEngine() {
        return timeEngine;
    }
    
    public void setTimeEngine(boolean timeEngine) {
        this.timeEngine = timeEngine;
    }
    
    public int getTimeTrack() {
        return timeTrack;
    }
    
    public void setTimeTrack(int timeTrack) {
        this.timeTrack = timeTrack;
    }
    
    public boolean isLoopRepeat() {
        return loopRepeat;
    }
    
    public void setLoopRepeat(boolean loopRepeat) {
        this.loopRepeat = loopRepeat;
    }
    
    public int getWallpaper() {
        return wallpaper;
    }
    
    public void setWallpaper(int wallpaper) {
        this.wallpaper = wallpaper;
    }
    
    public int getWirelessDb() {
        return wirelessDb;
    }
    
    public void setWirelessDb(int wirelessDb) {
        this.wirelessDb = wirelessDb;
    }
    
    @Override
    public String toString() {
        return "GlobalSetup{" +
                "currentPreset=" + currentPreset +
                ", presetName='" + presetName + '\'' +
                ", darkFonts=" + darkFonts +
                ", screenLight=" + screenLight +
                ", ledLight=" + ledLight +
                ", batteryCharge=" + batteryCharge +
                ", wireless24G=" + wireless24G +
                ", wirelessId=" + wirelessId +
                ", midiChannel=" + midiChannel +
                ", pcNumStart=" + pcNumStart +
                ", midiThrough=" + midiThrough +
                ", powerOnPic=" + powerOnPic +
                ", powerOnText='" + powerOnText + '\'' +
                ", bankStep=" + bankStep +
                ", bankSend=" + bankSend +
                ", exp1Cc=" + exp1Cc +
                ", exp2Cc=" + exp2Cc +
                ", wheelManual=" + wheelManual +
                ", timeEngine=" + timeEngine +
                ", timeTrack=" + timeTrack +
                ", loopRepeat=" + loopRepeat +
                ", wallpaper=" + wallpaper +
                ", wirelessDb=" + wirelessDb +
                '}';
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        
        GlobalSetup that = (GlobalSetup) o;
        
        if (currentPreset != that.currentPreset) return false;
        if (darkFonts != that.darkFonts) return false;
        if (screenLight != that.screenLight) return false;
        if (ledLight != that.ledLight) return false;
        if (batteryCharge != that.batteryCharge) return false;
        if (wireless24G != that.wireless24G) return false;
        if (wirelessId != that.wirelessId) return false;
        if (midiChannel != that.midiChannel) return false;
        if (pcNumStart != that.pcNumStart) return false;
        if (midiThrough != that.midiThrough) return false;
        if (powerOnPic != that.powerOnPic) return false;
        if (bankStep != that.bankStep) return false;
        if (bankSend != that.bankSend) return false;
        if (exp1Cc != that.exp1Cc) return false;
        if (exp2Cc != that.exp2Cc) return false;
        if (wheelManual != that.wheelManual) return false;
        if (timeEngine != that.timeEngine) return false;
        if (timeTrack != that.timeTrack) return false;
        if (loopRepeat != that.loopRepeat) return false;
        if (wallpaper != that.wallpaper) return false;
        if (wirelessDb != that.wirelessDb) return false;
        return presetName != null ? presetName.equals(that.presetName) : that.presetName == null &&
                (powerOnText != null ? powerOnText.equals(that.powerOnText) : that.powerOnText == null);
    }
    
    @Override
    public int hashCode() {
        int result = currentPreset;
        result = 31 * result + (presetName != null ? presetName.hashCode() : 0);
        result = 31 * result + (darkFonts ? 1 : 0);
        result = 31 * result + screenLight;
        result = 31 * result + ledLight;
        result = 31 * result + (batteryCharge ? 1 : 0);
        result = 31 * result + (wireless24G ? 1 : 0);
        result = 31 * result + wirelessId;
        result = 31 * result + midiChannel;
        result = 31 * result + pcNumStart;
        result = 31 * result + (midiThrough ? 1 : 0);
        result = 31 * result + powerOnPic;
        result = 31 * result + (powerOnText != null ? powerOnText.hashCode() : 0);
        result = 31 * result + bankStep;
        result = 31 * result + (bankSend ? 1 : 0);
        result = 31 * result + exp1Cc;
        result = 31 * result + exp2Cc;
        result = 31 * result + (wheelManual ? 1 : 0);
        result = 31 * result + (timeEngine ? 1 : 0);
        result = 31 * result + timeTrack;
        result = 31 * result + (loopRepeat ? 1 : 0);
        result = 31 * result + wallpaper;
        result = 31 * result + wirelessDb;
        return result;
    }
} 