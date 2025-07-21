package com.midicap.midicap;

import java.io.Serializable;

/**
 * Java Bean representing the Key0 configuration.
 * This class maps to the key0.txt file format where each option is defined as:
 * OPTION_NAME = [value] # documentation
 * 
 * Key mapping reference:
 * key1 (ID:0)----key2 (ID:1)----key3 (ID:2)----key4 (ID:3)----key5 (ID:4)
 * keyA (ID:5)----keyB (ID:6)----keyC (ID:7)----keyD (ID:8)----keyE (ID:9)
 */
public class KeyConfiguration implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    /**
     * Quick way to change or swap key positions
     */
    private int keyId = 0;
    
    /**
     * 0:Disable   1:Enable
     */
    private boolean keyColorOverwrite = false; // 0 = false, 1 = true
    
    /**
     * User-defined key color in hex format
     */
    private String keyColorUser = "0x00FF00";
    
    // Press-down action settings
    
    /**
     * 0:Disable   1:Enable
     */
    private boolean keyPressEnable = true; // 0 = false, 1 = true
    
    /**
     * 0:PC        1:CC       2:NOTE      3:UP     4:DOWN
     */
    private int keyPressMode = 1;
    
    /**
     * 0:AUTO      1:FIXED
     */
    private int keyPressPcMode = 1;
    
    /**
     * 0-127 FIXED VALUE
     */
    private int keyPressPcFixed = 7;
    
    /**
     * 0-127
     */
    private int keyPressCcNumber = 20;
    
    /**
     * 0-127
     */
    private int keyPressCcValue = 127;
    
    /**
     * 0: OFF      1:ON  Control the LED work as scene control
     */
    private boolean keyPressCcScene = false; // 0 = false, 1 = true
    
    /**
     * 0: OFF      1:ON  Enable when the key is for TAP using
     */
    private boolean keyPressCcTap = false; // 0 = false, 1 = true
    
    /**
     * 0:OFF       1:ON  Auto toggle between SubNum and 0
     */
    private boolean keyPressCcToggle = true; // 0 = false, 1 = true
    
    /**
     * 0-127 Please refer to the note table at the end
     */
    private int keyPressNoteNumber = 60;
    
    /**
     * 0-127 Note loudness
     */
    private int keyPressNoteStrike = 127;
    
    // Release-up action settings
    
    /**
     * 0:Disable   1:Enable (For "moment" function the "Release" action must be enabled)
     */
    private boolean keyReleaseEnable = false; // 0 = false, 1 = true
    
    /**
     * 0:PC        1:CC       2:NOTE      3:UP     4:DOWN
     */
    private int keyReleaseMode = 1;
    
    /**
     * 0:AUTO      1:FIXED
     */
    private int keyReleasePcMode = 0;
    
    /**
     * 0-127 FIXED VALUE
     */
    private int keyReleasePcFixed = 8;
    
    /**
     * 0-127
     */
    private int keyReleaseCcNumber = 3;
    
    /**
     * 0-127
     */
    private int keyReleaseCcValue = 7;
    
    /**
     * 0:OFF       1:ON  Auto toggle between SubNum and 0
     */
    private boolean keyReleaseCcToggle = true; // 0 = false, 1 = true
    
    /**
     * 0-127 Please refer to the following note table
     */
    private int keyReleaseNoteNumber = 61;
    
    /**
     * 0-127 Note loudness
     */
    private int keyReleaseNoteStrike = 80;
    
    // Default constructor
    public KeyConfiguration() {
    }
    
    // Getters and Setters
    
    public int getKeyId() {
        return keyId;
    }
    
    public void setKeyId(int keyId) {
        this.keyId = keyId;
    }
    
    public boolean isKeyColorOverwrite() {
        return keyColorOverwrite;
    }
    
    public void setKeyColorOverwrite(boolean keyColorOverwrite) {
        this.keyColorOverwrite = keyColorOverwrite;
    }
    
    public String getKeyColorUser() {
        return keyColorUser;
    }
    
    public void setKeyColorUser(String keyColorUser) {
        this.keyColorUser = keyColorUser;
    }
    
    public boolean isKeyPressEnable() {
        return keyPressEnable;
    }
    
    public void setKeyPressEnable(boolean keyPressEnable) {
        this.keyPressEnable = keyPressEnable;
    }
    
    public int getKeyPressMode() {
        return keyPressMode;
    }
    
    public void setKeyPressMode(int keyPressMode) {
        this.keyPressMode = keyPressMode;
    }
    
    public int getKeyPressPcMode() {
        return keyPressPcMode;
    }
    
    public void setKeyPressPcMode(int keyPressPcMode) {
        this.keyPressPcMode = keyPressPcMode;
    }
    
    public int getKeyPressPcFixed() {
        return keyPressPcFixed;
    }
    
    public void setKeyPressPcFixed(int keyPressPcFixed) {
        this.keyPressPcFixed = keyPressPcFixed;
    }
    
    public int getKeyPressCcNumber() {
        return keyPressCcNumber;
    }
    
    public void setKeyPressCcNumber(int keyPressCcNumber) {
        this.keyPressCcNumber = keyPressCcNumber;
    }
    
    public int getKeyPressCcValue() {
        return keyPressCcValue;
    }
    
    public void setKeyPressCcValue(int keyPressCcValue) {
        this.keyPressCcValue = keyPressCcValue;
    }
    
    public boolean isKeyPressCcScene() {
        return keyPressCcScene;
    }
    
    public void setKeyPressCcScene(boolean keyPressCcScene) {
        this.keyPressCcScene = keyPressCcScene;
    }
    
    public boolean isKeyPressCcTap() {
        return keyPressCcTap;
    }
    
    public void setKeyPressCcTap(boolean keyPressCcTap) {
        this.keyPressCcTap = keyPressCcTap;
    }
    
    public boolean isKeyPressCcToggle() {
        return keyPressCcToggle;
    }
    
    public void setKeyPressCcToggle(boolean keyPressCcToggle) {
        this.keyPressCcToggle = keyPressCcToggle;
    }
    
    public int getKeyPressNoteNumber() {
        return keyPressNoteNumber;
    }
    
    public void setKeyPressNoteNumber(int keyPressNoteNumber) {
        this.keyPressNoteNumber = keyPressNoteNumber;
    }
    
    public int getKeyPressNoteStrike() {
        return keyPressNoteStrike;
    }
    
    public void setKeyPressNoteStrike(int keyPressNoteStrike) {
        this.keyPressNoteStrike = keyPressNoteStrike;
    }
    
    public boolean isKeyReleaseEnable() {
        return keyReleaseEnable;
    }
    
    public void setKeyReleaseEnable(boolean keyReleaseEnable) {
        this.keyReleaseEnable = keyReleaseEnable;
    }
    
    public int getKeyReleaseMode() {
        return keyReleaseMode;
    }
    
    public void setKeyReleaseMode(int keyReleaseMode) {
        this.keyReleaseMode = keyReleaseMode;
    }
    
    public int getKeyReleasePcMode() {
        return keyReleasePcMode;
    }
    
    public void setKeyReleasePcMode(int keyReleasePcMode) {
        this.keyReleasePcMode = keyReleasePcMode;
    }
    
    public int getKeyReleasePcFixed() {
        return keyReleasePcFixed;
    }
    
    public void setKeyReleasePcFixed(int keyReleasePcFixed) {
        this.keyReleasePcFixed = keyReleasePcFixed;
    }
    
    public int getKeyReleaseCcNumber() {
        return keyReleaseCcNumber;
    }
    
    public void setKeyReleaseCcNumber(int keyReleaseCcNumber) {
        this.keyReleaseCcNumber = keyReleaseCcNumber;
    }
    
    public int getKeyReleaseCcValue() {
        return keyReleaseCcValue;
    }
    
    public void setKeyReleaseCcValue(int keyReleaseCcValue) {
        this.keyReleaseCcValue = keyReleaseCcValue;
    }
    
    public boolean isKeyReleaseCcToggle() {
        return keyReleaseCcToggle;
    }
    
    public void setKeyReleaseCcToggle(boolean keyReleaseCcToggle) {
        this.keyReleaseCcToggle = keyReleaseCcToggle;
    }
    
    public int getKeyReleaseNoteNumber() {
        return keyReleaseNoteNumber;
    }
    
    public void setKeyReleaseNoteNumber(int keyReleaseNoteNumber) {
        this.keyReleaseNoteNumber = keyReleaseNoteNumber;
    }
    
    public int getKeyReleaseNoteStrike() {
        return keyReleaseNoteStrike;
    }
    
    public void setKeyReleaseNoteStrike(int keyReleaseNoteStrike) {
        this.keyReleaseNoteStrike = keyReleaseNoteStrike;
    }
    
    /**
     * Enum for key press/release modes
     */
    public enum KeyMode {
        PC(0),      // Program Change
        CC(1),      // Control Change
        NOTE(2),    // Note
        UP(3),      // Up
        DOWN(4);    // Down
        
        private final int value;
        
        KeyMode(int value) {
            this.value = value;
        }
        
        public int getValue() {
            return value;
        }
        
        public static KeyMode fromValue(int value) {
            for (KeyMode mode : values()) {
                if (mode.value == value) {
                    return mode;
                }
            }
            throw new IllegalArgumentException("Invalid key mode value: " + value);
        }
    }
    
    /**
     * Enum for PC modes
     */
    public enum PcMode {
        AUTO(0),    // Auto
        FIXED(1);   // Fixed
        
        private final int value;
        
        PcMode(int value) {
            this.value = value;
        }
        
        public int getValue() {
            return value;
        }
        
        public static PcMode fromValue(int value) {
            for (PcMode mode : values()) {
                if (mode.value == value) {
                    return mode;
                }
            }
            throw new IllegalArgumentException("Invalid PC mode value: " + value);
        }
    }
    
    @Override
    public String toString() {
        return "Key0{" +
                "keyId=" + keyId +
                ", keyColorOverwrite=" + keyColorOverwrite +
                ", keyColorUser='" + keyColorUser + '\'' +
                ", keyPressEnable=" + keyPressEnable +
                ", keyPressMode=" + keyPressMode +
                ", keyPressPcMode=" + keyPressPcMode +
                ", keyPressPcFixed=" + keyPressPcFixed +
                ", keyPressCcNumber=" + keyPressCcNumber +
                ", keyPressCcValue=" + keyPressCcValue +
                ", keyPressCcScene=" + keyPressCcScene +
                ", keyPressCcTap=" + keyPressCcTap +
                ", keyPressCcToggle=" + keyPressCcToggle +
                ", keyPressNoteNumber=" + keyPressNoteNumber +
                ", keyPressNoteStrike=" + keyPressNoteStrike +
                ", keyReleaseEnable=" + keyReleaseEnable +
                ", keyReleaseMode=" + keyReleaseMode +
                ", keyReleasePcMode=" + keyReleasePcMode +
                ", keyReleasePcFixed=" + keyReleasePcFixed +
                ", keyReleaseCcNumber=" + keyReleaseCcNumber +
                ", keyReleaseCcValue=" + keyReleaseCcValue +
                ", keyReleaseCcToggle=" + keyReleaseCcToggle +
                ", keyReleaseNoteNumber=" + keyReleaseNoteNumber +
                ", keyReleaseNoteStrike=" + keyReleaseNoteStrike +
                '}';
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        
        KeyConfiguration key0 = (KeyConfiguration) o;
        
        if (keyId != key0.keyId) return false;
        if (keyColorOverwrite != key0.keyColorOverwrite) return false;
        if (keyPressEnable != key0.keyPressEnable) return false;
        if (keyPressMode != key0.keyPressMode) return false;
        if (keyPressPcMode != key0.keyPressPcMode) return false;
        if (keyPressPcFixed != key0.keyPressPcFixed) return false;
        if (keyPressCcNumber != key0.keyPressCcNumber) return false;
        if (keyPressCcValue != key0.keyPressCcValue) return false;
        if (keyPressCcScene != key0.keyPressCcScene) return false;
        if (keyPressCcTap != key0.keyPressCcTap) return false;
        if (keyPressCcToggle != key0.keyPressCcToggle) return false;
        if (keyPressNoteNumber != key0.keyPressNoteNumber) return false;
        if (keyPressNoteStrike != key0.keyPressNoteStrike) return false;
        if (keyReleaseEnable != key0.keyReleaseEnable) return false;
        if (keyReleaseMode != key0.keyReleaseMode) return false;
        if (keyReleasePcMode != key0.keyReleasePcMode) return false;
        if (keyReleasePcFixed != key0.keyReleasePcFixed) return false;
        if (keyReleaseCcNumber != key0.keyReleaseCcNumber) return false;
        if (keyReleaseCcValue != key0.keyReleaseCcValue) return false;
        if (keyReleaseCcToggle != key0.keyReleaseCcToggle) return false;
        if (keyReleaseNoteNumber != key0.keyReleaseNoteNumber) return false;
        if (keyReleaseNoteStrike != key0.keyReleaseNoteStrike) return false;
        return keyColorUser != null ? keyColorUser.equals(key0.keyColorUser) : key0.keyColorUser == null;
    }
    
    @Override
    public int hashCode() {
        int result = keyId;
        result = 31 * result + (keyColorOverwrite ? 1 : 0);
        result = 31 * result + (keyColorUser != null ? keyColorUser.hashCode() : 0);
        result = 31 * result + (keyPressEnable ? 1 : 0);
        result = 31 * result + keyPressMode;
        result = 31 * result + keyPressPcMode;
        result = 31 * result + keyPressPcFixed;
        result = 31 * result + keyPressCcNumber;
        result = 31 * result + keyPressCcValue;
        result = 31 * result + (keyPressCcScene ? 1 : 0);
        result = 31 * result + (keyPressCcTap ? 1 : 0);
        result = 31 * result + (keyPressCcToggle ? 1 : 0);
        result = 31 * result + keyPressNoteNumber;
        result = 31 * result + keyPressNoteStrike;
        result = 31 * result + (keyReleaseEnable ? 1 : 0);
        result = 31 * result + keyReleaseMode;
        result = 31 * result + keyReleasePcMode;
        result = 31 * result + keyReleasePcFixed;
        result = 31 * result + keyReleaseCcNumber;
        result = 31 * result + keyReleaseCcValue;
        result = 31 * result + (keyReleaseCcToggle ? 1 : 0);
        result = 31 * result + keyReleaseNoteNumber;
        result = 31 * result + keyReleaseNoteStrike;
        return result;
    }
} 