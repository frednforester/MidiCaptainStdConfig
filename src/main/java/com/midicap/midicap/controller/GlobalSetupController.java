package com.midicap.midicap.controller;

import com.midicap.midicap.GlobalSetup;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
@RequestMapping("/global-setup")
public class GlobalSetupController {

    @GetMapping
    public String showGlobalSetupForm(Model model) {
        GlobalSetup globalSetup = new GlobalSetup();
        model.addAttribute("globalSetup", globalSetup);
        model.addAttribute("title", "Global Setup");
        return "global-setup";
    }

    @PostMapping("/generate")
    public void generateGlobalSetupFile(
            @RequestParam("currentPreset") int currentPreset,
            @RequestParam("presetName") String presetName,
            @RequestParam("darkFonts") boolean darkFonts,
            @RequestParam("screenLight") int screenLight,
            @RequestParam("ledLight") int ledLight,
            @RequestParam("batteryCharge") boolean batteryCharge,
            @RequestParam("wireless24G") boolean wireless24G,
            @RequestParam("wirelessId") int wirelessId,
            @RequestParam("midiChannel") int midiChannel,
            @RequestParam("pcNumStart") int pcNumStart,
            @RequestParam("midiThrough") boolean midiThrough,
            @RequestParam("powerOnPic") int powerOnPic,
            @RequestParam("powerOnText") String powerOnText,
            @RequestParam("bankStep") int bankStep,
            @RequestParam("bankSend") boolean bankSend,
            @RequestParam("exp1Cc") int exp1Cc,
            @RequestParam("exp2Cc") int exp2Cc,
            @RequestParam("wheelManual") boolean wheelManual,
            @RequestParam("timeEngine") boolean timeEngine,
            @RequestParam("timeTrack") int timeTrack,
            @RequestParam("loopRepeat") boolean loopRepeat,
            @RequestParam("wallpaper") int wallpaper,
            @RequestParam("wirelessDb") int wirelessDb,
            HttpServletResponse response) throws IOException {

        // Set response headers for file download
        response.setContentType("text/plain");
        response.setHeader("Content-Disposition", "attachment; filename=\"GlobalSetup" + currentPreset + ".txt\"");
        response.setCharacterEncoding("UTF-8");

        try (PrintWriter writer = response.getWriter()) {
            writer.println("CURRENT_PRESET= [" + currentPreset + "] # Preset 0-9#..........................................................................");
            writer.println("PRESET_NAME   = [" + presetName + "] # Any Name with length 5................................................................");
            writer.println("DARK_FONTS    = [" + (darkFonts ? "ON" : "OFF") + "] # ON: the main screen font is dark color type. OFF: light color type......................");
            writer.println("SCREEN_LIGHT  = [" + screenLight + "] # 1-100 Background brightness.............................................................");
            writer.println("LED_LIGHT     = [" + ledLight + "] # 0-100 Recommend <= 10 to save battery..................................................");
            writer.println("BATTERY_CHARGE= [" + (batteryCharge ? "ON" : "OFF") + "] # Turn off when connecting to mobile Host device which has less current output..........");
            writer.println("WIRELESS_2.4G = [" + (wireless24G ? "ON" : "OFF") + "] # Turn off to save battery when not using MIDI MATE wireless receiver.................");
            writer.println("WIRELESS_ID   = [" + wirelessId + "] # 1-100 This ID should be the receiver's. Need restart to be actived.....................");
            writer.println("MIDI_CHANNEL  = [" + midiChannel + "] # 1-16 Match the MIDI CHANNEL between the controller and the host device.................");
            writer.println("PC_NUM_START  = [" + pcNumStart + "] # 0 or 1  The program change number start from 0 or 1....................................");
            writer.println("MIDI_THROUGH  = [" + (midiThrough ? "ON" : "OFF") + "] # Turn on to forward MIDI message from MIDI IN to MIDI OUT.............................");
            writer.println("POWER_ON_PIC  = [" + powerOnPic + "] # 1-3 Choose the different power-on pictures which can be customized.....................");
            writer.println("POWER_ON_TEXT = [" + powerOnText + "] # <= 12 Chars can only be changed here in usb disk mode......................");
            writer.println("BANK_STEP     = [" + bankStep + "] # 1, 2, 3, 4, 5, 8  The number of programs change over each BANK +/-.....................");
            writer.println("BANK_SEND     = [" + (bankSend ? "ON" : "OFF") + "] # OFF means when PC bank group change No PC send until A B C D pressed.................");
            writer.println("EXP1_CC#      = [" + exp1Cc + "] # 0-127 The CC# of EXP1 pedal channel...................................................");
            writer.println("EXP2_CC#      = [" + exp2Cc + "] # 0-127 The CC# of EXP2 pedal channel...................................................");
            writer.println("WHEEL_MANUAL  = [" + (wheelManual ? "ON" : "OFF") + "] # Turn off to avoid miss-tuning of PC number by foot touch............................");
            writer.println("TIME_ENGINE   = [" + (timeEngine ? "ON" : "OFF") + "] # Turn ON/OFF action sequence recording...............................................");
            writer.println("TIME_TRACK    = [" + timeTrack + "] # 1-10 Select the time recording track to be recorded in or played......................");
            writer.println("LOOP_REPEAT   = [" + (loopRepeat ? "ON" : "OFF") + "] # SINGLE or REPEAT when playing the recorded actions..................................");
            writer.println("WALLPAPER     = [" + wallpaper + "] # 1 when dark_font is off; 2 when dark_font is on........................................");
            writer.println("WIRELESS_dB   = [" + wirelessDb + "] # Wireless power 0:12dBm 1:10dBm 2:9dBm 3:8dBm 4:6dBm 5:3dBm 6:0dBm 7:-2dBm 8:-5dBm .....");
            writer.println("9:-10dBm 10:-15dBm 11:-20dBm 12:-25dBm 13:-30dBm 14:-25dBm ..................................................");
            writer.println();
            writer.println("# ! Do not change anything other than inside the []");
        }
    }
} 