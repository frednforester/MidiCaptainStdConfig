package com.midicap.midicap.controller;

import com.midicap.midicap.KeyConfiguration;
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
@RequestMapping("/keys")
public class KeyConfigurationController {

    @GetMapping
    public String showKey0Form(Model model) {
        KeyConfiguration key0 = new KeyConfiguration();
        model.addAttribute("key0", key0);
        model.addAttribute("title", "Key Configuration");
        return "keys";
    }

    @PostMapping("/generate")
    public void generateKey0File(
            @RequestParam("keyId") int keyId,
            @RequestParam("keyColorOverwrite") boolean keyColorOverwrite,
            @RequestParam("keyColorUser") String keyColorUser,
            @RequestParam("keyPressEnable") boolean keyPressEnable,
            @RequestParam("keyPressMode") int keyPressMode,
            @RequestParam("keyPressPcMode") int keyPressPcMode,
            @RequestParam("keyPressPcFixed") int keyPressPcFixed,
            @RequestParam("keyPressCcNumber") int keyPressCcNumber,
            @RequestParam("keyPressCcValue") int keyPressCcValue,
            @RequestParam("keyPressCcScene") boolean keyPressCcScene,
            @RequestParam("keyPressCcTap") boolean keyPressCcTap,
            @RequestParam("keyPressCcToggle") boolean keyPressCcToggle,
            @RequestParam("keyPressNoteNumber") int keyPressNoteNumber,
            @RequestParam("keyPressNoteStrike") int keyPressNoteStrike,
            @RequestParam("keyReleaseEnable") boolean keyReleaseEnable,
            @RequestParam("keyReleaseMode") int keyReleaseMode,
            @RequestParam("keyReleasePcMode") int keyReleasePcMode,
            @RequestParam("keyReleasePcFixed") int keyReleasePcFixed,
            @RequestParam("keyReleaseCcNumber") int keyReleaseCcNumber,
            @RequestParam("keyReleaseCcValue") int keyReleaseCcValue,
            @RequestParam("keyReleaseCcToggle") boolean keyReleaseCcToggle,
            @RequestParam("keyReleaseNoteNumber") int keyReleaseNoteNumber,
            @RequestParam("keyReleaseNoteStrike") int keyReleaseNoteStrike,
            HttpServletResponse response) throws IOException {

        // Set response headers for file download
        response.setContentType("text/plain");
        response.setHeader("Content-Disposition", "attachment; filename=\"key" + keyId + ".txt\"");
        response.setCharacterEncoding("UTF-8");

        try (PrintWriter writer = response.getWriter()) {
            writer.println("# See below default mapping of the key# and the ID position");
            writer.println("# key1 (ID:0)----key2 (ID:1)----key3 (ID:2)----key4 (ID:3)----key5 (ID:4)");
            writer.println("# keyA (ID:5)----keyB (ID:6)----keyC (ID:7)----keyD (ID:8)----keyE (ID:9)");
            writer.println();
            writer.println("Key_ID                = [" + keyId + "] # Quick way to change or swap key positions");
            writer.println("Key_Color_Overwrite   = [" + (keyColorOverwrite ? "1" : "0") + "] # 0:Disable   1:Enable");
            writer.println("Key_Color_User        = [" + keyColorUser + "]");
            writer.println();
            writer.println("# Settings for all press-down actions");
            writer.println();
            writer.println("Key_Press_Eable       = [" + (keyPressEnable ? "1" : "0") + "] # 0:Disable   1:Enable");
            writer.println("Key_Press_MODE        = [" + keyPressMode + "] # 0:PC        1:CC       2:NOTE      3:UP     4:DOWN");
            writer.println("Key_Press_PC_MODE     = [" + keyPressPcMode + "] # 0:AUTO      1:FIXED");
            writer.println("Key_Press_PC_FIXED    = [" + keyPressPcFixed + "] # 0-127 FIXED VALUE");
            writer.println("Key_Press_CC_NUMBER   = [" + keyPressCcNumber + "] # 0-127");
            writer.println("Key_Press_CC_VALUE    = [" + keyPressCcValue + "] # 0-127");
            writer.println("Key_Press_CC_SCENE    = [" + (keyPressCcScene ? "1" : "0") + "] # 0: OFF      1:ON  Control the LED work as scene control");
            writer.println("Key_Press_CC_TAP      = [" + (keyPressCcTap ? "1" : "0") + "] # 0: OFF      1:ON  Enable when the key is for TAP using");
            writer.println("Key_Press_CC_TOGGLE   = [" + (keyPressCcToggle ? "1" : "0") + "] # 0:OFF       1:ON  Auto toggle between SubNum and 0");
            writer.println("Key_Press_NOTE_NUMBER = [" + keyPressNoteNumber + "] # 0-127 Please refer to the note table at the end");
            writer.println("Key_Press_NOTE_STRIKE = [" + keyPressNoteStrike + "] # 0-127 Note loudness");
            writer.println();
            writer.println("# Settings for all release-up actions (For \"moment\" function the \"Release\" action must be enabled)");
            writer.println();
            writer.println("Key_Release_Eable       = [" + (keyReleaseEnable ? "1" : "0") + "] # 0:Disable   1:Enable");
            writer.println("Key_Release_MODE        = [" + keyReleaseMode + "] # 0:PC        1:CC       2:NOTE      3:UP     4:DOWN");
            writer.println("Key_Release_PC_MODE     = [" + keyReleasePcMode + "] # 0:AUTO      1:FIXED");
            writer.println("Key_Release_PC_FIXED    = [" + keyReleasePcFixed + "] # 0-127 FIXED VALUE");
            writer.println("Key_Release_CC_NUMBER   = [" + keyReleaseCcNumber + "] # 0-127");
            writer.println("Key_Release_CC_VALUE    = [" + keyReleaseCcValue + "] # 0-127");
            writer.println("Key_Release_CC_TOGGLE   = [" + (keyReleaseCcToggle ? "1" : "0") + "] # 0:OFF       1:ON  Auto toggle between SubNum and 0");
            writer.println("Key_Release_NOTE_NUMBER = [" + keyReleaseNoteNumber + "] # 0-127 Please refer to the following note table");
            writer.println("Key_Release_NOTE_STRIKE = [" + keyReleaseNoteStrike + "] # 0-127 Note loudness");
            writer.println();
            writer.println("# MIDI NOTE TABLE");
            writer.println("Octave\tC\tC#\tD\tD#\tE \tF \tF#\tG \tG#\tA \tA#\tB");
            writer.println("\t0 \t0 \t1 \t2 \t3 \t4 \t5 \t6 \t7 \t8 \t9 \t10 \t11 \t");
            writer.println("\t1 \t12 \t13 \t14 \t15 \t16 \t17 \t18 \t19 \t20 \t21 \t22 \t23");
            writer.println("\t2 \t24 \t25 \t26 \t27 \t28 \t29 \t30 \t31 \t32 \t33 \t34 \t35");
            writer.println("\t3 \t36 \t37 \t38 \t39 \t40 \t41 \t42 \t43 \t44 \t45 \t46 \t47");
            writer.println("\t4 \t48 \t49 \t50 \t51 \t52 \t53 \t54 \t55 \t56 \t57 \t58 \t59");
            writer.println("\t5 \t60 \t61 \t62 \t63 \t64 \t65 \t66 \t67 \t68 \t69 \t70 \t71");
            writer.println("\t6 \t72 \t73 \t74 \t75 \t76 \t77 \t78 \t79 \t80 \t81 \t82 \t83");
            writer.println("\t7 \t84 \t85 \t86 \t87 \t88 \t89 \t90 \t91 \t92 \t93 \t94 \t95");
            writer.println("\t8 \t96 \t97 \t98 \t99 \t100\t101\t102\t103\t104\t105\t106\t107");
            writer.println("\t9 \t108\t109\t110\t111\t112\t113\t114\t115\t116\t117\t118\t119");
            writer.println("\t10 \t120\t121\t122\t123\t124\t125\t126\t127");
        }
    }
} 